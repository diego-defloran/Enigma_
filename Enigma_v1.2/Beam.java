import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beam extends Actor
{
    /**
     * Act - do whatever the Beam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void moveBeam()
    {
       setLocation(getX(), getY()+3); 
    }
    
    public void removeBeam()
    {
        if (getY() == 399)
        {
            getWorld().removeObject(this);
        }
    }
}
