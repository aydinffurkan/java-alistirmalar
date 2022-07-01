package Nested;

public class Nested {
    private int sayi=5;

    public Nested(int sayi) {
        this.sayi = sayi;
    }

    public void show()
    {
        System.out.println(sayi);
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public class Nested2
    {
        private int sayi=10;
        public void show()
        {
            System.out.println(Nested.this.sayi);
            System.out.print(this.sayi);
        }

        public Nested2(int sayi) {
            this.sayi = sayi;
        }

        public int getSayi() {
            return sayi;
        }

        public void setSayi(int sayi) {
            this.sayi = sayi;
        }
    }

}
