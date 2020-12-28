import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    //private int rotation;
    // /**
     // * Act - do whatever the Bullet wants to do. This method is called whenever
     // * the 'Act' or 'Run' button gets pressed in the environment.
     // */
    // public void act() 
    // {
        
    // }
    
    /*
     *  getRandomNumber - returns a random number between .0 - .99 to determine 
     *                      what bullet image is used
     *  Written by Arianne Agno
     */
    public static double getRandomNumber()
    {
        return Math.random();
    }
    
    /*
     *  goShoot - how the bullets will act when set in the world. This method is called
     *              whenever the bullet is set into the world.
     *  Written by Arianne Agno
     */
    public void goShoot()
    {
        Greenfoot.playSound("pew.wav");
        if(getX() <= 0 || getX() >= 590)
        {
            getWorld().removeObject(this);
        }
        move(30);
    }
}
