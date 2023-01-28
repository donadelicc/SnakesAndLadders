package Stigespill.test;
import GameObjects.Terning;
import GameObjects.Brett;

public class mainTest {

    public static void main(String[] args) {
        // test terning
        Terning t = new Terning();
        t.kast();
     //   System.out.println(t);
        // test brett
        Brett b = new Brett(100, 10, 10);
        b.printBrett();

    }
    
}
