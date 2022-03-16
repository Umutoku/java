package UcakBiletiFiyat;
import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int km, yas, yolcutip,indirim = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi Kilometre Cinsinden giriniz:");
        km = sc.nextInt();
        System.out.println("Yaşını giriniz:");
        yas = sc.nextInt();
        System.out.println("Yolculuk tipini giriniz(1=>Tek 2=>Gidiş Dönüş):");
        yolcutip = sc.nextInt();
        double toplam, ucret = 0.10;

        if (km < 0 || yas < 0 || (yolcutip != 1 && yolcutip != 2)) {
            System.out.println("Hatalı Giriş");
        } else if (yas < 12) {
            indirim = 50;
        } else if (yas >= 12 && yas < 24) {
            indirim = 10;
        } else if (yas >65) {
            indirim = 30;
        }

        if (yolcutip == 1) {
            toplam = km * ucret * (1- indirim/100.0);
        }else{
            toplam = ((km * ucret * (1 - (indirim / 100.0)))*2*0.80);
        }
        System.out.printf("Toplam tutar : "+toplam);
        sc.close();
        }
    }

