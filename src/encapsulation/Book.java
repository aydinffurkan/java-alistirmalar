package encapsulation;

public class Book {
    private String name;
    private int pagenumber;

    public Book(String name,int pagenumber)
    {
        if(this.pagenumber<1)
        {
            this.pagenumber=0;
        }
        else
        {
            this.pagenumber=pagenumber;
        }
        this.name=name;
    }

    public void getName()// private değişkenli classta kullanıcıya çıktı vermek için get metodu kullanılır.
    {
        System.out.println(this.name+" "+this.pagenumber);
    }
    public void setPage(int pagenumber) //set metodu ile değişim sağlarız
    {
        if(pagenumber<1)
        {
            this.pagenumber=0;
        }
        else{
            this.pagenumber=pagenumber;
        }
    }
}
