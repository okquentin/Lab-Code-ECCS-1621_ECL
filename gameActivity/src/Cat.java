
/**
 * Write a description of class Cat here.
 *
 * @author Quentin Osterhage
 * @version 2/8/2023
 */
public class Cat
{
    // instance variables - replace the example below with your own
    private String name = "Muffin";
    private int hunger = 0;
    private int happiness = 0;
    int location = 0;
    
    /**
     * Default Constructor for objects of class Cat
     * Sets everything to 0 and name to Cat
     */
    public Cat()
    {
        this.name = "Muffin";
        this.hunger = 0;
        this.happiness = 0;
        this.location = 0;
    }
    
    /**
     * Constructor for objects of class Cat
     * @param name - name of the cat
     * @param hunger - level of hunger
     * @param happiness - level of happy the cat is
     * @param location - starting location
     */
    public Cat(String name, int hunger, int happiness, int location)
    {
        // Initialize instance variables
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
        //System.out.println("    Hunger = " + this.hunger);
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
     * This method moves the cat based on happiness level
     * Hunger level greater than 8, walk changes location by 3
     * Happiness and hunger less than 4, walk changes location by 1
     * Otherwise walk changes location by 2
     * 
     * As the cat walks, their hunger level goes up
     * if location changes by 3, hunger increases by 3
     * if location changes by 2, hunger increases by 2
     * if location changes by 1, hunger increases by 1
     */
    public void walk()
    {
    	int catHappy = this.getHappiness();
    	int catPos = this.getLocation();
    	
    	if(catHappy < 4) {setLocation(catPos);}
    	
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method feeds the cat. As we feed the cat, hunger 
     * level decreases
     * @param amount - the amount we are feeding the cat
     */
    public void feed(int amount)
    {
        // put your code here
       
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method pets the cat. The higher the amount of time, 
     * the happier the cat will be
     * 
     * 15 or less, happiness increases 1
     * 15-30, happiness increases by 2
     * 31+, happiness increases by 3
     * 
     * @param time - the amount of time spend petting the cat
     */
    public void pet(int time)
    {
        // put your code here
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method determines if the cat has reaches the destination. Destination is location 10.
     * So if the cat is at location 10, the cat wins
     * @return boolean of false (not win) or true (win)
     */
    public boolean winGame()
    {
        // put your code here
        
        
        
        
        
        
        
        
    }
    
    /**
     * This method displays the cat's status
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
