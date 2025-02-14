import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to return to start page
 * 
 * Jesse Hao, Leo Davis
 */
public class BButton extends Actor
{
    // Image hand drawn
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Start());
        }
    }
}
