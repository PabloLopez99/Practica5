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
