package kumanda;

public class Kumanda
{
  /*  1)TV ekraninin genisligini,
    yuksekligini ve ekran buyuklugunu
    ayarlayabildiginiz
2)kanal degistirebildiginiz;
    kapatip acabildiginiz;
3)ses azaltip artirabildiginiz ve
    bu artirmanin bir max.
    degerinin oldugu bir TV kumandasinin
    kodunu yaziniz.*/

    int[] ekranGenisligi={16,4};
    int[] ekranBuyuklugu={9,3};
    String[] kanalListesi={"Show","TV8","Cine5","Star"};
    boolean isTrue=false;
    int ses;
    int kanal;
    int index=0;

    public void acmakapama()
    {
       this.isTrue=!isTrue;
    }

    public void ekranBoyutu(int secim){
        if (secim==43)
        {
            System.out.println(ekranGenisligi[0]+":"+ekranBuyuklugu[0]);
        }
        else if (secim==45)
        {
            System.out.println(ekranGenisligi[1]+":"+ekranBuyuklugu[1]);
        }else System.out.println("Hatalı secim...");

    }
    public int sesArttir(int secim){
        if (secim==43)
        {
            return ++ses;
        }
        else if (secim==45)
        {
            return --ses;
        }

        return ses;

    }
    public String kanalDegistir(int secim){

        if (secim==43)
        {
            if (index!=kanalListesi.length-1)
            {
                return kanalListesi[++index];
            }else {
                index=0;
                return kanalListesi[index];
            }
        }
        else if (secim==45)
        {
            if (index!=0)
            {
                return kanalListesi[--index];
            }else {

                index=kanalListesi.length-1;
                return kanalListesi[index];
            }
        }else
        return kanalListesi[index];
    }


}
