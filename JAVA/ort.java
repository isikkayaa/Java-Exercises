import java.util.Scanner;

public class ort {
    public static void main(String[] args) {
        int vize,ffinal,quiz;
        double ortalama;



        Scanner input= new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        vize = input.nextInt();
        System.out.println("Final notunuzu giriniz:  ");
        ffinal = input.nextInt();
        System.out.println("Quiz notunuzu giriniz: ");
        quiz = input.nextInt();

        ortalama = (vize * 0.3) + (ffinal * 0.4) + (quiz * 0.3);
        System.out.println("Ortalamanız: " + ortalama);



    }
}
