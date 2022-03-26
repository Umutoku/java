package ATM;

import java.util.Scanner;

public class AtmProgramı {
    public static void main(String[] args)
    {
        String username,password;
        int right =3,select;
        int balance = 1500;
        Scanner input = new Scanner(System.in);
        while(right>0)
        {
            System.out.print("Kullanıcı Adınız: ");
            username = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if(username.equals("patika")&& password.equals("dev123")) {
                System.out.print("Sisteme giriş yaptınız.");
                do {

                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1: {
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                        }
                        break;
                        case 2: {
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.print("Bakiye yetersiz: ");
                            } else {
                                balance -= price;
                            }
                        }
                        break;
                        case 3: {
                            System.out.print("Bakiyeniz: " + balance);
                            break;
                        }
                        default:
                            System.out.println("İyi günler dileriz.");
                    }
                }
                    while (select != 4) ;


            }
            else
            {
                --right;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");
                if(right==0)
                {
                    System.out.println("Hesabınız bloke olmuştur.");
                }
                else {
                    System.out.print("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
