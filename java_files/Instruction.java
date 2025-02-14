import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Page for instructions
 * 
 * Jesse Hao, Leo Davis
 */
public class Instruction extends World
{
    // Drawn with reference image:
    // https://stock.adobe.com/images/concept-art-prison-in-dark-medieval-dungeon-with-stone-walls-
    // large-metal-jail-door-and-burning-torches-cartoon-game-location-prison-cell-interior-with-green-
    // poisonous-gas-and-skulls-3d-illustration/305952154
    
    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 570, 1); 
    }
    
    public void act() {
        BButton back = new BButton();
        addObject(back, getWidth()/2, 125);
        
        showText("You are a penguin escaping from a dungeon. Answer a series of ", getWidth()/2, 230); 
        showText("questions correctly in order to gain points. Use the arrow keys to ", getWidth()/2, 280);
        showText("move and touch the portal in the center to access the question and ", getWidth()/2, 330);
        showText("answers. If you get caught by the guard or answer incorrectly, you will lose. ", getWidth()/2, 380);
        showText("Touch the door to choose your answer. Gain 35 points to escape. ", getWidth()/2, 425); 
    }
}
