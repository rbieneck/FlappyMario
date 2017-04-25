import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @renee.bieneck
 * @version 0.1
 */
public class Score extends Actor
{
  public Score()
  {
      GreenfootImage scoreImage = new GreenfootImage(68, 30);
      setImage(scoreImage);
    }
    

  public void setScore(int sessionScore)
    {
        GreenfootImage scoreImage = getImage();
        scoreImage.clear();
        
        Color c = new Color(127, 127, 127, 127);
        scoreImage.setColor(c);
        scoreImage.fill();
        
        Font f = new Font("Impact", Font.PLAIN, 32);
        scoreImage.setFont(f);
        scoreImage.setColor(Color.BLACK);
        scoreImage.drawString("" + sessionScore, 0, 30);
        scoreImage.setColor(Color.WHITE);
        scoreImage.drawString("" + sessionScore, 0, 30);
        setImage(scoreImage);
    }

}
