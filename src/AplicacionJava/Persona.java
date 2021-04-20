
package AplicacionJava;

import javax.swing.*;
import java.awt.*;
import java.awt.Window;

public class Persona extends JPanel{

     
    
            public int x =10  , y =200, dir=2;
       public int vel =2;

    public void pintarPer( Graphics g )
    { super.paintComponent( g ); // call superclass's paintComponent

   


             ImageIcon image;
         image = new ImageIcon (getClass().getResource("mini-loader.gif"));
g.drawImage(image.getImage(), x,400,100,100,this);


{         
       
 }

    }public void mover (){

          if (dir ==2){

             if(x<600){
                 x+=vel;
             }else {
                 x=-90;
             }
         }             
             
         }

 }




