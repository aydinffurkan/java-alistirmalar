package siniflararasiiletisim;

public class Main {
    public static void main(String[] args) {
    Student s1=new Student("Furkan","Aydin","1",100);
    Student s2=new Student("Ahmet","Kalin","2",90);
        System.out.println(s1.getName()+" "+s1.getNote());
        s1.setNote(50);
        System.out.println(s1.getName()+" "+s1.getNote());
        System.out.println(s2.getNote());
        s2.setNote(50);
        System.out.println(s2.getNote());

        //composition birleştirme işlemi yapılır.
        Instructor teacher=new Instructor("MAHMUT","GAZİ");
        Course mat=new Course("matematik","101",teacher);

        System.out.println(mat.getInstructor().getName());


    }
}
