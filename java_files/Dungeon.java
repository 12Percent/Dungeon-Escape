import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World for dungeon and questions
 * 
 * Jesse Hao, Leo Davis
 */
public class Dungeon extends World
{
    /* Drawn with reference image:
     * https://stock.adobe.com/images/concept-art-prison-in-dark-medieval-dungeon-with-stone-walls-
     * large-metal-jail-door-and-burning-torches-cartoon-game-location-prison-cell-interior-with-green-
     * poisonous-gas-and-skulls-3d-illustration/305952154
     */
    
    static GreenfootSound background = new GreenfootSound("15 - Underground Snow.mp3");
    // https://youtu.be/cYPgRwuAO4I
    
    private int time = 0; 
    public static int timer = 0;
    public static int score = 0, room;
    
    // Constructor
    public Dungeon() {    
        // Create a new world with 900x570 cells with a cell size of 1x1 pixels.
        super(900, 570, 1); 
        
        showScore();
        showTime();
        prepare(room);
    }
    
    // Parameterized Constructor
    public Dungeon(int r) {
        super(900, 570, 1);
        
        showScore();
        showTime();
        room = r;
        prepare(room);
    }
    
    // *******************
    //       METHODS
    // *******************
    
    public void act() {
        countTimer();
        checkMusic();
        wolfTiming();
    }
    
    // SCORING
    private void showScore() {
        showText("Score: " + score, 90, 550);
    }
    
    // TIMING
    private void countTimer() {
        timer++;
        showTime();
    }
    private void showTime() {
        showText("Time: " + timer/60, 810, 550);
    }
    private int wolfTiming() {
        time++;
        if (time == 360) {
            // when time reaches 275, spawn wolf to hunt the penguin
            randomWolf();
        }
        return time;
    }
    
    // WORLD PREPARATION: create penguin, question bank, and doors
    private void prepare(int x) {        
        QBank vault = new QBank();
        addObject(vault, getWidth()/2, getHeight()/2);
        
        int indicator = x;
        // create three doors for three answers
        if (indicator != 8 && indicator != 17) {
            Door1 d1 = new Door1();
            addObject(d1, 850, 125);
            Door2 d2 = new Door2();
            addObject(d2, 850, 290);
            Door3 d3 = new Door3();
            addObject(d3, 850, 445);
        }
        else {
            Door2 d2 = new Door2();
            addObject(d2, 850, 290);
        }
        Penguin voldemort = new Penguin();
        addObject(voldemort, 50, getHeight()/2);
    }
    
    // MUSIC
    private void checkMusic() {
        if (background.isPlaying() != true) {
            background.setVolume(50);
            background.playLoop();
        }
    }
    
    public static void stopM() {
        background.stop();
    }
    
    // RANDOM NUMBERS
    private void randomWolf() {
        int wolfnum = (int)(Math.random() * 3 + 1);
        if (wolfnum == 1) {
            Wolf one = new Wolf();
            addObject(one, 50, 335);
        }
        else if (wolfnum == 2) {
            Wolf one = new Wolf();
            addObject(one, 50, 285);
        }
        else if (wolfnum == 3) {
            Wolf one = new Wolf();
            addObject(one, 50, 235);
        }
    }
}