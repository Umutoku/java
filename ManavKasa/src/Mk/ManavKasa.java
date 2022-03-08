package Mk;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        double Armut = 2.14,Elma= 3.67,Domates=1.11,Muz=0.95,Patlican=5;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız?: ");
        Armut=girdi.nextDouble()*Armut;
        System.out.print("Kaç kilo elma aldınız?: ");
        Elma=girdi.nextDouble()*Elma;
        System.out.print("Kaç kilo Domates aldınız?: ");
        Domates=girdi.nextDouble()*Domates;
        System.out.print("Kaç kilo muz aldınız?: ");
        Muz=girdi.nextDouble()*Muz;
        System.out.print("Kaç kilo Patlıcan aldınız?: ");
        Patlican=girdi.nextDouble()*Patlican;
        System.out.print("Toplam Tutar: "+(Armut+Elma+Domates+Muz+Patlican));
    }
}
