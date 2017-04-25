import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Faby here.
 * 
 * @author renne bieneck
 * @version 21.03.17
 */
public class Mario extends SharedMembers
{
    private static final GreenfootImage mario1 = new GreenfootImage("mario.png");
    private static final GreenfootImage mario2 = new GreenfootImage("mario2.png");
    private static final GreenfootImage mario3 = new GreenfootImage("mario3.png");
    private double velocity = 0;
    private static final double gravity = 0.5;
    private static final double boostSpeed = -6;

    public Mario()
    {
        setImage(mario1);
        this.animationDelay = 4;
    }

    public void act() 
    {
        applyGravity();
        checkKeys();
        animateMario();
        rotateMario();
    }    

    private void applyGravity()

    {
        setLocation(getX(), (int)(getY() + velocity));
        velocity = velocity + gravity;
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("space") == true || Greenfoot.mouseClicked(null) == true)
        { 
            velocity = boostSpeed;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void animateMario()
    {
        this.frame++;
        if (this.frame < 1 * this.animationDelay)
        {
            setImage(mario1);
        }
        else if (this.frame < 2 * this.animationDelay)
        {
            setImage(mario2);
        }
        else if (this.frame < 3 * this.animationDelay)
        {
            setImage(mario3);
            this.frame = 0;
        }

    }

    
    private void rotateMario()
    {
        if (velocity < 1)
        {
            setRotation(-30);
        }
        else if (velocity < 8)
        {
            setRotation(0);
        }
        else if (velocity < 12)
        {
            setRotation(30);
        }
        else if (velocity < 30)
        {
            setRotation(90);
        }
    }

}