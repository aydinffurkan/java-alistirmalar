package kalitim;

public class Akademisyen extends Calisan {//extedns metodu ile bu sınıf ana sınıfa kalıtıldı
    private String bolum;
    private String unvan;

    public Akademisyen(String adsoyad, String telefon,String eposta,String bolum,String unvan)
    {
        super(adsoyad,telefon,eposta);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum()
    {
        return this.bolum;
    }

    public void setBolum(String bolum)
    {
        this.bolum=bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir()
    {
        System.out.println(this.getAdsoyad()+" Derse girdi");//get metodu calisan sınıfından alındı.
    }

}
