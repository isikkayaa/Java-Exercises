import java.util.Scanner;
    public class HarfOrtalamasi {

        public static void main(String[] args) {
            /*
             * Ortalama Hesaplama Programı
             * Öncelikle ortalama hesaplanacak
             * eğer:
             * 100-90 AA
             * 85-89 BA
             * 80-84 BB
             * 75-79 CB
             * 65-74 CC
             * 58-64 DC
             * 50-57 DD
             * 40-49 FF
             **/
            int vizeNotu,finalNotu,quizNotu;
            double ortalama;
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen Vize Notunuzu Giriniz:");
            vizeNotu = input.nextInt();
            System.out.println("Lütfen Final Notunuzu Giriniz: ");
            finalNotu= input.nextInt();
            System.out.println("Lütfen Quiz Notunuzu Giriniz: ");
            quizNotu=input.nextInt();
            ortalama = (vizeNotu*0.3)+(finalNotu*0.4)+(quizNotu*0.3);
            System.out.println("Ortalamanız: "+ortalama);
            if (ortalama<=100 && ortalama>=90) {
                System.out.println("Harf Notunuz: AA");}
            else if (ortalama>=85 && ortalama<=89) {
                System.out.println("Harf Notunuz: BA");}
            else if (ortalama>=80 && ortalama<=84) {
                System.out.println("Harf Notunuz: BB");}
            else if (ortalama>=75 && ortalama<=79) {
                System.out.println("Harf Notunuz: CB");}
            else if (ortalama>=65 && ortalama<=74) {
                System.out.println("Harf Notunuz: CC");}
            else if (ortalama>=58 && ortalama<=64) {
                System.out.println("Harf Notunuz: DC");}
            else if (ortalama>=50 && ortalama<=57) {
                System.out.println("Harf Notunuz: DD");}
            else if (ortalama>=40 && ortalama<=49) {
                System.out.println("Harf Notunuz: FF");}
            else {
                System.out.println("Hatalı Giriş");}
        }

    }

