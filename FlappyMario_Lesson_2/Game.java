import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author renee bieneck 
 * @version 0.1
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
        super(600, 400, 1); 
        Greenfoot.setSpeed(50);
        setBackground(bgImage);
    }
}
