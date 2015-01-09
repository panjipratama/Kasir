import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tea extends Actor
{
    /**
     * Act - do whatever the tea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        tea();
    }    
    
    private void tea()
    {
        if(Greenfoot.mouseClicked(this))
        {        
            getWorld().addObject(new tea(),100,67);
        }
    }
}
