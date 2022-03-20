public class Fmain {
    public static void main(String[] args) {
        Father f=new Father("Khangura","Manpreet","Moga",40);
        Father f1=new Son("gill","abc","canada",25,"swee");
        System.out.println(f);
        Son s=new Son("Khangura","Abhay","Kot",16,"National Convent");
        s.display();
        System.out.println(f1);
        f1.whatToEat();
        f.whatToEat();
    }
}
