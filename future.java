import java.util.ArrayList;
class present {
   protected  int card;
   protected ArrayList<String> majorArcanafuture;

    present(int card){
        this.card=card;
        majorArcanafuture = new ArrayList<>();
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
  

    }
    String nama(int card){
        return majorArcanafuture.get(card);
    }
}
