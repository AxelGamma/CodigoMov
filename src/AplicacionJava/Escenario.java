
package AplicacionJava;

import javax.swing.*;
import java.awt.*;

public class Escenario extends JFrame{
    

private Persona pe;

private Sol so; 

PanelEs esc;
    public Escenario (){
        
       esc = new PanelEs();
so =  new Sol();
       pe = new Persona();
       

 add(esc);
      
            
    }

     class PanelEs extends JPanel {

         public void paintComponent (Graphics g)  {
             
             super.paintComponent(g);
         Graphics2D g2d = (Graphics2D) g;
         
         Sol sol = new Sol ();
         so.SolDibujar(g);
         so.movernubes();
       
         pe.pintarPer(g);
         pe.mover();
         
        }
    }
    
    
    
    
    
    
}
