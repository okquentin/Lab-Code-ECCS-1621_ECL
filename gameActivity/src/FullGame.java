import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class FullGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullGame
{
    // instance variables - replace the example below with your own
    static Scanner input = new Scanner(System.in);
    
    public static void main() {
        
        // Player 1
        String name1 = getUserPetName("cat");
        Cat c = new Cat(name1, getRandomNumber(), getRandomNumber(), 0);

        // Player 2
        String name2 = getUserPetName("penguin");
        Penguin p = new Penguin(name2, getRandomNumber(), getRandomNumber(), 0);
        
        while((c.getLocation() < 10) && (p.getLocation() < 10)) {
            // Player 1
            int move = getRandomNumber();
            if(move == 0) { // feed
                c.feed(getRandomNumber());
            }
            else if(move == 1) { // walk
                c.walk();
            }
            else { // pet
                c.pet(getRandomNumber() * 10);
            }
            System.out.println(c.toString());
            if(c.winGame()) { System.out.println("Cat wins!"); break; }
            
            // Player 2
            move = getRandomNumber();
            if(move == 0) { // feed
                p.feed(getRandomNumber());
            }
            else if(move == 1) { // swim
                p.swim();
            }
            else { // play
                p.play(getRandomNumber() * 10);
            }
            System.out.println(p.toString());
            if(p.winGame()) { System.out.println("Penguin wins!"); break; }
            
        }
        
    }


    /**
     * This method gets the pet name from the user (either Cat or Penguin)
     *
     * @param  animal  name of the animal to be displayed in prompt
     * @return    the name from the user
     */
    public static String getUserPetName(String animal)
    {
        // put your code here
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method uses the Random class to generate a random number
     * in the range 0 to 3
     *
     * @return    an int number 0, 1, 2, or 3
     */
    public static int getRandomNumber()
    {
        
        
        
        
        
        
        
        
        
    }
    
}
