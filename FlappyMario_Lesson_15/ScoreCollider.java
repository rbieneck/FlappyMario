import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ScoreCollider here.
 * 
 * @author renee.bieneck
 * @version 0.2
 */
public class ScoreCollider extends SharedMembers
{
    GreenfootImage image = new GreenfootImage(10, 400);
    /**
     * Act - do whatever the ScoreCollider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ScoreCollider()
    {
        this.xSpeed = 4;
        image.setColor(Color.RED);
        image.fill();
        setImage(image);
        image.setTransparency(0);
    }   
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void act()
    {
       this.moveLeft();
       checkCollision();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void checkCollision()
    {
        Actor Mario = getOneIntersectingObject(Mario.class);
        if (Mario != null)
        {
            Game level = (Game) getWorld();
            Score addPoints = level.getScore();
            addPoints.setScore(1);
            getWorld().removeObject(this);
        }
        else if (getX() <- getImage().getWidth())
        {
            getWorld().removeObject(this);
        }
    }

}
