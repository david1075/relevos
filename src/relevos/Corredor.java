/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relevos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Corredor extends Thread{
    private String nombre;
    private int posicion;
    private Equipo  equipo;
    private int recorrido = 0;
    
    public Corredor (String nombre, int posicion, Equipo equipo){
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    } 
    
    @Override
    public void run() {
        if (posicion == 1) {
            System.out.println("nombre corredor: " + nombre);
            while (recorrido < 33) {
                try {
                    equipo.random();
                    Thread.sleep(1000);
                    recorrido = recorrido + equipo.getPosicion_carrera();
                    if (recorrido > 33) {
                        recorrido = 33;
                    }
                    System.out.println("numero es: " + recorrido + "  " + nombre);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            equipo.setPosicion_carrera(recorrido);
            
            synchronized (equipo) {
                equipo.notify(); //notifica cada thread uno por uno que este sincornizado con un wait 
            }

        } else if (posicion == 2) {
            synchronized (equipo) {
                try {
                    System.out.println("estoy en espera : " + nombre);
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            recorrido = equipo.getPosicion_carrera();
            System.out.println("nombre corredor: " + nombre);
            while (recorrido < 66) {
                try {
                    equipo.random();
                    Thread.sleep(1000);
                    recorrido = recorrido + equipo.getPosicion_carrera();
                    if (recorrido > 66) {
                        recorrido = 66;
                    }
                    System.out.println("numero es: " + recorrido + "  " + nombre);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            equipo.setPosicion_carrera(recorrido);
            synchronized (equipo) {
                equipo.notify();
            }

        }else if (posicion ==3){
            synchronized (equipo) {
                try {
                    System.out.println("estoy en espera : " + nombre);
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            recorrido = equipo.getPosicion_carrera();
            System.out.println("nombre corredor: " + nombre);
            while (recorrido < 100) {
                try {
                    equipo.random();
                    Thread.sleep(1000);
                    recorrido = recorrido + equipo.getPosicion_carrera();
                    if (recorrido > 100) {
                        recorrido = 100;
                    }
                    System.out.println("numero es: " + recorrido + "  " + nombre);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            equipo.setPosicion_carrera(recorrido);
            synchronized (equipo) {
                equipo.notify();
            }
            
        }
    }

  
    
    
}

