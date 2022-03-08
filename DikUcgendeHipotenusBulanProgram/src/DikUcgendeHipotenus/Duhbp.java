package DikUcgendeHipotenus;

import java.util.Scanner;

public class Duhbp {
    public static void main(String[] args) {
        int a,b,c,u,cevre;
        double alan;
        Scanner kenar = new Scanner(System.in);
        System.out.print("1.Kenarı giriniz: ");
        a = kenar.nextInt();
        System.out.print("2.Kenarı giriniz: ");
        b = kenar.nextInt();
        System.out.print("3.Kenarı giriniz: ");
        c = kenar.nextInt();

        u= (a+b+c) /2;
        cevre = 2*u;
        alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.print("Alan: "+alan);
        System.out.print("Çevre: "+cevre);
    }
}
