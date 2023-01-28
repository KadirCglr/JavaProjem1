import java.util.Scanner;

public class projem1 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);

        System.out.print("Merhaba lütfen isminizi giriniz = ");
        String isim=oku.next();
        String s1= isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase();
        System.out.println("İsminiz = " + s1);

        System.out.print("Kadir hosgeldin, soyismini girer misin? = ");
        String soyIsim=oku.next();
        String s2= soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1,soyIsim.length()).toLowerCase();
        System.out.println("Soy isminiz= " + s2);

        String Ytusu="";
        while (!Ytusu.equalsIgnoreCase("Y")){

            System.out.println("Kadir Çağlar isminiz doğru ise devam etmek için 'Y' tuşuna basınız");
            Ytusu=oku.next();
            if (!Ytusu.equalsIgnoreCase("Y"))
                System.out.println("Tercihinizi doğru yapmadınız...Lütfen tekrar deneyiniz...");
            else
                System.out.println("İsim ve Soyisminiz başarılı bir şekilde kayıt edilmiştir.");
        }
        System.out.println("Lütfen kullanıcı adınızı belirleyiniz");
        String kAdi=oku.next();

        String sifre1="";
        String sifre2="";
        System.out.println("Lütfen şifrenizi giriniz");
        sifre1=oku.next();

        while (!sifre2.equals(sifre1)){

            System.out.println("şifrenizi tekrar griniiz");
            sifre2=oku.next();

            if (!sifre2.equals(sifre1))
                System.out.println("hatalı bir şifre girdiniz, lütfen tekrar deneyin");
            else
                System.out.println("Tebrikler..." + " " + kAdi + " " + "kullanıcı adıyla sisteme kayıt oldunuz");
        }

    }

}

