import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @renee.bieneck
 * @version 0.2
 */
public class Score extends Actor
{
    private int scoreGained;
  public Score()
  {
      GreenfootImage scoreImage = new GreenfootImage(68, 30);
      setImage(scoreImage);
    }
    

  public void setScore(int sessionScore)
    {
        scoreGained += sessionScore;
        
        GreenfootImage scoreImage = getImage();
        scoreImage.clear();
        
        Color c = new Color(127, 127, 127, 127);
        scoreImage.setColor(c);
        scoreImage.fill();
        
        Font f = new Font("Impact", Font.PLAIN, 32);
        scoreImage.setFont(f);
        scoreImage.setColor(Color.BLACK);
        scoreImage.drawString("" + scoreGained, 0, 30);
        scoreImage.setColor(Color.WHITE);
        scoreImage.drawString("" + scoreGained, 0, 30);
        setImage(scoreImage);
    }

  /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getScore()
    {
        return scoreGained;
    }

}
