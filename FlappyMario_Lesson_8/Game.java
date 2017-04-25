import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author renee bieneck 
 * @version 0.2
 */
public class Game extends World
{
    private static final GreenfootImage bgImage = new GreenfootImage("bg.png");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        Greenfoot.setSpeed(50);
        setBackground(bgImage);

        Mario gamePlayer = new Mario();
        addObject(gamePlayer, 100, getHeight() /2);

        Ground initialGround = new Ground();
        addObject(initialGround, 309, getHeight() - 25);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void act()
    {
        createGround();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void createGround()
    {
        if (getObjects(Ground.class).size() < 2)
        {
            Ground additionalGround = new Ground();
            addObject(additionalGround, 955, getHeight() - 25);
        }
    }

}
