import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to restart game
 * 
 * Jesse Hao, Leo Davis
 */
public class Restart extends Actor
{
    // Image hand drawn
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Dungeon.score = 0;
            Greenfoot.setWorld(new Start());
            IceBiome.victory.stop();
            Dungeon.stopM();
        }
    }
}
