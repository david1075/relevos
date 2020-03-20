/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relevos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *clase impresion que recibe objetos de tipo equipo para saber las posiciones actuales de cada uno y asi imprimir
 * los resultados por pantalla
 * @author david
 */
public class Impresion extends Thread{
    
    private Equipo equipo1, equipo2, equipo3;
    /**
     * constructor de la clase impresion que recibe como parametros 3 objetos de tipo equipo
     * @param equipo1
     * @param equipo2
     * @param equipo3 
     */
    public Impresion (Equipo equipo1,Equipo equipo2, Equipo equipo3 ){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
    }
    
    /**
     * metodo por donde inicia el hilo de impresion que va hasta el momento en que el equipo termine la carrera, imprimiendo
     * paso por paso el avance de cada equipo con cada uno de sus corredores
     */
    
    @Override
    public void run() {
        while (equipo1.getPosicion_carrera() < 100 || equipo2.getPosicion_carrera() < 100 || equipo3.getPosicion_carrera()<100) {
            try {

                Thread.sleep(1000);

                for (int i = 0; i < equipo1.getPosicion_carrera(); i++) {
                    System.out.print("*");

                }

                System.out.println("");
                System.out.println("equipo1  " + equipo1.getPosicion_carrera());
                System.out.println("");

                for (int j = 0; j < equipo2.getPosicion_carrera(); j++) {
                    System.out.print("°");
                }

                System.out.println("");
                System.out.println("equipo2 " + equipo2.getPosicion_carrera());
                System.out.println("");
                for (int k = 0; k < equipo3.getPosicion_carrera(); k++) {
                    System.out.print("|");
                }

                System.out.println("");
                System.out.println("equipo3 " + equipo3.getPosicion_carrera());
                System.out.println("");
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Impresion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
           
      
        
        
    }
    
}

       
        
    
    
   


   
    

  

