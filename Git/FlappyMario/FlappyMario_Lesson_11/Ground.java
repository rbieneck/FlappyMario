import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * renee.bieneck 
 * 04.04.2017
 */
public class Ground extends SharedMembers
{
    private static final GreenfootImage ground = new GreenfootImage("untergrund.png");

    public Ground()
    {
        setImage(ground);
        this.xSpeed = 4;
    }

    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.moveLeft();
        removeGround();
    }  

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void removeGround()
    {
        if (getX() < - getImage().getWidth() / 2)
        {
            getWorld().removeObject(this);
        }
    }

}
