import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World for selecting the type of questions
 * 
 * Jesse Hao, Leo Davis
 */
public class Options extends World
{
    // Drawn with reference image: 
    // https://stock.adobe.com/images/concept-art-prison-in-dark-medieval-dungeon-with-stone-walls-
    // large-metal-jail-door-and-burning-torches-cartoon-game-location-prison-cell-interior-with-green-
    // poisonous-gas-and-skulls-3d-illustration/305952154
    
    public Options()
    {    
        // Create a new world with 900x570 cells with a cell size of 1x1 pixels.
        super(900, 570, 1); 
        
        History hist = new History();
        addObject(hist, 150, getHeight()/2);
        
        Science sci = new Science();
        addObject(sci, 730, getHeight()/2);
    }
}
