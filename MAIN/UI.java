package MAIN;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.imageio.ImageIO;

import ENTITY.Player;
import ENTITY.entity;
import tile.TileManager;

import TAROT.future;
import TAROT.present;
import TAROT.past;
import TAROT.namatarot;

public class UI extends JPanel implements Runnable {

    // Tarot States & Data
    public static final int TAROT_NONE        = 0;
    public static final int TAROT_CHOOSE_TIME = 1;
    public static final int TAROT_CHOOSE_CARD = 2;
    public static final int TAROT_SHOW_RESULT = 3;

    public int tarotPhase = TAROT_NONE;
    public int selectedTimeIndex = -1;
    public int[] tarotCardIndexes  = new int[3];
    public boolean[] tarotCardRevealed = new boolean[3];
    public String[] cardNames    = new String[3];
    public String[] cardMeanings = new String[3];
    public int cardsFlipped = 0;

    public String[] tarotTimes = {"FUTURE", "PRESENT", "PAST"};
    BufferedImage[] tarotImages = new BufferedImage[22];

    // Game States
    public final int titleState = 0, playState = 1, nameInputState = 2;
    public int gameState;
    public String playerName = "";

    // Screen
    final int originalTileSize = 20, scale = 3;
    public final int tileSize       = originalTileSize * scale;
    public final int maxScreenCol   = 16, maxScreenRow = 12;
    public final int maxWorldCol    = 16, maxWorldRow  = 12;
    public final int screenWidth    = tileSize * maxScreenCol;
    public final int screenHeight   = tileSize * maxScreenRow;

    // Components
    int FPS = 60;
    TileManager tileM;
    KeyHandler keyH;
    DialogueManager dialogueM;
    Thread gameThread;
    public CollisionChecker cChecker;
    public Player player;
    public entity NPC[] = new entity[1];
    AssetSetter aSetter;
    JFrame window;

    BufferedImage TitleScreenImage, startButtonImage, exitButtonImage;
   
    BufferedImage nameInputBgImage;

    Rectangle startButtonRect, exitButtonRect;
    boolean startButtonHover = false, exitButtonHover = false;

