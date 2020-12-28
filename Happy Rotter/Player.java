import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int cooldown = 0;
    private static int health = 7;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    // public void setHealth()
    // {
        // if(/* one of the player characters get hit*/)
        // {
            // health--;
        // }
    // }
    public static int getHealth()
    {
        return health;
    }
}
