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
 * clase corredor donde cada corredor se comporta como un hilo
 */
public class Corredor extends Thread{
    private String nombre;
    private int posicion;
    private Equipo  equipo;
    private int recorrido = 0; 
    private boolean estado = true;
    /**
     * constructor de la clase corredor donde se reciben el nombre del corredor, la posicion que ocupa en la carrera
     * el equipo al que pertenece
     * @param nombre
     * @param posicion
     * @param equipo 
     */
    public Corredor (String nombre, int posicion, Equipo equipo){
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    } 
    /**
     * metodo run() por donde inicia el hilo, depende la posicion del corredor ejecuta una accion y deja en espera
     * a los demas corredores de su mismo equipo
     */
    @Override
    public void run() {
        if (posicion == 1) {
            System.out.println("nombre corredor 1: " + nombre);
            while (recorrido < 33) {
                try {
                    equipo.random();
                    Thread.sleep(1000);
                    recorrido = recorrido + equipo.getAleatorio();
                    equipo.setPosicion_carrera(recorrido);
                    if (recorrido > 33) {
                        recorrido = 33;
                    }
                
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
                    System.out.println("estoy en espera corredor 2: " + nombre);
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            recorrido = equipo.getPosicion_carrera();
            System.out.println("inicio corredor 2: " + nombre);
            while (recorrido < 66) {
                try {
                    //llama metodo que devuelve numero aleatorio
                    equipo.random();
                    Thread.sleep(1000);
                    recorrido = recorrido + equipo.getAleatorio();
                    equipo.setPosicion_carrera(recorrido);
                    if (recorrido > 66) {
                        recorrido = 66;
                    }
                 //   System.out.println("numero es: " + recorrido + "  " + nombre);
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
                    System.out.println("estoy en espera corredor 3 : " + nombre);
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            recorrido = equipo.getPosicion_carrera();
            System.out.println("inicio corredor 3: " + nombre);
            while (recorrido < 100) {
                try {
                    equipo.random();
                    Thread.sleep(1000);
                    recorrido = recorrido + equipo.getAleatorio();
                    equipo.setPosicion_carrera(recorrido);
                    if (recorrido > 100) {
                        recorrido = 100;
                        Thread.interrupted();
                    }
                 //   System.out.println("numero es: " + recorrido + "  " + nombre);
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

