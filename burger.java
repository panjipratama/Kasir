import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burger extends Actor
{
    private GreenfootImage img1=new GreenfootImage(500,500);
    private int hargaBurger;
    
    /**
     * Act - do whatever the burger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Burger();
    }   
    
    public burger()
    {
        hargaBurger = 25000;
    }
    private void Burger()
    {
        if(Greenfoot.mouseClicked(this))
        {       
            getWorld().addObject(new burger(),100,67);
            
        }
    }
    
    public int getHargaBurger(){
        return hargaBurger;
    }
}
