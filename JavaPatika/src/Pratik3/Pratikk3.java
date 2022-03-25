package Pratik3;

import java.util.Scanner;

public class Pratikk3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        int n = input.nextInt();
        System.out.println("4 ve 5'in kuvvetleri: ");
        for (int i = 0; i <= n; i += 20) {
            System.out.println(i);

        }
    }
}