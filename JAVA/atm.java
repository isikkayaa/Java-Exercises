import java.util.Scanner;
public class atm {


        public static void main(String[] args) {
            //Atm
            int pw,select,se,ctutar,ytutar,ht;
            String nh,un;
            Scanner input = new Scanner(System.in);
            while (true) {
                int bakiye = 1000;
                System.out.println("Kullanıcı Adınızı Giriniz:");
                un = input.nextLine();
                System.out.println("Kullanıcı Şifrenizi Giriniz:");
                pw= input.nextInt();
                System.out.println("Lütfen Seçiniz:\n1-Devam\n2-Çıkış");
                select=input.nextInt();
                if (select==1) {
                    while (true) {
                        System.out.println("****Seçenekler****\n1-Para Çekme\n2-Para Yatırma\n3-Havale\n4-Çıkış");
                        se = input.nextInt();
                        if (se==1) {
                            System.out.println("Çekeceğiniz Tutar:");
                            ctutar=input.nextInt();
                            bakiye=bakiye-ctutar;
                            System.out.println("Çektiğiniz Tutar: "+ctutar);
                            System.out.println("Son Kalan Bakiye: "+bakiye);}
                        else if (se==2) {
                            System.out.println("Yatırılacak Tutar: ");
                            ytutar = input.nextInt();
                            bakiye=bakiye+ytutar;
                            System.out.println("Yatırdığınız Tutar: "+ytutar);
                            System.out.println("Son Kalan Bakiye: "+bakiye);
                        }
                        else if(se==3) {
                            System.out.println("Göndereceğimiz Kişinin Adı:");
                            nh=input.nextLine();
                            System.out.println("Havale Edilecek Tutar: ");
                            ht=input.nextInt();
                            bakiye= bakiye+ht;
                            System.out.println("******Fatura******");
                            System.out.println("Gönderen: "+un);
                            System.out.println("Alıcı: "+nh);
                            System.out.println("Havale Tutarı: "+ht);
                            System.out.println("******************");
                            System.out.println("Bakiye:" + bakiye);
                        }
                        else if (se==4) {
                            System.out.println("İşlemlerinizi Sonlandırıyoruz...");
                            break;
                        }}}
                else if (select==2) {
                    System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler :)");
                    break;}}
        }

    }

