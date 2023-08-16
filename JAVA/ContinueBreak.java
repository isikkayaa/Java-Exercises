import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;


        int sayi;
        while(true) {
            System.out.println("Bir sayı giriniz: ");
            sayi = scan.nextInt() ;
            if (sayi == 0) {  // sayi 0 a eşitse döngğ biter
                System.out.println("Döngü bitti");
                break;
            }
            System.out.println(sayi);

        }

        for(int i = 1; i <=10; i ++) {
            if(i ==4 || i ==9) {
                System.out.println("atladı = " + i);
                continue; // o anki komutu yap sonra yukarıya dön
            }
            System.out.println("i = " + i);

        }

    }
}
