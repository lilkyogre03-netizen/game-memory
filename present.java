import java.util.ArrayList;
class present {
   protected  int card;
   protected ArrayList<String> majorArcanapresent;

    present(int card){
        this.card=card;
        majorArcanapresent = new ArrayList<>();
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

  
    }
    String nama(int card){
        return majorArcanapresent.get(card);
    }
}
