import java.util.Scanner;

public class JavaDersi {
    public static void main(String[] args) {
        int vizeNotu,finalNotu,quizNotu;
        double ortalama;


        Scanner input = new Scanner(System.in);

        System.out.println("Vize notunuzu giriniz: ");
        vizeNotu = input.nextInt();
        System.out.println("Final notunuzu giriniz: ");
        finalNotu = input.nextInt();
        System.out.println("Quiz notunuzu giriniz: ");
        quizNotu = input.nextInt();


        ortalama = (vizeNotu * 0.3) + (finalNotu * 0.4) + (quizNotu * 0.3);

        System.out.println("Not ortalamanız: " + ortalama );

    }
}

