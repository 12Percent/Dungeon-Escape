import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button for selecting history questions
 * 
 * Jesse Hao, Leo Davis
 */
public class History extends Actor
{
    // Image hand drawn
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Dungeon(1));
        }
    }
}
