package SinifGecme;

import java.util.Scanner;
public class GectiKaldi {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;
        double average =0;
        int counter=0;
        Scanner input = new Scanner(System.in);

        System.out.print(("Matematik notunuzu giriniz: "));
        mat = input.nextInt();
        if (mat >= 0 && mat<=100){
            average += mat;}
        counter++;
        System.out.print(("Türkçe notunuzu giriniz: "));
        fizik = input.nextInt();
        if (fizik>= 0 && fizik<=100){
            average += fizik;}
        counter++;
        System.out.print(("Fizik notunuzu giriniz: "));
        turkce = input.nextInt();
        if (turkce >= 0 && turkce<=100){
            average += turkce;}
        counter++;
        System.out.print(("Kimya notunuzu giriniz: "));
        kimya = input.nextInt();
        if (kimya >= 0 && kimya<=100){
            average += kimya;}
        counter++;
        System.out.print(("Müzik notunuzu giriniz: "));
        muzik = input.nextInt();
        if (muzik >= 0 && muzik<=100){
            average += muzik;}
        counter++;


        if(average/counter <=55)
        {
            System.out.print("Tebrikler,geçtiniz.");

        }
        else {
            System.out.print("Kaldınız :(");
        }

        System.out.print("Ortalamanız: "+ average);

    }
}
