/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relevos;

import java.util.Random;

/**
 *
 * @author david
 */
public class Equipo {
    private byte equipo;
    private int posicion_carrera;
    Random rand = new Random();
    
    
    public Equipo (int equipo){
        this.equipo = (byte)equipo;
    }
    
    public void  random(){
        int random = 1 + rand.nextInt(3);
        posicion_carrera = random;
    }

    public byte getEquipo() {
        return equipo;
    }

    public void setEquipo(byte equipo) {
        this.equipo = equipo;
    }

    public int getPosicion_carrera() {
        return posicion_carrera;
    }

    public void setPosicion_carrera(int posicion_carrera) {
        this.posicion_carrera = posicion_carrera;
    }
    
    
    
    
}
