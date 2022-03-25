package Pratik4;
import java.util.Scanner;
public class nverkombinasyon {
    public static void main(String[] args) {
        int n,r,totaln=1,totalr=1,result,nr,nrf=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("N eleman sayısını giriniz: ");
        n= inp.nextInt();
        System.out.print("R eleman sayısını giriniz: ");
        r= inp.nextInt();
        nr=n-r;
        for(int i=1;i<=n;i++){
            totaln=totaln*i;
        }
        for(int j=1;j<=r;j++){
            totalr=totalr*j;
        }
        for (int k=1;k<=nr;k++){

            nrf=nrf*k;
        }
        result=totaln/(totalr*nrf);
        System.out.printf("N ve r kombinasyonu: " + result);



    }
    }
