import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Victory screen
 * 
 * Jesse Hao, Leo Davis
 */
public class IceBiome extends World
{
    // https://skyandtelescope.org/astronomy-news/500-days-until-antarctica-total-solar-eclipse/
    
    static GreenfootSound victory = new GreenfootSound("14 - Snow.mp3");
    // https://youtu.be/WvrciA9TTTw
    /**
     * Victory world
     * 
     * Jesse Hao, Leo Davis
     */
    public IceBiome()
    {    
        // Create a new world with 900x570 cells with a cell size of 1x1 pixels.
        super(900, 570, 1);
        Dungeon.stopM();
        victory.setVolume(50);
        victory.play();
        Penguin voldemort = new Penguin();
        addObject(voldemort, 755, 440);
        
        showText("Score: " + Dungeon.score, 90, 550);
        showText("Time: " + (Dungeon.timer)/60, 810, 550);
        showText("LET'S GOOOOOOOO! WE'RE FREEEEEEEE", getWidth()/2, 40); 
        
        Restart re = new Restart();
        addObject(re, getWidth()/2, 515);
    }
}
