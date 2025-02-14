import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main character/player
 * 
 * Jesse Hao, Leo Davis
 */
public class Penguin extends Actor
{
    // https://terraria.fandom.com/wiki/Fish_(item)
    
    private int roomNum = Dungeon.room; // room counter
    
    public Penguin () { // default constructor
    }
    
    public void act()
    {
        findQuestion(roomNum);
        keyPress();
    }
    
    private void keyPress() { // check for keypress/human player
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+3);
        }
        if (Greenfoot.isKeyDown("left")) {
            setImage("PenguinB-.png"); // set image to one that turns left 
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setImage("PenguinB.png");
            setLocation(getX()+3, getY());
        }
    }
    
    private void findQuestion(int number) { // decide which quesition and answers to appear
        number = Dungeon.room;
        scienceQuestion(number);
        historyQuestion(number);
    }
    
    private void scienceQuestion(int number) { // HISTORY QUESTIONS
        int num = number;
        if (num == 1) {
            if (isTouching(QBank.class)) {
                questionOne();
            }
            twoCorrect(num);
        }
        if (num == 2) {
            if (isTouching(QBank.class)) {
                questionTwo();
            }
            twoCorrect(num);
        }
        if (num == 3) {
            if (isTouching(QBank.class)) {
                questionThree();
            }
            threeCorrect(num);
        }
        if (num == 4) {
            if (isTouching(QBank.class)) {
                questionFour();
            }
            threeCorrect(num);
        }
        if (num == 5) {
            if (isTouching(QBank.class)) {
                questionFive();
            }
            threeCorrect(num);
        }
        if (num == 6) {
            if (isTouching(QBank.class)) {
                questionSix();
            }
            threeCorrect(num);
        }
        if (num == 7) {
            if (isTouching(QBank.class)) {
                questionSeven();
            }
            twoCorrect(num);
        }
        if (num == 8) {
            if (isTouching(Door2.class)) {
                Greenfoot.setWorld(new IceBiome());
            }
        }
    }
        
    private void historyQuestion(int number) { // SCIENCE QUESTIONS
        int num = number;
        if (num == 10) {
            if (isTouching(QBank.class)) {
                questionTen();
            }
            threeCorrect(num);
        }
        if (num == 11) {
            if (isTouching(QBank.class)) {
                questionEleven();
            }
            twoCorrect(num);
        }
        if (num == 12) {
            if (isTouching(QBank.class)) {
                questionTwelve();
            }
            oneCorrect(num);
        }
        if (num == 13) {
            if (isTouching(QBank.class)) {
                questionThirteen();
            }
            twoCorrect(num);
        }
        if (num == 14) {
            if (isTouching(QBank.class)) {
                questionFourteen();
            }
            oneCorrect(num);
        }
        if (num == 15) {
            if (isTouching(QBank.class)) {
                questionFifteen();
            }
            threeCorrect(num);
        }
        if (num == 16) {
            if (isTouching(QBank.class)) {
                questionSixteen();
            }
            oneCorrect(num);
        }
        if (num == 17) {
            if (isTouching(Door2.class)) {
                Greenfoot.setWorld(new IceBiome());
            }
        }
        }

        
        
    // HISTORY QUESTIONS:
    private void questionOne() {
        getWorld().showText("In what year did Christopher Columbus 'discover' the Americas?", getWorld().getWidth()/2, 210);
        getWorld().showText("1392", 850, 125);
        getWorld().showText("1492", 850, 290);
        getWorld().showText("1992", 850, 445);
    }
    private void questionTwo() {
        getWorld().showText("Who is the richest person in history?", getWorld().getWidth()/2, 210);
        getWorld().showText("Bill Gates", 820, 125);
        getWorld().showText("Mansa Musa", 820, 290);
        getWorld().showText("Jeff Bezos", 820, 445);
    }
    private void questionThree() {
        getWorld().showText("In what year was the US Constitution adopted?", getWorld().getWidth()/2, 210);
        getWorld().showText("1776", 850, 125);
        getWorld().showText("1812", 850, 290);
        getWorld().showText("1789", 850, 445);
    }
    private void questionFour() {
        getWorld().showText("Which Ottoman ruler used giant cannons (Dardenelles Guns) ", getWorld().getWidth()/2, 210);
        getWorld().showText("to capture the Island of Rhodes?", getWorld().getWidth()/2, 240);
        getWorld().showText("Selim the Grim", 800, 125);
        getWorld().showText("Mehmed II", 800, 290);
        getWorld().showText("Suleiman the", 800, 445);
        getWorld().showText("Magnificent", 800, 475);
    }
    private void questionFive() {
        getWorld().showText("What was Hamarabi best known for?", getWorld().getWidth()/2, 210);
        getWorld().showText("Agriculture Reform", 800, 125);
        getWorld().showText("Economic Reforom", 800, 290);
        getWorld().showText("Legal Reform", 800, 445);
    }
    private void questionSix() {
        getWorld().showText("Who was the President of the US in 1984?", getWorld().getWidth()/2, 210);
        getWorld().showText("Clinton", 800, 125);
        getWorld().showText("Bush", 800, 290);
        getWorld().showText("Reagan", 800, 445);
    }
    private void questionSeven() {
        getWorld().showText("Which US President brought the interstate to ", getWorld().getWidth()/2, 210);
        getWorld().showText("the US following WWII?", getWorld().getWidth()/2, 240);
        getWorld().showText("FDR", 800, 125);
        getWorld().showText("Eisenhower", 800, 290);
        getWorld().showText("Truman", 800, 445);
    }
    
    // SCIENCE QUESTIONS:
    private void questionTen() {
        getWorld().showText("In which solution will a cell shrink?", getWorld().getWidth()/2, 210);
        getWorld().showText("Hypotonic", 830, 125);
        getWorld().showText("Isotonic", 830, 290);
        getWorld().showText("Hypertonic", 830, 445);
    }
    private void questionEleven() {
        getWorld().showText("Is ice denser than water?", getWorld().getWidth()/2, 210);
        getWorld().showText("Yes", 850, 125);
        getWorld().showText("No", 850, 290);
        getWorld().showText("Equal", 850, 445);
    }
    private void questionTwelve() {
        getWorld().showText("Which organelle is responsible for packaging protiens?", getWorld().getWidth()/2, 210);
        getWorld().showText("Golgi", 850, 125);
        getWorld().showText("Ribosomes", 840, 290);
        getWorld().showText("Rough ER", 845, 445);
    }
    private void questionThirteen() {
        getWorld().showText("In carbohydrates, what is the ratio of hydrogen to oxygen atoms?", getWorld().getWidth()/2, 210);
        getWorld().showText("1:1", 850, 125);
        getWorld().showText("2:1", 850, 290);
        getWorld().showText("1:2", 850, 445);
    }
    private void questionFourteen() {
        getWorld().showText("What is the name of the shin bone?", getWorld().getWidth()/2, 210);
        getWorld().showText("Tibia", 850, 125);
        getWorld().showText("Fibula", 850, 290);
        getWorld().showText("Femur", 850, 445);
    }
    private void questionFifteen() {
        getWorld().showText("Ideal mechanical advantage depends on which of the following variables?", getWorld().getWidth()/2, 210);
        getWorld().showText("Mass", 850, 125);
        getWorld().showText("Force", 850, 290);
        getWorld().showText("Distance", 850, 445);
    }
    private void questionSixteen() {
        getWorld().showText("Encypt 'dog' with a caesar shift of 2 forwards?", getWorld().getWidth()/2, 210);
        getWorld().showText("fqi", 850, 125);
        getWorld().showText("ogd", 850, 290);
        getWorld().showText("bme", 850, 445);
    }

    private void endMessage() {
        getWorld().showText("Congrats! Touch the portal to claim your last five points!", getWorld().getWidth()/2, 210);
    }
    
    // scoring: if correct, add 5 points. If incorrect, set points to 0
    private void oneCorrect(int num) { // scenario where the first door has the correct answer
        if (isTouching(Door1.class)) {
            Dungeon.score += 5;
            Greenfoot.setWorld(new Dungeon(num+1));
        }
        else if (isTouching(Door2.class)) {
            removeTouching(Penguin.class);
            GameOver gOver = new GameOver();
            Dungeon.score = 0;
            getWorld().addObject(gOver, getWorld().getWidth()/2, 100);
            Dungeon.stopM();
            Greenfoot.stop();
        }
        else if (isTouching(Door3.class)) {
            removeTouching(Penguin.class);
            GameOver gOver = new GameOver();
            Dungeon.score = 0;
            getWorld().addObject(gOver, getWorld().getWidth()/2, 100);
            Dungeon.stopM();
            Greenfoot.stop();
        }
    }
    
    private void twoCorrect(int num) { //second door has correct answer
        if (isTouching(Door2.class)) {
            Dungeon.score += 5;
            Greenfoot.setWorld(new Dungeon(num+1));
        }
        else if (isTouching(Door1.class)) {
            removeTouching(Penguin.class);
            GameOver gOver = new GameOver();
            Dungeon.score = 0;
            getWorld().addObject(gOver, getWorld().getWidth()/2, 100);
            Dungeon.stopM();
            Greenfoot.stop();
        }
        else if (isTouching(Door3.class)) {
            removeTouching(Penguin.class);
            GameOver gOver = new GameOver();
            Dungeon.score = 0;
            getWorld().addObject(gOver, getWorld().getWidth()/2, 100);
            Dungeon.stopM();
            Greenfoot.stop();
        }
    }
    
    private void threeCorrect(int num) { //third door has correct answer
        if (isTouching(Door3.class)) {
            Dungeon.score += 5;
            Greenfoot.setWorld(new Dungeon(num+1));
        }
        else if (isTouching(Door1.class)) {
            removeTouching(Penguin.class);
            GameOver gOver = new GameOver();
            Dungeon.score = 0;
            getWorld().addObject(gOver, getWorld().getWidth()/2, 100);
            Greenfoot.stop();
        }
        else if (isTouching(Door2.class)) {
            removeTouching(Penguin.class);
            GameOver gOver = new GameOver();
            Dungeon.score = 0;
            getWorld().addObject(gOver, getWorld().getWidth()/2, 100);
            Dungeon.stopM();
            Greenfoot.stop();
        }
    }
}
