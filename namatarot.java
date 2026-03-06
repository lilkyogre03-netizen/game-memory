import java.util.ArrayList;
class namatarot{
   protected  int card;
   protected ArrayList<String> NAMAARCANA;

    namatarot(int card){
        this.card=card;
        NAMAARCANA = new ArrayList<>();
    }
    String nama(int card){
        

        NAMAARCANA.add("THE FOOL");
        NAMAARCANA.add("THE MAGICIAN");
        NAMAARCANA.add("THE HIGH PRIESTES");
        NAMAARCANA.add("THE EMPRESS");
        NAMAARCANA.add("THE EMPEROR");
        NAMAARCANA.add("THE HIEROPHANT");
        NAMAARCANA.add("THE LOVERS");
        NAMAARCANA.add("THE CHARIOT");
        NAMAARCANA.add("THE STRENGTH");
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
    

        return NAMAARCANA.get(card);
    }
}
