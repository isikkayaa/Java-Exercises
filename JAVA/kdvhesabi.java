import java.util.Scanner;

public class kdvhesabi {
    public static void main(String[] args) {
        int urunFiyati;
        double kdvOrani = 0.08;
        double guncelTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Ürün fiyatını giriniz: ");
        urunFiyati = input.nextInt();

        guncelTutar = urunFiyati + (urunFiyati * kdvOrani);

        System.out.println("Güncel ürün fiyatınız: " + guncelTutar);


    }
}
