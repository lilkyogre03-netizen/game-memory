import java.util.ArrayList;
class past {
   protected  int card;
   protected ArrayList<String> majorArcanapast;

    past(int card){
        this.card=card;
        majorArcanapast = new ArrayList<>();
        
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
    }
    String nama(int card){
        


        return majorArcanapast.get(card);
    }
}
