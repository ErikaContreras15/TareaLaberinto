/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealaberinto;
import  java.awt.Graphics ;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import  javax.swing.JFrame ;
import  javax.swing.JPanel ;

/**
 *
 * @author Erika
 */
public class Juego  extends JPanel{
    
    Laberinto laberinto =  new  Laberinto ();
    Personaje personaje =  new  Personaje ();
    
   public  Juego () {
        addMouseMotionListener ( new  MouseMotionListener () {
           // @Override
            public void mouseDragged(MouseEvent me,Graphics  grafico) {
                personaje . moverPersonaje (me, grafico);
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
               
            }
           
            });
         setFocusable(true);
    }
       
    public void paint ( Graphics grafico ) { 
        laberinto . paint(grafico);
        personaje. paint (grafico);
    }
    
    public  static  void  main ( String [] args ) {
        JFrame ventanaPrincipal =  new  JFrame ( "*******  LABERINTO ******** " );
        Juego juegoLaberinto =  new  Juego ();
        ventanaPrincipal . add (juegoLaberinto);
        
        ventanaPrincipal . setSize ( 920 , 540 );
        ventanaPrincipal . setLocation ( 300 , 200 );
        ventanaPrincipal . setVisible ( true);
        ventanaPrincipal . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        
        
      /*  while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            juegoLaberinto.repaint();
        }*/
    }
    
}
