public class StaticPractice {
     private static int x=10;
     private int y=15;
     static void display()
    {
        System.out.println("x== "+ x );
    }
    public void displayCall()
    {
        System.out.println("y== " + y);
        System.out.println(x);
       // display();
    }
}
