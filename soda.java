import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class soda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class soda extends Actor
{
    /**
     * Act - do whatever the soda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        soda();
    }    
    
    private void soda()
    {
        if(Greenfoot.mouseClicked(this))
        {        
            getWorld().addObject(new soda(),100,67);
        }
    }
}
