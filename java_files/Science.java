import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button for choosing science questions
 * 
 * Jesse Hao, Leo Davis
 */
public class Science extends Actor
{
    // Image hand drawn
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Dungeon(10));
        }
    }
}
