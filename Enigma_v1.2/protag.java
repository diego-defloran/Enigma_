import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class protag here.
 * 
 * @author Diego Francisco De Florán Rodas 
 * @version 24/07/2021
 */
public class protag extends Actor
{
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    MyWorld thisGame;
    
    public void act()
    {
        checkKeys();
        checkFall();
        time();
        removeFromWorld();
    }

    private void removeFromWorld()
    {
        Actor protag = getOneIntersectingObject(Beam.class);
        if (protag != null)
        {
            getWorld().removeObject(protag);
            getWorld().setBackground("GameOver.png");
            
        }
        
    }
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            setImage("protag_left.png");
            moveLeft();
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setImage("protag_right.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("w"))
        {
            jump();
        }
        if (Greenfoot.isKeyDown("s"))
        {
            movedown();
        }
    }
    
    private void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else 
        {
            fall();
        }
    }
    private void moveRight()
    {
        setLocation( getX() + speed, getY());
    }
    
    private void moveLeft()
    {
        setLocation( getX() - speed, getY());
    }
    
    private void jump()
    {
        vSpeed = -5;
        fall();
    }
    
    private void movedown()
    {
        setLocation(getX(), getY()+30);
    }
    
    private boolean onGround()
    {
        GreenfootImage myImage = getImage();
        int Height = myImage.getHeight();
        Actor under = getOneObjectAtOffset(0, Height/3, platform.class);
        return under != null;
    }
    
    private void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    private void time()
    {
        Actor clock;
        clock = getOneObjectAtOffset(0,0,clock.class);
        if (clock != null)
        {
            World world;
            world = getWorld();
            world.removeObject(clock);
            thisGame.score++;
        }
    }
}
