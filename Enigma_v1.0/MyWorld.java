import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Diego Francisco De Florán Rodas 
 * @version 25/07/2021
 */
public class MyWorld extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    public void act()
    {
        showText("Clocks collected :" + score, 90,25);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
        protag protag = new protag();
        addObject(protag,79,258);
        platform platform = new platform();
        addObject(platform,87,338);
        platform platform2 = new platform();
        addObject(platform2,269,267);
        platform platform3 = new platform();
        addObject(platform3,387,224);
        platform2.setLocation(284,249);
        platform3.setLocation(396,210);
        clock clock = new clock();
        addObject(clock,254,206);
        clock clock2 = new clock();
        addObject(clock2,406,149);
        platform2.setLocation(262,276);
        clock.setLocation(242,213);
        platform3.setLocation(403,207);
        clock2.setLocation(388,170);
        clock clock3 = new clock();
        addObject(clock3,548,175);
        platform platform4 = new platform();
        addObject(platform4,530,274);
        platform4.setLocation(560,264);
        clock3.setLocation(563,215);
        clock2.setLocation(400,133);
    }
}
