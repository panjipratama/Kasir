import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class MenuMakanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuMakanan extends World
{
    /**
     * Constructor for objects of class MenuMakanan.
     * 
     */
    private int nilai = 0;
    private boolean tampilin = false;
    
    burger burger = new burger();
    public MenuMakanan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
        layarMenu();
        layarBeli();
        total();
        siapMenu();
        tulisan();
    }
    
    public void prepare()
    {
        Bayar Bayar = new Bayar();
        addObject(Bayar, 730, 430);
    }
   
   public void layarMenu()
    {
        GreenfootImage image = getBackground();
        Color color = new Color (20, 250, 255, 70);
        image.setColor(java.awt.Color.BLACK);
        image.drawRect(20,13,400,110);image.drawRect(19,12,402,112);
        image.setColor(color);
        image.fillRect(20, 13, 400, 110);
        
    }
    
    public void layarBeli()
    {
        GreenfootImage image = getBackground();
        Color color = new Color (20, 250, 255, 70);
        image.setColor(java.awt.Color.BLACK);
        image.drawRect(480,15,300,350);image.drawRect(479,14,302,352);
        image.setColor(color);
        image.fillRect(480, 15, 300, 350);
    }
    
    public void total()
    {
        GreenfootImage image = getBackground();
        Color color = new Color (20, 250, 255, 70);
        image.setColor(color);
        image.fillRect(480, 315, 300, 50);
    }
    
    public void siapMenu()
    {
        kebab kebab = new kebab();
        burger burger = new burger();
        chips chips = new chips();
        soda soda = new soda();
        tea tea = new tea();
        jus jus = new jus();
        
        addObject(kebab,81, 215 );
        addObject(burger,231, 215 );
        addObject(chips,381, 215  );
        addObject(soda, 81, 385);
        addObject(tea, 231, 385);
        addObject(jus, 381, 385);
        
            GreenfootImage image = getBackground();
            image.setColor(java.awt.Color.WHITE);
            image.drawString("  Rp. ", 200,50);
        
    }
    
    public void tulisan()
    {
            GreenfootImage tulis = getBackground();
            Font font = getBackground().getFont(); 
            font = font.deriveFont(20.0f);
            getBackground().setFont(font);
            
            tulis.setColor(java.awt.Color.WHITE);
            tulis.drawString("TOTAL BELI : ",485,347);

            tulis.setColor(java.awt.Color.WHITE);
            tulis.drawString("MENU MAKANAN : ",30,145);
    }  
}
