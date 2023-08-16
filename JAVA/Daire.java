import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double alan;
        double hacim;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Daire yarıçapını giriniz:\n" );
        r = input.nextInt();
        alan = 2 * pi * r;
        hacim = pi * (r*r);
        System.out.println("Dairenin alanı: " +alan);
        System.out.println("Dairenin hacmi: " + hacim);






    }
}
