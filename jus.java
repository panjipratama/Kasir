import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jus extends Actor
{
    /**
     * Act - do whatever the jus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        jus();
    }    
    
    private void jus()
    {
        if(Greenfoot.mouseClicked(this))
        {        
            getWorld().addObject(new jus(),100,67);
        }
    }
}
