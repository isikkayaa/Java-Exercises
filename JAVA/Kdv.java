import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar, kdvlifiyat;
        double kdv = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün tutarını giriniz: ");
        tutar = input.nextDouble();
        kdvlifiyat = tutar + (tutar * kdv);
        System.out.println("Ürünün KDV'li fiyatı: " + kdvlifiyat);



    }
}
