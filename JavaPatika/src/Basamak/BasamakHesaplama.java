package Basamak;
import java.util.Scanner;
public class BasamakHesaplama {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int number = inp.nextInt();
        int temp = number;
        int total=0;
        while(temp!=0)
        {
            total += temp%10;
            temp/= 10;
        }
        System.out.print(total);
    }
}
