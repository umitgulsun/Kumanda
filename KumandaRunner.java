package kumanda;

import java.util.Scanner;

public class KumandaRunner
{
   /* 1)TV ekraninin genisligini,
    yuksekligini ve ekran buyuklugunu
    ayarlayabildiginiz
2)kanal degistirebildiginiz;
    kapatip acabildiginiz;
3)ses azaltip artirabildiginiz ve
    bu artirmanin bir max.
    degerinin oldugu bir TV kumandasinin
    kodunu yaziniz.*/

    public static void main(String[] args)
    {
        Kumanda kumanda=new Kumanda();
        Scanner scan=new Scanner(System.in);
        int islem=0;
        char secim='h';
        boolean is=true;


        while (!kumanda.isTrue){

            System.out.println("Menuye tıklayın...\n'Ç' tusu ile menüye dönebilirsiniz...\n1-Sesi arttırın veya azaltın\n2-Kanaldegistir\n3-Ekran Boyutu ayarla\n4-Kapat");

                secim='h';
                islem= scan.nextInt();

                while (secim!='Ç'){
                    switch (islem){
                        case 1:
                            System.out.println("Sesi arttırmak için + eksiltmek için - tıklayın");
                            secim= scan.next().charAt(0);
                            System.out.println(kumanda.sesArttir(secim));
                            break;
                        case 2:
                            System.out.println("Kanalı ilerletmek için + eksiltmek için - tıklayın");
                            secim= scan.next().charAt(0);
                            System.out.println(kumanda.kanalDegistir(secim));
                            break;
                        case 3:
                            System.out.println("Ekran genişliği için + eksiltmek için - tıklayın");
                            secim= scan.next().charAt(0);
                            kumanda.ekranBoyutu(secim);
                            break;
                        case 4:
                            System.out.println("Cıkıs..");
                            kumanda.acmakapama();
                            break;
                        default:
                            System.out.println("hatalı giriş..");

                    }

                }





        }




    }


}
