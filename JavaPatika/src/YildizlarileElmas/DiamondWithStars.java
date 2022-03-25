package YildizlarileElmas;
import java.util.Scanner;
public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = inp.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n-1; i++) {
            for (int x = 0; x <= i; x++) {
                System.out.print(" ");
            }
            for (int y=(2*n-1); y>=(2*i+1);y--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}