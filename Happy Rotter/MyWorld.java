import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 370, 1); 
        setWorld();
    }
    
    //setWorld
    public void setWorld()
    {
        addObject(new HappyRotter(), 50, 330);
        addObject(new Tomatomort(), 550, 330);
        
        Heart hrHeart = new Heart();
        Heart tmHeart = new Heart();
        addObject(hrHeart, 20, 20);
        addObject(tmHeart, 370, 20);
        
        Health hrHealth = new Health();
        Health tmHealth = new Health();
        addObject(hrHealth, 130, 20);
        addObject(tmHealth, 480, 20);
    }
}
