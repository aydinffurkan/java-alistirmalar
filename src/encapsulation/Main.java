package encapsulation;

public class Main {
    public static void main(String[] args) {
    Book book=new Book("harry potter",-100);
    book.getName();
    book.setPage(-1000);
    book.getName();
    }
}
