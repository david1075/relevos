/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relevos;

/**
 *
 * @author david
 * clase carrera donde ocurre la instancia de las clases
 */
public class Carrera {
    
    public Carrera (){
        
    }
    /**
     * metodo empezar en donde se instancia los equipos, cada corredor como hilo con un nombre, posicion, equipo. se intancia 
     * la clase impresion como hilo
     */
    public void empezar(){
        Equipo equipo1 = new Equipo(1);
        Equipo equipo2 = new Equipo(2);
        Equipo equipo3 = new Equipo(3);
        Corredor corredor = new Corredor("juan",1,equipo1);
        Corredor corredor2 = new Corredor ("alicia", 2, equipo1);
        Corredor corredor3 = new Corredor ("pedro", 3, equipo1);
        Corredor corredor4 = new Corredor ("oscar", 1, equipo2);
        Corredor corredor5 = new Corredor ("martin", 2, equipo2);
        Corredor corredor6 = new Corredor ("jeus", 3, equipo2);
        Corredor corredor7 = new Corredor ("david", 1, equipo3);
        Corredor corredor8 = new Corredor ("duvan", 2, equipo3);
        Corredor corredor9 = new Corredor ("anderson", 3, equipo3);
        corredor.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        corredor6.start();
        corredor7.start();
        corredor8.start();
        corredor9.start();
        Impresion i = new Impresion(equipo1, equipo2, equipo3);
        i.start();
    }
}
