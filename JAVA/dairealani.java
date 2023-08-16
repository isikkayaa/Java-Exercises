import java.util.Scanner;

public class dairealani {
    public static void main(String[] args) {
        float r;
        double alan, cevre, pi;
        pi = 3.14;

        Scanner input = new Scanner(System.in);

        // System.out.println("Tam sayı değerler giriniz!!!!");
        System.out.println("Yarıçapı Giriniz:  ");
        r = input.nextFloat();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);


    }
}
