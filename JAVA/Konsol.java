import java.util.Scanner;

public class Konsol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b ;

        /*System.out.println("A sayısını giriniz: ");
        a = input.nextInt();
        System.out.println("B sayısını giriniz: ");
        b = input.nextInt();
        System.out.println("A sayısı: " + a);
        System.out.println("B sayısı: " + b); */

        /* double c;
        System.out.println("Double türünde sayı giriniz: ");

        c = input.nextDouble();   //deger girilirken virgüllü sekilde girilmelidir
        System.out.println(c); */

        String str;
        str = input.nextLine();  //o satırı komple alır
        System.out.println(str);




    }
}
