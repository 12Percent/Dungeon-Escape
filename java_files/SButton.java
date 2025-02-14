import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to start gameplay
 * 
 * Jesse Hao, Leo Davis
 */
public class SButton extends Actor
{
    // Image hand drawn
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Options());
        }
    }
}
