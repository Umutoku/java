package Vki;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = girdi.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = girdi.nextDouble();

        //Kilo (kg) / Boy(m) * Boy(m)
        indeks = kilo / Math.pow((boy/100),2);
        System.out.print("Vücut kitle indeksiniz: "+indeks);

    }
}
