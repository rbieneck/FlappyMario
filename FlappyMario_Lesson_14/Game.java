import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author renee bieneck 
 * @version 0.7
 */
public class Game extends World
{
    private static final GreenfootImage bgImage = new GreenfootImage("bg.png");
    private int pipeCounter;
    private Score scoreCounter = new Score();
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
        setPaintOrder(Score.class, Ground.class, Mario.class, Pipe.class);

        Mario gamePlayer = new Mario();
        addObject(gamePlayer, 100, getHeight() /2);

        Ground initialGround = new Ground();
        addObject(initialGround, 309, getHeight() - 25);
        
        addObject(scoreCounter, getWidth() / 2 + 25, 30);
        scoreCounter.setScore(0);
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
        createPipe();
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


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void createPipe()
    {
        Pipe topPipe = new Pipe("top");
        Pipe botPipe = new Pipe ("bottom");
        
        int pipeSpacing = 150;
        
        GreenfootImage image = botPipe.getImage();
        
        int numOfPipes = Greenfoot.getRandomNumber(10) +4;
        
        pipeCounter++;
        if (pipeCounter == 50)
        {
            if (getObjects(Pipe.class).size() < numOfPipes)
            {
                addObject(botPipe, getWidth(), getHeight() / 2 + image.getHeight() - Greenfoot.getRandomNumber(100) - 10);
                addObject(topPipe, getWidth(), botPipe.getY() - image.getHeight() - pipeSpacing);
            }
            pipeCounter = 0;
        }
    }

}
