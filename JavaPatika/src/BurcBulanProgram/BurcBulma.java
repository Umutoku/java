package BurcBulanProgram;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz Ay: ");
        month = input.nextInt();

        System.out.print("Doğdunuz Gün: ");
        day = input.nextInt();


            if(month ==1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.print("Oğlak Burcusunuz");
                    } else {
                        System.out.print("Kova Burcusunuz");
                    }
                } else {
                    System.out.print("Geçersiz bir gün girdiniz");
                }
            }


       else if(month ==2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    System.out.print("Kova Burcusunuz");
                } else {
                    System.out.print("Balık Burcusunuz");
                }
            } else {
                System.out.print("Geçersiz bir gün girdiniz");
            }
        }

        else if(month ==3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.print("Kova Burcusunuz");
                } else {
                    System.out.print("Balık Burcusunuz");
                }
            } else {
                System.out.print("Geçersiz bir gün girdiniz");
            }
        }

            else if(month>12 || day>31)
                System.out.print("Geçersiz bir değer girdiniz");
        }
    }

