public class TemelKavramlarVeDegiskenler {
    public static void main(String[] args) {
        byte abc = 100; //150 olmaz
        System.out.println("Byte Değeri : " + abc);

        short shortDegiskeni = 1000;
        System.out.println("Short Değeri: " + shortDegiskeni);

        int intDeger = 10000;
        System.out.println("Integer Değeri : " + intDeger);

        long longDeger = 100000;
        System.out.println("Long Değeri : " + longDeger);

        float sayi1 = 34.0f;
        System.out.println(sayi1);

        double sayi2 = 3;
        sayi2 = 4.5;
        System.out.println(sayi2);

        char karakter = 117; //Unicode
        char karakter2 = 'u';
        System.out.println(karakter2);

        boolean mantik = true;
        System.out.println(mantik);

        char a = 'H';
        String str = "Hello World";
        System.out.println(str);

        String metin = "hello";
        System.out.println("15" + 45);

        int b = 10;
        int c = 5;

       int toplam = b + c;
       int cikarma = b - c;
       int carpma = b * c;
       int bolme = b / c;
       int mod = b % c; //bölümünden kalan

        //System.out.println("Toplama : " + toplam);
        //System.out.println("Çıkarma : " + cikarma);
        //System.out.println("Çarpma: " + carpma);
        //System.out.println("Bölme: " + bolme);
        //System.out.println("Mod: " + mod);

        toplam ++ ; // toplamı bir kere tanımladıktan sonra bir daha basına int yazmamıza gerek yok
        //System.out.println(toplam);

        cikarma--;
        //System.out.println(cikarma);

        int sonuc = b++ +  c-- ;
        //System.out.println(sonuc);
        //System.out.println(b);
        //System.out.println(c);

        int sayi3 = 10;
        int sayi4 = 5;

        boolean kosul = (sayi3 == sayi4);
        System.out.println(kosul);

        boolean kosul1 = (sayi3 < sayi4);
        boolean kosul2 = (sayi3 > sayi4);

        boolean sonuc2 = kosul1 && kosul2;  //ve
        System.out.println(sonuc2);
        sonuc2 = kosul1 ||kosul2; //veya
        System.out.println(sonuc2);

        String sonuc3 = (kosul1) ? "Doğru" : "Yanlış" ;  //kosul1 saglandı iste dogru, degilse yanlıs
        System.out.println(sonuc3);

        sayi3= sayi4;
        System.out.println(sayi3);
        sayi3 = sayi3 + 2;
        sayi3 += 2;
        System.out.println(sayi3);

        //karsılastırma ve mantıksal operatorleri  true ya da false döndürürler
        int z = 89;
        int y = 90;
        int q = 67;
        int p = 76;

        boolean sonucc = (z == y);
        System.out.println(!sonucc);
        boolean kosuul = p < q;
        boolean kosuul2 = p < z;
        boolean sonucc2 = (kosuul && kosuul2); //ve
        System.out.println(sonucc2);
        System.out.println();













    }
}
