package HesapMakinesi;

import java.util.Scanner;


public class HesapMak {
    public static void main(String[] args) {
    int n1,n2,select;
    Scanner input = new Scanner(System.in);
    System.out.print("İlk Sayıyı giriniz");
    n1=input.nextInt();
        System.out.print("İkinci Sayıyı giriniz");
        n2=input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if ( n2 == 0) {
                    System.out.println("Sayı sıfıra bölünemez");
                } else
                    System.out.print("Bölme : " + (n1 / n2));
                break;
            default:
                System.out.print("Tekrar deneyiniz ");
                break;
        }

    }
}
