package HavaSicaklikEtkinlik;
import java.util.Scanner;
public class HavaSicakEtkinlikOneri {
    public static void main(String[] args) {
        int heat;
    Scanner input = new Scanner(System.in);
    heat = input.nextInt();

    if(heat <5)
    {
        System.out.print("Kayak yapabilirsiniz.");
    }
    else if(heat >=5&& heat <=25)
    {
        if(heat <=15)
        {
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        if(heat >=10)
        {
            System.out.print("Pikniğe gidebilirsiniz.");
        }
        else
        {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }

    }
    }

