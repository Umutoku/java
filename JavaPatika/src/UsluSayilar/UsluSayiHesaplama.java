package UsluSayilar;
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args)
    {
        int finalresult=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int k =inp.nextInt();
        System.out.print("Lütfen üs değeri giriniz: ");
        int j = inp.nextInt();

        for(int i=1;i<=j;i++)
        {
            finalresult *= k;
        }
        System.out.print(k +"üssü"+j+"="+ finalresult);
    }
}
