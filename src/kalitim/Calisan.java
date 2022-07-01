package kalitim;

public class Calisan {
    private String adsoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adsoyad,String telefon,String eposta)
    {
        this.adsoyad=adsoyad;
        this.eposta=eposta;
        this.telefon=telefon;
    }

    public String getAdsoyad()
    {
        return this.adsoyad;
    }

    public void setAdsoyad(String adsoyad)
    {
        this.adsoyad=adsoyad;
    }

    public String getTelefon()
    {
        return this.telefon;
    }

    public void setTelefon(String telefon)
    {
        this.telefon=telefon;
    }

    public String getEposta()
    {
        return this.eposta;
    }

    public void setEposta(String eposta)
    {
        this.eposta=eposta;
    }

    public void giris()
    {
        System.out.println(this.adsoyad+" Derse giris yapti..");
    }
    public void  cikis()
    {
        System.out.println(this.adsoyad+" Dersten cıkıs yapti");
    }

    public void yemekhane()
    {
        System.out.println(this.adsoyad+" Yemkhaneye giris yapti");
    }




}
