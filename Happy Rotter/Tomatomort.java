    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class tomatomort here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Tomatomort extends Player
    {
        private int cooldown = 0; //the idea of a cooldown came from 
                                  //https://www.greenfoot.org/scenarios/10065
                                  //the cooldown is used to limit the amount of bullets shot
                                  //within a certain amount of time
        public Tomatomort()
        {
            GreenfootImage myImage = getImage();
            int newHeight = (int)myImage.getHeight() / 5;
            int newWidth = (int)myImage.getWidth() / 5;
            myImage.scale(newWidth, newHeight);
        }
        /**
         * Act - do whatever the tomatomort wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
        {
            // Add your action code here.
            /*
             * Allows obj to move when keys are pressed,and 
             * it cannot move past a certain point due to an invisible barrier
             * the barrier prevents it from going too far to the left
             * -
             * Written by Emily Hernandez
             */
          
            if (Greenfoot.isKeyDown("4")) //key moves right
            {
                move(3);
            }
            if(Greenfoot.isKeyDown("6")) //key moves right
            {
                move(-3);
            }
            setRotation(90);
            if(Greenfoot.isKeyDown("8"))// key moves up
            {
                move(-3);
            }
            if(Greenfoot.isKeyDown("5"))//key moves down
            {
                move(3);
            }
            setRotation(180);
            shoot();
            //sets barrier- prevents obj from moving past certain point
            if(getX()< 365) 
                {
                    setLocation(365, getY());
                }
            if(getY()< 55) 
                {
                    setLocation(getX(), 55);
                }
        } 
        /*
         *  Shoot - determines how the bullet objects are set into the world.
         *          This method is called whenever "enter" is pressed.
         *  Written by Arianne Agno
         */
        public void shoot()
        {
            if(Greenfoot.isKeyDown("enter"))
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
                    bullet.setRotation(getRotation());
                    cooldown = 15;
                }
                cooldown -= 1;
            }
        }
        
    }
