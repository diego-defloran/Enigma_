import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clock extends Actor
{
    /**
     * Act - do whatever the clock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public clock()
    {
        GreenfootImage myImage = getImage();
        int myNewWidth = (int) myImage.getWidth()/9;
        int myNewHeight = (int)myImage.getHeight()/9;
        myImage.scale(myNewWidth,myNewHeight);
    }
}
