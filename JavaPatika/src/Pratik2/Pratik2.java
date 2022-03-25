package Pratik2;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplam=0;

        do {
            System.out.print("Sayı girin: ");
            sayi=input.nextInt();
            if(sayi%4==0)
            {
                toplam += sayi;
            }
        }
        while(sayi%2==0);

        System.out.println("Girmiş olduğunuz sayılardan 4'ün katları toplamı: " + toplam);
    }
}
