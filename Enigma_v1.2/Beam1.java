import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beam1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beam1 extends Beam
{
    /**
     * Act - do whatever the Beam1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Beam1()
    {
        setRotation(270);
        GreenfootImage myImage = getImage();
        int myNewWidth = (int) myImage.getWidth()/18;
        int myNewHeight = (int)myImage.getHeight()/18;
        myImage.scale(myNewWidth,myNewHeight);
    }
    
    public void act()
    {
        moveBeam();
        removeBeam();
    }
}
