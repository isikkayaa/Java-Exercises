import java.util.Scanner;

public class geo {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);


        System.out.println("Dairemizin yarıçapını giriniz:");
        r = input.nextInt();
        double cevre = 2* pi*r;
        double alan = pi * r * r;

        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin alanı:" + alan);


    }
}
