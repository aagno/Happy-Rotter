import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet3 extends Bullet
{
    public Bullet3()
    {
        GreenfootImage bullet = getImage();
        int newHeight = (int)bullet.getHeight() / 2;
        int newWidth = (int)bullet.getWidth() / 2;
        bullet.scale(newWidth, newHeight);
    }
    /**
     * Act - do whatever the Bullet3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Greenfoot.playSound("pew.wav");
        // if(getX() <= 0 || getX() >= 590)
        // {
            // getWorld().removeObject(this);
        // }
        // move(30);
        goShoot();
    }    
}
