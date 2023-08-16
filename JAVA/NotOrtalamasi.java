import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int quiz , vize, ffinal ;
        double ortalama;

        Scanner input = new Scanner(System.in); //kullanıcıdan veri almak icin
        System.out.println("Quiz notunuzu giriniz: " );
        quiz = input.nextInt();
        System.out.println("Vize notunuzu giriniz: ");
        vize = input.nextInt();
        System.out.println("Final notunuzu giriniz: " );
        ffinal = input.nextInt();

        /*System.out.println("Quiz notunuz: " + quiz);
        System.out.println("Vize notunuz: " + vize);
        System.out.println("Final notunuz: " + ffinal);*/

        ortalama = (quiz * 0.2 ) +  ( vize * 0.4) + (ffinal * 0.4);
        System.out.println("Ortalamanız: " + ortalama);
        String sonuc = (ortalama >= 50) ? "Geçtiniz!!" : "Kaldınız";
        System.out.println(sonuc);




    }
}
