import java.util.Scanner;
import java.sql.Array;
import java.util.Random;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      
        ArrayList<Integer> used = new ArrayList<>();
       
        
        Random r= new Random();
        
         
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
                namatarot q=new namatarot(randomPast);
                past p =new past( randomPast);
                gambartarot g=new gambartarot(q.nama(randomPast));
                artitarot a= new artitarot(q.nama(randomPast),p.nama(randomPast));
                g.showkartu();
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
                namatarot   qq =new namatarot(randomPresent);
                gambartarot gg=new gambartarot(qq.nama(randomPresent));
                past        pp =new past( randomPresent);
                artitarot b= new artitarot(qq.nama(randomPresent),pp.nama(randomPresent));
                gg.showkartu();
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
                namatarot qqq=new namatarot(randomFuture);
                past ppp =new past( randomFuture);
                gambartarot ggg=new gambartarot(qqq.nama(randomFuture));
                artitarot c= new artitarot(qqq.nama(randomFuture),ppp.nama(randomFuture));
                ggg.showkartu();
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
