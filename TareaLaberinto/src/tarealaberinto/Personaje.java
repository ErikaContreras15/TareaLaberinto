/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealaberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

/**
 *
 * @author Erika
 */
public class Personaje {
    
    private int x =  40 ;
    private int y =  40 ;
     
    private  final  int alto =  40 ;
    private final int ancho = 40 ;
    private final int  movimiento= 40 ; 
    
    public void  paint ( Graphics grafico ) { 
        grafico . setColor ( Color.GREEN);
        grafico . fillOval (x, y, ancho, alto);
        grafico . setColor ( Color.black);
        grafico . drawOval (x, y, ancho, alto);
    }
    
  public  void  moverPersonaje ( MouseEvent  me , Graphics  grafico ) {
        if (me . getModifiersEx () ==  MouseEvent . BUTTON1_DOWN_MASK ) {
            grafico . setColor ( Color .WHITE );
            grafico . fillOval (x, y, ancho, alto);
            grafico . setColor ( Color .black );
            grafico . drawOval (x, y, ancho, alto);
        }
    }
    
   /* public void teclaPresionada(KeyEvent evento){
        if(evento.getKeyCode()==4){ //PARA MOVERSE HACIA LA IZQUIERDA
            x=x-movimiento;
        }
        if(evento.getKeyCode()==5){ //PARA MOVERSE HACIA LA DERECHA
              x=x+movimiento;
        }
        if(evento.getKeyCode()==6){ //PARA MOVERSE HACIA ABAJO
              y=y+movimiento;
        }
        if(evento.getKeyCode()==7){ //PARA MOVERSE HACIA ARRIBA
              y=y-movimiento;
        }
        }*/
        
    }


