import java.util.Scanner;
import java.sql.Array;
import java.util.Random;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
        ArrayList<String> majorArcanapast = new ArrayList<>();
        ArrayList<String> majorArcanapresent = new ArrayList<>();
        ArrayList<String> majorArcanafuture = new ArrayList<>();
        ArrayList<String> NAMAARCANA = new ArrayList<>();
        ArrayList<Integer> used = new ArrayList<>();
       
      // NAMA ARCANA
        NAMAARCANA.add("THE FOOL");
        NAMAARCANA.add("THE MAGICIAN");
        NAMAARCANA.add("THE HIGH PRIESTESS");
        NAMAARCANA.add("THE EMPRESS");
        NAMAARCANA.add("THE EMPEROR");
        NAMAARCANA.add("THE HIEROPHANT");
        NAMAARCANA.add("THE LOVERS");
        NAMAARCANA.add("THE CHARIOT");
        NAMAARCANA.add("STRENGTH");
        NAMAARCANA.add("THE HERMIT");
        NAMAARCANA.add("WHEEL OF FORTUNE");
        NAMAARCANA.add("JUSTICE");
        NAMAARCANA.add("THE HANGED MAN");
        NAMAARCANA.add("DEATH");
        NAMAARCANA.add("TEMPERANCE");
        NAMAARCANA.add("THE DEVIL");
        NAMAARCANA.add("THE TOWER");
        NAMAARCANA.add("THE STAR");
        NAMAARCANA.add("THE MOON");
        NAMAARCANA.add("THE SUN");
        NAMAARCANA.add("JUDGEMENT");
        NAMAARCANA.add("THE WORLD");
        NAMAARCANA.add("THE FOOL REVERSED");
        NAMAARCANA.add("THE MAGICIAN REVERSED");
        NAMAARCANA.add("THE HIGH PRIESTESS REVERSED");
        NAMAARCANA.add("THE EMPRESS REVERSED");
        NAMAARCANA.add("THE EMPEROR REVERSED");
        NAMAARCANA.add("THE HIEROPHANT REVERSED");
        NAMAARCANA.add("THE LOVERS REVERSED");
        NAMAARCANA.add("THE CHARIOT REVERSED");
        NAMAARCANA.add("STRENGTH REVERSED");
        NAMAARCANA.add("THE HERMIT REVERSED");
        NAMAARCANA.add("WHEEL OF FORTUNE REVERSED");
        NAMAARCANA.add("JUSTICE REVERSED");
        NAMAARCANA.add("THE HANGED MAN REVERSED");
        NAMAARCANA.add("DEATH REVERSED");
        NAMAARCANA.add("TEMPERANCE REVERSED");
        NAMAARCANA.add("THE DEVIL REVERSED");
        NAMAARCANA.add("THE TOWER REVERSED");
        NAMAARCANA.add("THE STAR REVERSED");
        NAMAARCANA.add("THE MOON REVERSED");
        NAMAARCANA.add("THE SUN REVERSED");
        NAMAARCANA.add("JUDGEMENT REVERSED");
        NAMAARCANA.add("THE WORLD REVERSED");
            
        // PAST CARD
        majorArcanapast.add("kepolosanmu saat memulai tanpa rasa takut"); // THE FOOL
        majorArcanapast.add("saat kamu menyadari semua alat sudah ada di tanganmu"); // THE MAGICIAN
        majorArcanapast.add("rahasia batin yang selama ini kamu simpan sendiri"); // THE HIGH PRIESTESS
        majorArcanapast.add("kenyamanan hangat yang pernah memeluk hari-harimu"); // THE EMPRESS
        majorArcanapast.add("kedisiplinan keras yang membentuk dirimu yang sekarang"); // THE EMPEROR
        majorArcanapast.add("suara bijak yang dulu menuntun setiap keputusanmu"); // THE HIEROPHANT
        majorArcanapast.add("janji setia yang pernah mengikat dua dunia"); // THE LOVERS
        majorArcanapast.add("ambisi besar yang memaksamu terus berlari"); // THE CHARIOT
        majorArcanapast.add("keberanianmu menghadapi ketakutan terbesar dalam diri"); // STRENGTH
        majorArcanapast.add("malam-malam sepi saat kamu hanya bicara dengan diri sendiri"); // THE HERMIT
        majorArcanapast.add("saat nasib memaksamu berputar ke arah yang tak diduga"); // WHEEL OF FORTUNE
        majorArcanapast.add("kebenaran pahit yang akhirnya harus kamu akui"); // JUSTICE
        majorArcanapast.add("saat kamu memilih berhenti dan merelakan segalanya"); // THE HANGED MAN
        majorArcanapast.add("gugurnya masa lalu yang memberi ruang untuk napas baru"); // DEATH
        majorArcanapast.add("perlahan-lahan kamu belajar menyatukan kepingan yang pecah"); // TEMPERANCE
        majorArcanapast.add("belenggu nafsu yang sempat membuatmu kehilangan arah"); // THE DEVIL
        majorArcanapast.add("goncangan hebat yang meruntuhkan istana ilusimu"); // THE TOWER
        majorArcanapast.add("doa-doa tulus yang kamu panjatkan di tengah kegelapan"); // THE STAR
        majorArcanapast.add("keraguan yang sempat membuatmu tersesat dalam mimpi"); // THE MOON
        majorArcanapast.add("puncak kebahagiaan yang pernah menyinari duniamu"); // THE SUN
        majorArcanapast.add("panggilan jiwa yang akhirnya memintamu untuk bangun"); // JUDGEMENT
        majorArcanapast.add("akhir sebuah perjalanan yang membuatmu merasa utuh"); // THE WORLD
        majorArcanapast.add("kecerobohan yang dulu membuat langkahmu goyah"); // THE FOOL REVERSED
        majorArcanapast.add("potensi besar yang sempat kamu sia-siakan"); // THE MAGICIAN REVERSED
        majorArcanapast.add("intuisi yang dulu kamu abaikan meski sudah berbisik"); // THE HIGH PRIESTESS REVERSED
        majorArcanapast.add("kasih yang pernah terasa hampa dan tak terbalas"); // THE EMPRESS REVERSED
        majorArcanapast.add("kekuasaan keras yang pernah menekan kebebasanmu"); // THE EMPEROR REVERSED
        majorArcanapast.add("aturan lama yang pernah membelenggu keyakinanmu"); // THE HIEROPHANT REVERSED
        majorArcanapast.add("hubungan yang dulu retak karena pilihan yang keliru"); // THE LOVERS REVERSED
        majorArcanapast.add("arah hidup yang dulu sempat kehilangan kendali"); // THE CHARIOT REVERSED
        majorArcanapast.add("keraguan diri yang pernah melemahkan keberanianmu"); // STRENGTH REVERSED
        majorArcanapast.add("kesendirian yang dulu terasa lebih seperti pelarian"); // THE HERMIT REVERSED
        majorArcanapast.add("nasib yang sempat terasa berputar melawanmu"); // WHEEL OF FORTUNE REVERSED
        majorArcanapast.add("ketidakadilan yang pernah meninggalkan luka"); // JUSTICE REVERSED
        majorArcanapast.add("pengorbanan sia-sia yang dulu terasa tak berarti"); // THE HANGED MAN REVERSED
        majorArcanapast.add("ketakutanmu melepas masa lalu yang sudah mati"); // DEATH REVERSED
        majorArcanapast.add("ketidakseimbangan yang pernah mengacaukan hidupmu"); // TEMPERANCE REVERSED
        majorArcanapast.add("godaan gelap yang sempat mengikat jiwamu"); // THE DEVIL REVERSED
        majorArcanapast.add("keruntuhan yang dulu kamu coba sangkal"); // THE TOWER REVERSED
        majorArcanapast.add("harapan yang dulu sempat padam di langit malam"); // THE STAR REVERSED
        majorArcanapast.add("ilusi yang pernah membuatmu berjalan dalam kabut"); // THE MOON REVERSED
        majorArcanapast.add("cahaya bahagia yang dulu terasa redup"); // THE SUN REVERSED
        majorArcanapast.add("panggilan jiwa yang dulu kamu abaikan"); // JUDGEMENT REVERSED
        majorArcanapast.add("akhir perjalanan yang terasa belum benar-benar selesai"); // THE WORLD REVERSED


        // PRESENT CARD 
        majorArcanapresent.add("langkah berani di tepi jurang ketidaktahuan"); // THE FOOL
        majorArcanapresent.add("kemampuanmu yang sedang memuncak untuk mencipta"); // THE MAGICIAN
        majorArcanapresent.add("hening yang sedang membisikkan jawaban terjujur"); // THE HIGH PRIESTESS
        majorArcanapresent.add("proses pembuahan ide yang kian subur dan nyata"); // THE EMPRESS
        majorArcanapresent.add("tanggung jawab besar yang kini menguji ketegasanmu"); // THE EMPEROR
        majorArcanapresent.add("pencarian nilai di balik struktur yang mengekang"); // THE HIEROPHANT
        majorArcanapresent.add("pilihan hati yang sedang menuntut komitmen penuh"); // THE LOVERS
        majorArcanapresent.add("kendali keras yang kau pegang di tengah laju hidup"); // THE CHARIOT
        majorArcanapresent.add("kelembutan batin yang sedang menjinakkan amarah"); // STRENGTH
        majorArcanapresent.add("dialog sunyi dengan diri di tengah bisingnya dunia"); // THE HERMIT
        majorArcanapresent.add("pusaran takdir yang sedang memutar arah hidupmu"); // WHEEL OF FORTUNE
        majorArcanapresent.add("timbangan batin yang sedang mencari titik tegak"); // JUSTICE
        majorArcanapresent.add("masa jeda untuk melihat dunia secara terbalik"); // THE HANGED MAN
        majorArcanapresent.add("proses melepas kulit lama yang mulai terasa sesak"); // DEATH
        majorArcanapresent.add("seni meracik harmoni di tengah kekacauan rasa"); // TEMPERANCE
        majorArcanapresent.add("jeratan candu atau bayang-bayang yang menggodamu"); // THE DEVIL
        majorArcanapresent.add("runtuhnya dinding ilusi yang memaksamu melihat nyata"); // THE TOWER
        majorArcanapresent.add("cahaya pemulihan yang perlahan menyentuh lukamu"); // THE STAR
        majorArcanapresent.add("kabut keraguan yang sedang menyelimuti pandangan"); // THE MOON
        majorArcanapresent.add("kejujuran murni yang sedang menerangi segalanya"); // THE SUN
        majorArcanapresent.add("gema panggilan jiwa yang memintamu segera bangun"); // JUDGEMENT
        majorArcanapresent.add("perasaan utuh di mana semua kepingan mulai menyatu"); // THE WORLD
         majorArcanapresent.add("keraguan yang membuat langkahmu tertahan"); // THE FOOL REVERSED
        majorArcanapresent.add("energi kreatif yang kini terasa terhambat"); // THE MAGICIAN REVERSED
        majorArcanapresent.add("bisikan batin yang kini sulit kamu dengar"); // THE HIGH PRIESTESS REVERSED
        majorArcanapresent.add("kekosongan yang muncul di tengah kenyamanan"); // THE EMPRESS REVERSED
        majorArcanapresent.add("kendali yang kini terasa rapuh di tanganmu"); // THE EMPEROR REVERSED
        majorArcanapresent.add("pencarian makna di balik aturan yang terasa mengekang"); // THE HIEROPHANT REVERSED
        majorArcanapresent.add("ketidakharmonisan yang sedang menguji ikatan hati"); // THE LOVERS REVERSED
        majorArcanapresent.add("arah yang kini terasa kacau di tengah perjalanan"); // THE CHARIOT REVERSED
        majorArcanapresent.add("kepercayaan diri yang sedang berusaha bangkit kembali"); // STRENGTH REVERSED
        majorArcanapresent.add("kesunyian yang kini terasa lebih berat dari biasanya"); // THE HERMIT REVERSED
        majorArcanapresent.add("putaran nasib yang terasa tertahan"); // WHEEL OF FORTUNE REVERSED
        majorArcanapresent.add("ketidakjelasan yang membuat keadilan terasa jauh"); // JUSTICE REVERSED
        majorArcanapresent.add("keengganan untuk melihat dunia dari sudut pandang baru"); // THE HANGED MAN REVERSED
        majorArcanapresent.add("perubahan yang kamu coba tunda meski sudah mendekat"); // DEATH REVERSED
        majorArcanapresent.add("ketidakseimbangan yang sedang mengguncang harmoni"); // TEMPERANCE REVERSED
        majorArcanapresent.add("rantai lama yang masih mencoba menahan langkahmu"); // THE DEVIL REVERSED
        majorArcanapresent.add("ketakutan akan runtuhnya sesuatu yang kamu bangun"); // THE TOWER REVERSED
        majorArcanapresent.add("keraguan yang kini menyelimuti harapanmu"); // THE STAR REVERSED
        majorArcanapresent.add("bayangan ilusi yang masih menari di pikiranmu"); // THE MOON REVERSED
        majorArcanapresent.add("kecerahan yang terasa tertutup awan tipis"); // THE SUN REVERSED
        majorArcanapresent.add("gema panggilan jiwa yang masih kamu tunda"); // JUDGEMENT REVERSED
        majorArcanapresent.add("kepingan hidup yang terasa belum benar-benar menyatu"); // THE WORLD REVERSED
        
        // FUTURE
        majorArcanafuture.add("pintu tak dikenal yang akan segera terbuka"); // THE FOOL
        majorArcanafuture.add("momen ketika semua rencana akan menjadi nyata"); // THE MAGICIAN
        majorArcanafuture.add("rahasia besar yang akan segera terungkap"); // THE HIGH PRIESTESS
        majorArcanafuture.add("musim panen atas segala yang kau tanam"); // THE EMPRESS
        majorArcanafuture.add("puncak otoritas yang akan kau genggam erat"); // THE EMPEROR
        majorArcanafuture.add("tuntunan bijak yang akan segera kau temukan"); // THE HIEROPHANT
        majorArcanafuture.add("pertemuan jiwa yang akan menguji ketulusanmu"); // THE LOVERS
        majorArcanafuture.add("kemenangan mutlak yang akan kau rebut"); // THE CHARIOT
        majorArcanafuture.add("kekuatan batin yang akan segera kau buktikan"); // STRENGTH
        majorArcanafuture.add("pencarian jawaban yang akan membawamu pulang"); // THE HERMIT
        majorArcanafuture.add("kejutan nasib yang akan mengubah garis hidupmu"); // WHEEL OF FORTUNE
        majorArcanafuture.add("keadilan yang akan segera menemukan jalannya"); // JUSTICE
        majorArcanafuture.add("sudut pandang baru yang akan membebaskanmu"); // THE HANGED MAN
        majorArcanafuture.add("perubahan besar yang akan melahirkan dirimu yang baru"); // DEATH
        majorArcanafuture.add("kedamaian murni yang akan segera kau rasakan"); // TEMPERANCE
        majorArcanafuture.add("godaan besar yang akan menguji kemandirianmu"); // THE DEVIL
        majorArcanafuture.add("guncangan mendadak yang akan membersihkan jalanmu"); // THE TOWER
        majorArcanafuture.add("bintang penuntun yang akan menghapus keraguanmu"); // THE STAR
        majorArcanafuture.add("petualangan di balik kabut yang penuh misteri"); // THE MOON
        majorArcanafuture.add("fajar kemenangan yang akan segera menyinari harimu"); // THE SUN
        majorArcanafuture.add("panggilan takdir yang takkan bisa kau abaikan"); // JUDGEMENT
        majorArcanafuture.add("pencapaian tertinggi yang akan melengkapi jiwamu"); // THE WORLD
        majorArcanafuture.add("risiko yang bisa muncul jika langkah diambil tanpa arah"); // THE FOOL REVERSED
        majorArcanafuture.add("kesempatan yang bisa hilang jika potensi tak digunakan"); // THE MAGICIAN REVERSED
        majorArcanafuture.add("kebingungan yang akan muncul jika intuisi diabaikan"); // THE HIGH PRIESTESS REVERSED
        majorArcanafuture.add("kekeringan rasa jika keseimbangan tak dijaga"); // THE EMPRESS REVERSED
        majorArcanafuture.add("kekuasaan rapuh yang bisa runtuh tanpa kebijaksanaan"); // THE EMPEROR REVERSED
        majorArcanafuture.add("jalan baru yang menantang tradisi lama"); // THE HIEROPHANT REVERSED
        majorArcanafuture.add("perpisahan yang bisa terjadi jika hati tak sejalan"); // THE LOVERS REVERSED
        majorArcanafuture.add("perjalanan yang bisa tersesat tanpa kendali diri"); // THE CHARIOT REVERSED
        majorArcanafuture.add("tantangan yang akan menguji keberanian batinmu"); // STRENGTH REVERSED
        majorArcanafuture.add("kesepian yang akan mengajarkan arti kebersamaan"); // THE HERMIT REVERSED
        majorArcanafuture.add("nasib yang tampak tertahan sebelum kembali berputar"); // WHEEL OF FORTUNE REVERSED
        majorArcanafuture.add("kebenaran yang akan muncul meski terlambat"); // JUSTICE REVERSED
        majorArcanafuture.add("kebebasan yang hanya datang jika sudut pandang berubah"); // THE HANGED MAN REVERSED
        majorArcanafuture.add("perubahan yang tak bisa dihindari meski ditunda"); // DEATH REVERSED
        majorArcanafuture.add("harmoni yang akan datang setelah kekacauan mereda"); // TEMPERANCE REVERSED
        majorArcanafuture.add("kebebasan dari belenggu lama yang akhirnya terlepas"); // THE DEVIL REVERSED
        majorArcanafuture.add("runtuhnya ilusi yang selama ini menutup jalanmu"); // THE TOWER REVERSED
        majorArcanafuture.add("harapan baru yang perlahan kembali menyala"); // THE STAR REVERSED
        majorArcanafuture.add("kabut yang akhirnya tersibak oleh cahaya kebenaran"); // THE MOON REVERSED
        majorArcanafuture.add("kebahagiaan yang datang setelah masa redup berlalu"); // THE SUN REVERSED
        majorArcanafuture.add("kesempatan kedua yang akan mengetuk pintumu"); // JUDGEMENT REVERSED
        majorArcanafuture.add("perjalanan yang akhirnya selesai meski tertunda"); // THE WORLD REVERSED    
        Random r= new Random();
        Random r = new Random();
         
        int satu = 1;
        int dua = 1;
        int tiga = 1;     
        System.out.println("Selamat datang di Ramalan Kartu Karot");
        System.out.println("Sekarang saya ada 22 kartu dan anda akan memilih 1 masing - masing dari setiap jenis kartu \nApa yang mau anda lihat? \n1. Masa lalu\n2. Masa kini\n3. Masa depan?");
    
    do{
 
        int pilihan = input.nextInt();
        
        switch (pilihan) {  
            case 1:
                int randomPast;
                 if(satu == 0){
                System.out.println("Kartu masa lalu sudah diambil!");
                break;
            }
                do {
                    randomPast = r.nextInt(44);
                }while (used.contains(randomPast));
                used.add(randomPast);
                System.out.println("MASA LALU MU MENGATAKAN :");
                artitarot a= new artitarot(NAMAARCANA.get(randomPast),majorArcanapast.get(randomPast));
                a.showkartu();
                satu--;
                
                break;
            case 2:
                int randomPresent;
                if(dua == 0){
                System.out.println("Kartu masa kini sudah diambil!");
                break;
            }
                do {
                    randomPresent = r.nextInt(44);
                }while (used.contains(randomPresent));
                used.add(randomPresent);
                System.out.println("MASA KINI MU MENGATAKAN");
                artitarot b= new artitarot(NAMAARCANA.get(randomPresent),majorArcanapresent.get(randomPresent));
                b.showkartu();
                dua--;
                
                break;
            case 3:
                int randomFuture;
                if(tiga == 0){
                System.out.println("Kartu masa depan sudah diambil!");
                break;
            }
                do {
                    randomFuture = r.nextInt(44);
                }while (used.contains(randomFuture));
                used.add(randomFuture);
                System.out.println("MASA DEPAN MU MENGATAKAN");
                artitarot c= new artitarot(NAMAARCANA.get(randomFuture),majorArcanafuture.get(randomFuture));
                c.showkartu();
                tiga--;

                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
            
    }while (satu == 1 || dua == 1 || tiga == 1); 
    System.out.println("MWEHEHEHE BAGAIMANA ? TERSERAH PADAMU UNTUK PERCAYA ATAU TIDAK");
        
   
  
    }
}
