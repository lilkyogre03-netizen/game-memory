package tile;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import MAIN.UI;

public class TileManager {
    UI gp;
    public TILE[] tile;
    public int mapTileNum[][];

    public TileManager(UI gp) {
        this.gp = gp;

        tile = new TILE[10];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("/maps/map02.txt");
    }

    public void getTileImage() {

        try {

            tile[0] = new TILE();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));

            tile[1] = new TILE();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));
            tile[1].colliaion = true;

            tile[2] = new TILE();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/air.png"));

            tile[3] = new TILE();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree.png"));

            tile[4] = new TILE();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/path.png"));

            tile[5] = new TILE();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/kayu.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void loadMap(String filePath) {
        try {
            InputStream is = getClass().getResourceAsStream(filePath);

           
            if (is == null) {
                System.out.println("ERROR: Map file tidak ditemukan: " + filePath);
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

                String line = br.readLine();

                if (line == null) {
                    System.out.println("WARNING: Peta terlalu pendek. Baris " + row
                            + " tidak ada, diharapkan " + gp.maxWorldRow + " baris.");
                    break;
                }

                while (col < gp.maxWorldCol) {

                    String numbers[] = line.split(" ");

                    if (col >= numbers.length) {
                        System.out.println("WARNING: Baris " + row + " hanya punya "
                                + numbers.length + " kolom, diharapkan " + gp.maxWorldCol);
                        break;
                    }

                    int num = Integer.parseInt(numbers[col].trim());


                    if (num < 0 || num >= tile.length || tile[num] == null) {
                        System.out.println("WARNING: Tile number " + num + " tidak valid di ["
                                + col + "][" + row + "], diganti 0");
                        num = 0;
                    }

                    mapTileNum[col][row] = num;
                    col++;
                }

                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            br.close();

        } catch (Exception e) {

            System.out.println("ERROR saat memuat peta: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

 
                if (tileNum >= 0 && tileNum < tile.length && tile[tileNum] != null) {
                    g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
                }
            }

            worldCol++;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }
}
