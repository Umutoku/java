package HarmonikSayilar;
import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        double n = inp.nextDouble();
        double result= 0.0;
        for(double i =1;i<=n;i++)
        {
            result+=(1/i);
        }
        System.out.print(result);
    }
}
