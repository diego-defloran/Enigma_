import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platform extends Actor
{
    public platform()
    {
        GreenfootImage myImage = getImage();
        int myNewWidth = (int) myImage.getWidth()/4;
        int myNewHeight = (int)myImage.getHeight()/4;
        myImage.scale(myNewWidth,myNewHeight);
    }
}
