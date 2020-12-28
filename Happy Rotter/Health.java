import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HR_Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    public Health()
    {
        GreenfootImage health = getImage();
        int newHeight = (int)health.getHeight() / 5;
        int newWidth = (int)health.getWidth() / 5;
        health.scale(newWidth, newHeight);
    }
    /**
     * Act - do whatever the HR_Health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
