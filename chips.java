import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chips extends Actor
{
    /**
     * Act - do whatever the chips wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        chips();
    }  
    
    private void chips()
    {
        if(Greenfoot.mouseClicked(this))
        {        
            getWorld().addObject(new chips(),100,67);
        }
    }
}
