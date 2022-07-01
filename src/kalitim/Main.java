package kalitim;

public class Main {

    public static void main(String[] args) {

        Calisan c1=new Calisan("furkan aydin","5439069884","@ddd.com");
        Akademisyen a1=new Akademisyen("Bilal hoca","222","@ddd","pc","unvan");//adsoyad calisan sınıfından alındı.
        c1.yemekhane();
        a1.derseGir();

        Calisan a2=new Akademisyen("fff","555","@","ddd","dd");


    }


}
