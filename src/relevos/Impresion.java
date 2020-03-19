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
public class Impresion extends Thread{
    
    private int equipo1,equipo2,equipo3;
    
    public Impresion (int equipo1,int equipo2, int equipo3 ){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
    }
    
    @Override
    public void run() {
        
        
        try {
            Thread.sleep(2000);
            imprimir();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Impresion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void imprimir(){
        
        
            System.out.println("x" + equipo1);
            System.out.println("y" + equipo2);
            System.out.println("z" + equipo3);
        
       
    }

    public int getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(int equipo1) {
        this.equipo1 = equipo1;
    }

    public int getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(int equipo2) {
        this.equipo2 = equipo2;
    }

    public int getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(int equipo3) {
        this.equipo3 = equipo3;
    }
    

}  

