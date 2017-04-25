import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Faby here.
 * 
 * @author renne bieneck
 * @version 14.03.17
 */
public class Mario extends SharedMembers
{ public static final GreenfootImage mario1 = new GreenfootImage("mario.png");

    private double velocity = 0;
    private static final double gravity = 0.5;
    private static final double boostSpeed = -6;

    public Mario()
    {
        setImage(mario1);
    }

    public void act() 
    {
        applyGravity();
        checkKeys();
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
}