/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author GUERRERO-PC
 */
public class Aswos {
    private Simulacion simulacion;
    private static Aswos miAswos;
    
    
    private Aswos(Simulacion sim){
        simulacion = sim;
    }
    
    public static Aswos getAswos(Simulacion sim){
        if(miAswos == null){
            miAswos = new Aswos(sim);
        }
        return miAswos;
    }
    public static Aswos getAswos(){
        
        return miAswos;
    }
    public Simulacion getSimulacion() {
        return simulacion;
    }

    public void setSimulacion(Simulacion simulacion) {
        this.simulacion = simulacion;
    }
    
}
