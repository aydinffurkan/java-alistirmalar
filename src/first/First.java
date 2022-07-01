package first;

public class First {
   private String isim;
    String soyisim;

    First(String isim,String soyisim)
    {
        this.isim=isim;
        this.soyisim=soyisim;
    }

  protected void show()
    {
        System.out.println(this.isim+" "+this.soyisim);
    }
}
