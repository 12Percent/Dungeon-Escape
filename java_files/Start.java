import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start screen with start and instruction buttons
 * 
 * Jesse Hao, Leo Davis
 */
public class Start extends World
{
    // Drawn with reference image: 
    // artstation.com/artwork/OoEnZJ
    public Start() // start page for the game with start button and instructions
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 570, 1); 
        Greenfoot.start(); // automatically start game
        Dungeon.timer = 0;
        Dungeon.score = 0;
    }
    public void act() {
        startButton();
        instructionButton();
    }
    public void startButton() {
        SButton start = new SButton();
        addObject(start, 200, 160);
    }
    public void instructionButton() {
        IButton ins = new IButton();
        addObject(ins, 200, 260);
    }
}
