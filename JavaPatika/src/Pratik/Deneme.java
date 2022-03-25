package Pratik;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int sayi,counter=0,toplam=0;
        System.out.print("Sayı girin: ");
        sayi=input.nextInt();
       for(int i=1;i<=sayi;i++)
       {
           if(i%3==0&&i%4==0)
           {
               toplam+=i;
               counter++;
           }
       }
       System.out.println("3 ve 4'e kalansız bölünen sayılar: "+ toplam/counter);

    }
}
