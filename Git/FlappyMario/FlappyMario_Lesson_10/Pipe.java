import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 *renee bieneck
 *04.04.2017
 */
public class Pipe extends SharedMembers
{
    private static final GreenfootImage Bottom = new GreenfootImage ("bottom_pipe.png");
    private static final GreenfootImage Top = new GreenfootImage ("top_pipe.png");
    
    public Pipe(String selection)
    {
        if (selection == "top")
        {
            setImage(Top);
        }
        else if (selection == "bottom")
        {
            setImage(Bottom);
        }
    }
    
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
