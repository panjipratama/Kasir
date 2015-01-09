import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kebab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kebab extends Actor
{
    /**
     * Act - do whatever the kebab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        kebab();
    }    
    
    private void kebab()
    {
        if(Greenfoot.mouseClicked(this))
        {        
           getWorld().addObject(new kebab(),100,67);
        }
    }
}
