
/**
 * Write a description of class Penguin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Penguin
{
    // instance variables - replace the example below with your own
    // instance variables - replace the example below with your own
    private String name = "Tennessee Tuxedo";
    private int hunger = 0;
    private int happiness = 0;
    int location = 0;
    
    /**
     * Default Constructor for objects of class Penguin
     * Sets everything to 0 and name to Penguin
     */
    public Penguin()
    {
        this.name = "Tennessee Tuxedo";
        this.hunger = 0;
        this.happiness = 0;
        this.location = 0;
    }
    
    /**
     * Constructor for objects of class Penguin
     * @param name - name of the Penguin
     * @param hunger - level of hunger
     * @param happiness - level of happy the Penguin is
     * @param location - starting location
     */
    public Penguin(String name, int hunger, int happiness, int location)
    {
        // initialise instance variables
        this.name = name;
        this.hunger = hunger;
        this.happiness = happiness;
        this.location = 0;
    }
    
    // getters and setters
    String getName() { return this.name; }
    int getHunger() { return this.hunger; }
    int getHappiness() { return this.happiness; }
    int getLocation() { return this.location; }
    
    void setName(String name) { this.name = name; }
    void setHunger(int hunger) { 
        if(hunger < 0) { this.hunger = 0; }
        else if(hunger > 10) { this.hunger = 10; }
        else { this.hunger = hunger; }
    }
    void setHappiness(int happiness) { 
        if(happiness > 10) { this.happiness = 10; }
        else if (happiness < 0) { this.happiness = 0; }
        else {this.happiness = happiness; }
    }
    void setLocation(int location) {
        if(location < 0) { this.location = 0; }
        else if (location > 10) { this.location = 10; }
        else { this.location = location; }
    }

    /**
     * This method moves the penguin based on happiness level
     * Hunger level greater than 8, swim changes location by 3
     * Happiness and hunger less than 4, swim changes location by 1
     * Otherwise swim changes location by 2
     * 
     * As the penguin swims, their hunger level goes up
     * if location changes by 3, hunger increases by 3
     * if location changes by 2, hunger increases by 2
     * if location changes by 1, hunger increases by 1
     */
    public void swim()
    {
        // put your code here
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method feeds the penguin. As we feed the penguin, hunger 
     * level decreases
     * @param amount - the amount we are feeding the penguin
     */
    public void feed(int amount)
    {
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method allows the peguin to play. The higher the amount of time, 
     * the happier the penguin will be
     * 
     * 15 or less, happiness increases 1
     * 15-30, happiness increases by 2
     * 31+, happiness increases by 3
     * 
     * @param time - the amount of time spend playing with the penguin
     */
    public void play(int time)
    {
        // put your code here
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method determiens if the penguin has reaches the destination. Destination is location 10.
     * So if location is 10, it is a win
     * @return boolean of false (not win) or true (win)
     */
    public boolean winGame()
    {
        // put your code here
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method displays the penguins's status
     * (hunger, happiness, and location) along with the name
     */
    public String toString()
    {
        // put your code here
        return this.getName() + ": " + "Hunger = " + this.getHunger() + 
        ", Happiness = " + this.getHappiness() + ", Location = " + 
        this.getLocation();
    }
}
