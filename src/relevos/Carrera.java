/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relevos;

/**
 *
 * @author david
 */
public class Carrera {
    
    public Carrera (){
        
    }
    
    public void empezar(){
        Equipo equipo1 = new Equipo(1);
        Equipo equipo2 = new Equipo(2);
        Equipo equipo3 = new Equipo(3);
        Corredor corredor = new Corredor("juan",1,equipo1);
        Corredor corredor2 = new Corredor ("alicia", 2, equipo1);
        Corredor corredor3 = new Corredor ("pedro", 3, equipo1);
        Corredor corredora = new Corredor ("oscar", 1, equipo2);
        Corredor corredorb = new Corredor ("martin", 2, equipo2);
        Corredor corredorc = new Corredor ("jeus", 3, equipo2);
        corredor.start();
        corredor2.start();
        corredor3.start();
        corredora.start();
        corredorb.start();
        corredorc.start();
        Impresion i = new Impresion(equipo1.getPosicion_carrera(), equipo2.getPosicion_carrera(), equipo3.getPosicion_carrera());
        i.start();
    }
}
