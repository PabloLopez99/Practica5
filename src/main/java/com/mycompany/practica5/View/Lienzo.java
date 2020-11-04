/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5.View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class Lienzo extends JPanel{
    private static BufferedImage imagen = null;
    private static BufferedImage logo = null;
    private static String url="";
    private static String logoUrl="";
    private static int xcoordinate;
    private static int ycoordinate;
    public Lienzo(){
        if(imagen ==null){
            getImageFromUrl();
            getLogoFromUrl();
        }else{
            
        }
        
    }

    private static void getImageFromUrl() {
        try{
            imagen = ImageIO.read(new URL(url));
        }catch(MalformedURLException ex){
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setUrl(String url) {
        Lienzo.url=url;
    }
    public static void setLogoUrl(String url) {
        Lienzo.logoUrl=url;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen,0,0,null);
        
        g.drawImage(logo,xcoordinate,ycoordinate,null);
      
    }
    public static void changeImage(BufferedImage imagen){
        Lienzo.imagen=imagen;
    }
    public static void resetImage(){
        getImageFromUrl();
    }
    public static BufferedImage getImage(){
        return imagen;
    }
    public static BufferedImage getLogo(){
        return logo;
    }
    public static void setLogoPosition(int x, int y){
        xcoordinate=x;
        ycoordinate=y;
    }
  
    public static BufferedImage getOriginalImage(){
        BufferedImage aux=null;
         try{
            aux = ImageIO.read(new URL(url));
        }catch(MalformedURLException ex){
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
         return aux;
    }

    private void getLogoFromUrl() {
        try{
            logo = ImageIO.read(new URL(logoUrl));
            int x=logo.getWidth();
            int y= logo.getHeight();
            BufferedImage rescale= new BufferedImage(x,y,BufferedImage.TYPE_INT_ARGB);
            AffineTransform at=new AffineTransform();
            at.scale(0.5, 0.5);
            AffineTransformOp scaleOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
            rescale = scaleOp.filter(logo, rescale);
            logo=rescale;
        }catch(MalformedURLException ex){
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }    }
}
/*
BufferedImage before = getBufferedImage(encoded);
int w = before.getWidth();
int h = before.getHeight();
BufferedImage after = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
AffineTransform at = new AffineTransform();
at.scale(2.0, 2.0);
AffineTransformOp scaleOp = 
   new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
after = scaleOp.filter(before, after);
*/