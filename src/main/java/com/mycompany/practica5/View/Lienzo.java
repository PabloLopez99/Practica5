/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5.View;

import java.awt.Color;
import java.awt.Graphics;
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
    private static String url="";
    
    public Lienzo(){
        if(imagen ==null){
            getImageFromUrl();
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
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen,0,0,null);
      
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
}
