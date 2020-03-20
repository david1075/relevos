/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relevos;

import java.util.Random;

/**
 * clase equipo donde estan las caracterisiticas del equipo como posicion actual del corredor, el numero
 * que identifica al equipo
 * @author david
 */
public class Equipo {
    private byte equipo;
    private int posicion_carrera = 0, aleatorio;
    Random rand = new Random();
    
    /**
     * constructor de la clase corredor que recibe un numero entero que identifica al equipo
     * @param equipo 
     */
    public Equipo (int equipo){
        this.equipo = (byte)equipo;
    }
    /**
     * metodo que genera un numero aleatorio para ser utilizado en la cantidad de pasos que debe recorrer un corredor
     */
    public void  random(){
        int random = 1 + rand.nextInt(3);
        aleatorio = random;
    }

    public byte getEquipo() {
        return equipo;
    }

    public void setEquipo(byte equipo) {
        this.equipo = equipo;
    }
    
    public   int getPosicion_carrera() {
        return posicion_carrera;
    }

    public  void setPosicion_carrera(int posicion_carrera) {
        this.posicion_carrera = posicion_carrera;
    }

    public int getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }
    
    
    
    
    
}
