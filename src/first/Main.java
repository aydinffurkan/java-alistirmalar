package first;

import second.Second;

public class Main {
    public static void main(String[] args) {
        First first=new First("furkan","aydin");
        Second second=new Second("ahmet");
        first.show();
        second.showiki();
    }
}
