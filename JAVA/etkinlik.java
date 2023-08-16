import java.util.Scanner;
public class etkinlik {


        public static void main(String[] args) {
            /*
             * Sıcaklığa göre etkinlik belirleyeceğiz
             * Eğer sıcaklık 30 ve 35 derece arasında olursa denize veya havuza git
             * Eğer sıcaklık 30 ve 25 derece arasında olursa pikniğe gitsin
             * Eğer sıcaklık 25 ve 20 derece arasında olursa arkadaşlarıyla dışarda kahve içsin
             * Eğer sıcaklık 20 ve 15 derece arasında olursa sinemaya gitsin
             * Eğer sıcaklık 15 ve 10 derece arasında olursa yürüyüş yapsın
             * Eğer sıcaklak 10 ve 5 derece arasında olursa evde kitap ya da bilgisayar oyunu oynasın
             * Eğer sıcaklık 5 ve 1 derece arasında olursa evde ders çalışsın
             * Eğer sıcaklık 1 ve -5 altında olursa dışarda karla oynasın */
            int sıcaklık;
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen Sıcaklık Değerini Giriniz: ");
            sıcaklık=input.nextInt();
            if (35<=sıcaklık && sıcaklık<=30) {
                System.out.println("Denize veya Havuza girebilirsiniz");
            }
            else if (25<sıcaklık && sıcaklık<=30) {
                System.out.println("Pikniğe gidebilirsiniz");
            }
            else if (20<sıcaklık && sıcaklık<=25) {
                System.out.println("Arkadaşlarınla dışarda kahve iç");
            }
            else if (15<sıcaklık && sıcaklık<=20) {
                System.out.println("Sinemaya git");
            }
            else if (10<sıcaklık && sıcaklık<=15) {
                System.out.println("Yürüyüş Yap");
            }
            else if (5<sıcaklık && sıcaklık<=10) {
                System.out.println("Evde kitap ya da bilgisayar oyunu oyna");
            }
            else if (1<sıcaklık && sıcaklık<=5) {
                System.out.println("Evde Ders çalış");
            }
            else if(-5<sıcaklık && sıcaklık<=1) {
                System.out.println("Dışarda karla oyna");
            }
            else {
                System.out.println("Ekstrem koşullar!");
            }
        }

    }

