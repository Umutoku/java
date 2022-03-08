package DaireAlanCevre;
import java.util.Scanner;



public class Dac {
    public static void main(String[] args) {
        double pi,r,cevre,alan,ac,dilimalani,dilimcevresi;
        Scanner girdi = new Scanner(System.in);
        pi =3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r=girdi.nextDouble();
        cevre=(2*pi*r);
        System.out.print(r+ "yarıçaplı dairenin çevresi: "+cevre);
        alan = (pi*r*r);
        System.out.print(r+ "yarıçaplı dairenin alanı: "+alan);
        System.out.print(r+"yarıçaplı daire için açı giriniz: ");
        ac =girdi.nextDouble();
        dilimalani =(alan*ac/360);
        System.out.print("Dairenin dilim alanı: "+dilimalani);
        dilimcevresi =((2*r)+(2*pi*r*ac/360));
        System.out.print("Dairenin dilim çevresi: "+dilimcevresi);

    }
}
