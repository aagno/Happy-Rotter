import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
/**
 * Write a description of class HappyRotter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HappyRotter extends Player
{
    private int cooldown = 0;     //the idea of a cooldown came from 
                                  //https://www.greenfoot.org/scenarios/10065
                                  //the cooldown is used to limit the amount of bullets shot
                                  //within a certain amount of time
    public HappyRotter()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int)myImage.getHeight() / 4;
        int newWidth = (int)myImage.getWidth() / 4;
        myImage.scale(newWidth, newHeight);
    }
    /**
     * Act - do whatever the HappyRotter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        /* Allows obj to move when keys are pressed,and 
         * it cannot move past a certain point due to an invisible barrier
         * the barrier prevents it from moving too far to the right
         * -
         * Written by Emily Hernandez
         */
        if (Greenfoot.isKeyDown("a"))// moves left
        {
            move(-3);
        }
        if(Greenfoot.isKeyDown("d"))//moves right
        {
            move(3);
        }
        setRotation(90);
        if(Greenfoot.isKeyDown("w"))//moves up
        {
            move(-3);
        }
        if(Greenfoot.isKeyDown("s"))//moves down
        {
            move(3);
        }
        setRotation(0);
        if(Greenfoot.isKeyDown("m"))//shoots
        {
            shoot();
        }
        //invisible barrier
        if(getX()> 190) 
            {
                setLocation(190, getY());
            }
        if(getY()< 55) 
            {
                setLocation(getX(), 55);
            }
    }    
    
    /*
     *  Shoot - determines how the bullet objects are set into the world.
     *          This method is called whenever "m" is pressed.
     *  Written by Arianne Agno
     */
    public void shoot()
    {
        if(cooldown == 0)
        {
            Bullet bullet = new Bullet();
            if(bullet.getRandomNumber() < .33)
            {
                bullet = new Bullet1();
            }
            else if(bullet.getRandomNumber() < .66)
            {
                bullet = new Bullet2();
            }
            else
            {
                bullet = new Bullet3();
            }
            getWorld().addObject(bullet,getX(),getY());
            cooldown = 15;
        }
        cooldown -= 1;
    }
}
