/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5.Controller;

import com.mycompany.practica5.View.Lienzo;
import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class ImageHandler {
    private static BufferedImage backup;
    public static void setImage(){
        Lienzo.setUrl("https://www.todopaisajes.com/1024x768/la-torre-eiffel-de-paris.jpg");
        //Lienzo.setUrl("https://ociohotelesonline.com/wp-content/uploads/2020/02/Qu%C3%A9-ver-en-Ja%C3%A9n-en-un-d%C3%ADa-de-turismo-1024x538.jpg");
       // Lienzo.setUrl("https://i.ytimg.com/vi/sr_vL2anfXA/maxresdefault.jpg");
      //  Lienzo.setUrl("https://www.losviajesdegrimes.com/wp-content/uploads/2020/04/plaza-de-san-pedro.jpg");

    }
    public static void setLogo() {
        Lienzo.setLogoUrl("https://www.logocrea.com/wp-content/uploads/2016/07/hoja2.png");
    }
    public static void setLogoPosition(String position){
 
        if(position.equals("TOPLEFT")){
            Lienzo.setLogoPosition(0, 0);
        }else if(position.equals("TOPRIGHT")){
             Lienzo.setLogoPosition(Lienzo.getImage().getWidth()-(Lienzo.getLogo().getWidth())/2, 0);
        }else if(position.equals("BOTTOMLEFT")){
             Lienzo.setLogoPosition(0, Lienzo.getImage().getHeight()-(Lienzo.getLogo().getHeight())/2);
        }else if(position.equals("BOTTOMRIGHT")){
             Lienzo.setLogoPosition(Lienzo.getImage().getWidth()-(Lienzo.getLogo().getWidth())/2, Lienzo.getImage().getHeight()-(Lienzo.getLogo().getHeight())/2);
        }
    }
    public static void applyFilter(String filter){
        BufferedImage imagen = Lienzo.getImage();
        
        int width = imagen.getWidth();
        int height = imagen.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel= imagen.getRGB(i,j);
                
                int a = (pixel>>24) &0xff;
                int r = (pixel>>16) &0xff;
                int g = (pixel>>8) &0xff;
                int b = pixel & 0xff;
                if(filter.equals("Red")){
                   r= 0;
                }else if(filter.equals("Green")){
                    g=0;
                }else if(filter.equals("Blue")){
                    b=0;
                }
               
                pixel = (a<<24) | (r<<16) | (g<<8) | b;
                
           
                imagen.setRGB(i,j,pixel);
            }
        }
       Lienzo.changeImage(imagen);
    }
    public static void unApplyFilter(String filter){
        BufferedImage imagen = Lienzo.getImage();
        BufferedImage original = Lienzo.getOriginalImage();
        
        int width = imagen.getWidth();
        int height = imagen.getHeight();
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixelOriginal= original.getRGB(i,j);
                int pixel = imagen.getRGB(i,j);
                
                int a = (pixel>>24) &0xff;
                int r = (pixel>>16) &0xff;
                int g = (pixel>>8) &0xff;
                int b = pixel & 0xff;
                
                
                int rOriginal = (pixelOriginal>>16) &0xff;
                int gOriginal = (pixelOriginal>>8) &0xff;
                int bOriginal = pixelOriginal & 0xff;
                
                
                if(filter.equals("Red")){
                    r = rOriginal;
                }else if(filter.equals("Green")){
                    g = gOriginal;
                }else if(filter.equals("Blue")){
                    b = bOriginal;
                }
               
                pixel = (a<<24) | (r<<16) | (g<<8) | b;
                imagen.setRGB(i,j,pixel);
            }
        }
         Lienzo.changeImage(imagen);  
    }

   
    public static void reset(){
        Lienzo.resetImage();
    }

    
}
