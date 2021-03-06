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
    private GreenfootSound music = new GreenfootSound("Dark Synthwave Music - Devour.mp3");
    
    public void started()
    {
        music.playLoop();
    }
    
    public void stopped()
    {
        music.stop();
    }
    
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
        if(Greenfoot.getRandomNumber(70)<1)
        {
        addBeam1();
        }
    }
    
    private void addBeam1()
    {
        addObject(new Beam1(), Greenfoot.getRandomNumber(600), 0);
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
        platform2.setLocation(244,270);
        clock clock4 = new clock();
        addObject(clock4,99,87);
        platform platform5 = new platform();
        addObject(platform5,162,191);
        platform5.setLocation(91,132);
        clock4.setLocation(83,83);
        platform5.setLocation(84,120);
        clock4.setLocation(90,79);
        platform5.setLocation(98,113);
        clock4.setLocation(87,14);
        clock4.setLocation(101,53);
        platform platform6 = new platform();
        addObject(platform6,448,388);
        platform6.setLocation(387,336);
        clock clock5 = new clock();
        addObject(clock5,400,262);
        clock5.setLocation(387,299);
        clock5.setLocation(381,255);
        clock5.setLocation(396,275);
        platform4.setLocation(591,248);
        platform platform7 = new platform();
        addObject(platform7,518,79);
        platform7.setLocation(530,68);
        platform7.setLocation(558,61);
        platform7.setLocation(545,83);
        clock clock6 = new clock();
        addObject(clock6,513,28);
        clock6.setLocation(536,39);
        clock clock7 = new clock();
        addObject(clock7,312,80);
        platform platform8 = new platform();
        addObject(platform8,329,161);
        clock7.setLocation(281,41);
        platform8.setLocation(283,71);
        platform8.setLocation(289,103);
        platform8.setLocation(292,112);
        clock7.setLocation(278,56);
        platform7.setLocation(527,36);
        platform7.setLocation(523,84);
        clock6.setLocation(535,48);
        platform7.setLocation(536,121);
        platform4.setLocation(557,247);
        removeObject(platform4);
        clock3.setLocation(560,221);
        removeObject(clock3);
        platform2.setLocation(208,260);
        platform.setLocation(61,367);
        protag.setLocation(54,312);
        platform2.setLocation(215,332);
        clock.setLocation(214,281);
        platform6.setLocation(397,364);
        clock5.setLocation(396,302);
        platform3.setLocation(545,239);
        clock2.setLocation(546,187);
        platform7.setLocation(444,121);
        clock6.setLocation(427,96);
        platform7.setLocation(385,176);
        clock6.setLocation(393,124);
        platform8.setLocation(223,171);
        clock7.setLocation(205,112);
        platform5.setLocation(88,99);
        clock4.setLocation(111,81);
        clock4.setLocation(111,65);
        clock4.setLocation(55,51);
        platform5.setLocation(49,170);
        clock4.setLocation(70,119);
        platform6.setLocation(341,261);
        platform6.setLocation(350,208);
        platform3.setLocation(490,206);
        clock2.setLocation(503,126);
        platform8.setLocation(242,162);
        removeObject(platform8);
        clock7.setLocation(207,120);
        removeObject(clock7);
        platform5.setLocation(71,165);
        removeObject(platform5);
        removeObject(clock4);
        platform7.setLocation(203,128);
        clock6.setLocation(200,70);
        platform7.setLocation(117,120);
        clock6.setLocation(124,78);
        platform7.setLocation(145,167);
        clock6.setLocation(133,116);
        clock5.setLocation(339,106);
        clock5.setLocation(340,96);
        clock5.setLocation(348,138);
        clock2.setLocation(491,157);
        platform6.setLocation(361,241);
        clock5.setLocation(354,175);
        platform3.setLocation(523,113);
        platform3.setLocation(511,186);
        platform3.setLocation(518,133);
        platform3.setLocation(516,53);
        platform3.setLocation(528,147);
        platform3.setLocation(509,64);
        clock2.setLocation(381,64);
        platform3.setLocation(520,315);
        clock2.setLocation(514,261);
    }
}
