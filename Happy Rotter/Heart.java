import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    private GreenfootImage heart;
    public Heart()
    {
        heart = getImage();
        int newHeight = (int)heart.getHeight() / 20;
        int newWidth = (int)heart.getWidth() / 20;
        heart.scale(newWidth, newHeight);
    }
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
