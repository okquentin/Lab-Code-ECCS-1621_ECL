
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main() {
        Cat c1 = new Cat();
        System.out.println(c1.toString());
        c1.walk();
        System.out.println(c1.toString());
        c1.walk();
        System.out.println(c1.toString());
        c1.pet(31);
        System.out.println(c1.toString());
        c1.pet(31);
        System.out.println(c1.toString());
        c1.walk();
        System.out.println(c1.toString());
        c1.walk();
        System.out.println(c1.toString());
        c1.walk();
        System.out.println(c1.toString());
        c1.walk();
        System.out.println(c1.toString());
        c1.walk();
        System.out.println(c1.toString());
        
        if(c1.winGame()) { System.out.println("Cat reached destination"); }
        else { System.out.println("Sorry - you lost"); }
        
        Penguin p1 = new Penguin("Hubie", 0, 0, 0);
        System.out.println(p1.toString());
        p1.swim();
        System.out.println(p1.toString());
        p1.play(35);
        System.out.println(p1.toString());
        p1.swim();
        System.out.println(p1.toString());
        p1.swim();
        System.out.println(p1.toString());
        p1.feed(1);
        System.out.println(p1.toString());
        p1.swim();
        System.out.println(p1.toString());
        p1.play(37);
        System.out.println(p1.toString());
        p1.swim();
        System.out.println(p1.toString());
        p1.swim();
        System.out.println(p1.toString());
        p1.swim();
        System.out.println(p1.toString());
        if(p1.winGame()) { System.out.println("Penguin reached destination"); }
        else { System.out.println("Sorry - you lost"); }
    }
    
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
