package SayilarBuyuktenKucuge;
import java.util.*;

import static java.lang.System.*;

public class SayiBuyukKucuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gecici;
        int[] dizi = new int[3];

        System.out.print("3 tane sayı girin :");
        for (int k = 0; k < 3; k++) {
            dizi[k] = sc.nextInt();
        }
        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
        for(int i = 0; i < 2; i++)
        {
            for(int j = i+1; j < 3; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
        }

    }
}