    public UI() {
        keyH      = new KeyHandler();
        dialogueM = new DialogueManager(this);
        cChecker  = new CollisionChecker(this);
        player    = new Player(this, keyH);
        aSetter   = new AssetSetter(this);
        tileM     = new TileManager(this);

        loadTitleScreenImage();
        loadStartButtonImage();
        loadExitButtonImage();
        loadNameInputImage();  
        loadTarotImages();

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

        startButtonRect = new Rectangle(190, 280, 550, 125);
        exitButtonRect  = new Rectangle(190, 380, 550, 125);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (gameState == titleState) {
                    if (startButtonRect.contains(e.getPoint())) {
                        // FIX: Dulu langsung ke playState, melewati layar nama.
                        // Sekarang masuk ke nameInputState dulu.
                        gameState = nameInputState;
                    } else if (exitButtonRect.contains(e.getPoint())) {
                        System.exit(0);
                    }
                } else if (gameState == playState) {
                    if (tarotPhase != TAROT_NONE) handleTarotClick(e);
                    else if (getNearbyNPCIndex() != -1) startTarotSession();
                }
            }
        });

        
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (gameState == nameInputState) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER && playerName.length() > 0) {
                        gameState = playState;
                    } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && playerName.length() > 0) {
                        playerName = playerName.substring(0, playerName.length() - 1);
                        repaint();
                    }
                }
            }
            @Override
            public void keyTyped(KeyEvent e) {
                if (gameState == nameInputState) {
                    char c = e.getKeyChar();
                    if (playerName.length() < 15 && (Character.isLetterOrDigit(c) || c == ' ')) {
                        playerName += c;
                        repaint();
                    }
                }
            }
        });
    }

    public void loadTitleScreenImage() {
        try { TitleScreenImage = ImageIO.read(getClass().getResourceAsStream("/res/TittleScreen2.png")); }
        catch (Exception e) { e.printStackTrace(); }
    }
    public void loadStartButtonImage() {
        try { startButtonImage = ImageIO.read(getClass().getResourceAsStream("/res/Start4.png")); }
        catch (Exception e) { e.printStackTrace(); }
    }
    public void loadExitButtonImage() {
        try { exitButtonImage = ImageIO.read(getClass().getResourceAsStream("/res/Exit4.png")); }
        catch (Exception e) { e.printStackTrace(); }
    }

    // FIX: Method baru — load gambar background layar input nama
    public void loadNameInputImage() {
        try { nameInputBgImage = ImageIO.read(getClass().getResourceAsStream("/res/Masukkan Username.png")); }
        catch (Exception e) { e.printStackTrace(); }
    }

    public void loadTarotImages() {
        namatarot nt = new namatarot(0);
        try {
            for (int i = 0; i < 22; i++) {
                String cardName = nt.nama(i);


                String path;
                if (cardName.equals("THE STRENGTH")) {
                    path = "/res/The Strength - KartuTarot.png";
                } else if (cardName.equals("THE TOWER")) {
                    path = "/res/The Tower - KartuTarot.png";
                } else if (cardName.equals("THE SUN")) {
                    path = "/res/The Sun - KartuTarot.png";
                } else {
                    path = "/res/" + cardName + ".png";
                }

                java.io.InputStream is = getClass().getResourceAsStream(path);
                if (is != null) {
                    tarotImages[i] = ImageIO.read(is);
                } else {
                    System.out.println("Resource not found: " + path);
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void setupGUI() {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("TAROT GAME");
        window.add(this);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        this.requestFocusInWindow();
        startGameThread();
    }

    public void setupGame() { aSetter.setObject(); aSetter.setNPC(); gameState = titleState; }
    public void startGameThread() { gameThread = new Thread(this); gameThread.start(); }

    @Override
    public void run() {
        setupGame();
        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        while (gameThread != null) {
            long currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;
            if (delta >= 1) { update(); repaint(); delta--; }
        }
    }

    public void update() {
        if (gameState == titleState)     return;
        if (gameState == nameInputState) return;

        if (tarotPhase == TAROT_NONE) player.update();
        for (entity npc : NPC) { if (npc != null) npc.update(); }
        dialogueM.update();

        if (keyH.interactPressed) {
            if (getNearbyNPCIndex() != -1 && tarotPhase == TAROT_NONE) startTarotSession();
            keyH.interactPressed = false;
        }
    }

    private void startTarotSession() {
        tarotPhase  = TAROT_CHOOSE_TIME;
        cardsFlipped = 0;
        for (int i = 0; i < 3; i++) tarotCardRevealed[i] = false;
        dialogueM.showDialogue("Select your focus: Future, Present, or Past.");
    }

    private void handleTarotClick(MouseEvent e) {
        if (tarotPhase == TAROT_CHOOSE_TIME) {
            for (int i = 0; i < 3; i++) {
                if (getTarotTimeOptionRect(i).contains(e.getPoint())) {
                    startCardSelection(i);
                    return;
                }
            }
        } else if (tarotPhase == TAROT_CHOOSE_CARD) {
            for (int i = 0; i < 3; i++) {
                if (getTarotCardRect(i).contains(e.getPoint()) && !tarotCardRevealed[i]) {
                    tarotCardRevealed[i] = true;
                    cardsFlipped++;
                    if (cardsFlipped >= 3) tarotPhase = TAROT_SHOW_RESULT;
                    return;
                }
            }
        } else if (tarotPhase == TAROT_SHOW_RESULT) {
            tarotPhase = TAROT_NONE;
            dialogueM.showDialogue("The cards have spoken.");
        }
    }

    private void startCardSelection(int timeIndex) {
        selectedTimeIndex = timeIndex;
        tarotPhase = TAROT_CHOOSE_CARD;
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            tarotCardIndexes[i] = rand.nextInt(22);
            cardNames[i] = new namatarot(0).nama(tarotCardIndexes[i]);
            switch (timeIndex) {
                case 0: cardMeanings[i] = new future(0).nama(tarotCardIndexes[i]);  break;
                case 1: cardMeanings[i] = new present(0).nama(tarotCardIndexes[i]); break;
                case 2: cardMeanings[i] = new past(0).nama(tarotCardIndexes[i]);    break;
            }
        }
    }

    private int getNearbyNPCIndex() {
        Rectangle pRect = new Rectangle(
            player.worldX + player.solidArea.x - 10,
            player.worldY + player.solidArea.y - 10,
            player.solidArea.width  + 20,
            player.solidArea.height + 20
        );
        for (int i = 0; i < NPC.length; i++) {
            if (NPC[i] != null) {
                Rectangle nRect = new Rectangle(
                    NPC[i].worldX + NPC[i].solidArea.x,
                    NPC[i].worldY + NPC[i].solidArea.y,
                    NPC[i].solidArea.width,
                    NPC[i].solidArea.height
                );
                if (pRect.intersects(nRect)) return i;
            }
        }
        return -1;
    }

    private Rectangle getTarotTimeOptionRect(int i) {
        int w = 150, h = 50, sp = 20;
        return new Rectangle(((screenWidth - (w * 3 + sp * 2)) / 2) + i * (w + sp), 250, w, h);
    }

    private Rectangle getTarotCardRect(int i) {
        int w = 120, h = 180, sp = 30;
        return new Rectangle(((screenWidth - (w * 3 + sp * 2)) / 2) + i * (w + sp), 150, w, h);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        if (gameState == titleState) {
            drawTitleScreen(g2);
        } else if (gameState == nameInputState) {
            // FIX: Dulu nameInputState tidak pernah digambar sama sekali
            drawNameInputScreen(g2);
        } else {
            tileM.draw(g2);
            for (entity npc : NPC) if (npc != null) npc.draw(g2);
            player.draw(g2);
            dialogueM.draw(g2);
            if (tarotPhase != TAROT_NONE) drawTarotOverlay(g2);

            // FIX: Tampilkan nama player di pojok kiri atas
            if (playerName != null && !playerName.isEmpty()) {
                g2.setColor(Color.WHITE);
                g2.setFont(g2.getFont().deriveFont(Font.BOLD, 16f));
                g2.drawString("Player: " + playerName, 10, 20);
            }
        }
    }

 
    public void drawNameInputScreen(Graphics2D g2) {
        if (nameInputBgImage != null) {
            g2.drawImage(nameInputBgImage, 0, 0, screenWidth, screenHeight, null);
        } else {
            g2.setColor(new Color(20, 10, 40));
            g2.fillRect(0, 0, screenWidth, screenHeight);
        }

        // Kotak input
        int boxWidth = 400, boxHeight = 60;
        int boxX = (screenWidth - boxWidth) / 2;
        int boxY = screenHeight / 2 + 20;

        g2.setColor(new Color(0, 0, 0, 180));
        g2.fillRoundRect(boxX, boxY, boxWidth, boxHeight, 15, 15);
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2));
        g2.drawRoundRect(boxX, boxY, boxWidth, boxHeight, 15, 15);

        // Teks nama + kursor berkedip
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 22f));
        String display = playerName + (System.currentTimeMillis() % 1000 < 500 ? "|" : "");
        g2.drawString(display, boxX + 15, boxY + 40);

        // Instruksi
        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 14f));
        g2.setColor(new Color(200, 200, 200));
        g2.drawString("Tekan ENTER untuk mulai", (screenWidth - 180) / 2, boxY + 90);
    }

    private void drawTarotOverlay(Graphics2D g2) {
        g2.setColor(new Color(0, 0, 0, 220));
        g2.fillRect(0, 0, screenWidth, screenHeight);
        g2.setColor(new Color(25, 25, 45, 250));
        g2.fillRoundRect(40, 40, screenWidth - 80, screenHeight - 80, 25, 25);
        g2.setColor(Color.WHITE);
        g2.drawRoundRect(40, 40, screenWidth - 80, screenHeight - 80, 25, 25);

        if (tarotPhase == TAROT_CHOOSE_TIME) {
            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 20f)); 
            g2.drawString(playerName + ", which path do you seek?", 250, 150);
            for (int i = 0; i < 3; i++) {
                Rectangle r = getTarotTimeOptionRect(i);
                g2.setColor(new Color(50, 50, 90)); g2.fill(r);
                g2.setColor(Color.WHITE);            g2.draw(r);
                g2.drawString(tarotTimes[i], r.x + 35, r.y + 35);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                Rectangle r = getTarotCardRect(i);
                if (tarotCardRevealed[i]) {
                    if (tarotImages[tarotCardIndexes[i]] != null) {
                        g2.drawImage(tarotImages[tarotCardIndexes[i]], r.x, r.y, r.width, r.height, null);
                    } else {
                        g2.setColor(Color.WHITE); g2.fill(r);
                        g2.setColor(Color.BLACK); g2.drawString(cardNames[i], r.x + 5, r.y + 20);
                    }
                    // Nama kartu
                    g2.setColor(Color.YELLOW);
                    g2.setFont(g2.getFont().deriveFont(12f));
                    g2.drawString(cardNames[i], r.x, r.y + r.height + 20);
                    // FIX: Tampilkan makna kartu dengan word-wrap
                    g2.setColor(new Color(200, 200, 255));
                    g2.setFont(g2.getFont().deriveFont(10f));
                    drawWrappedString(g2, cardMeanings[i], r.x, r.y + r.height + 35, r.width + 20);
                } else {
                    g2.setColor(new Color(80, 30, 30)); g2.fill(r);
                    g2.setColor(Color.WHITE);            g2.draw(r);
                    g2.setFont(g2.getFont().deriveFont(40f));
                    g2.drawString("?", r.x + 45, r.y + 100);
                }
            }
            if (tarotPhase == TAROT_SHOW_RESULT) {
                g2.setFont(g2.getFont().deriveFont(16f));
                g2.setColor(Color.WHITE);
                g2.drawString("All cards revealed. Click to finish reading.", 280, 520);
            }
        }
    }


    private void drawWrappedString(Graphics2D g2, String text, int x, int y, int maxWidth) {
        if (text == null) return;
        FontMetrics fm = g2.getFontMetrics();
        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();
        int lineY = y;
        for (String word : words) {
            String test = line.length() == 0 ? word : line + " " + word;
            if (fm.stringWidth(test) > maxWidth) {
                g2.drawString(line.toString(), x, lineY);
                line = new StringBuilder(word);
                lineY += fm.getHeight();
            } else {
                line = new StringBuilder(test);
            }
        }
        if (line.length() > 0) g2.drawString(line.toString(), x, lineY);
    }

    public void drawTitleScreen(Graphics2D g2) {
        if (TitleScreenImage  != null) g2.drawImage(TitleScreenImage,  0, 0, screenWidth, screenHeight, null);
        if (startButtonImage  != null) g2.drawImage(startButtonImage,  startButtonRect.x, startButtonRect.y, startButtonRect.width, startButtonRect.height, null);
        if (exitButtonImage   != null) g2.drawImage(exitButtonImage,   exitButtonRect.x,  exitButtonRect.y,  exitButtonRect.width,  exitButtonRect.height,  null);
    }
}
