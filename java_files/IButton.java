import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions button
 * 
 * Jesse Hao, Leo Davis
 */
public class IButton extends Actor
{
    // Image hand drawn
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Instruction());
        }    
    }
}
