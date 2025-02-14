import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Actor for 'guard'
 * 
 * Jesse Hao, Leo Davis
 */
public class Wolf extends Actor
{
    // https://terraria.fandom.com/wiki/Wolf
    
    GreenfootSound hurtSound = new GreenfootSound("classic_hurt.mp3");
    // https://www.myinstants.com/instant/minecraft-hurt/
    
    public void act()
    {
        huntPenguin();
    }
    
    private void huntPenguin() { //penguin targeting
        move(2);
        Actor peng = (Actor)getWorld().getObjects(Penguin.class).get(0);
        turnTowards(peng.getX(),peng.getY());
        
        touchPenguin();
    }
    
    private void touchPenguin() {
        if (isTouching(Penguin.class)) { //game over if touching penguin
            hurtSound.play();
            removeTouching(Penguin.class);
            GameOver gOver = new GameOver();
            Dungeon.score = 0; // set score to 0 if game is lost
            getWorld().addObject(gOver, getWorld().getWidth()/2, 100);
            Dungeon.stopM();
            Greenfoot.stop();
        }
    }
}

