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
public class Simulacion {
    private double velocidad;
    private double temperatura;
    private Escenario escenario;
    private double frecuenciaSimulacion;

    public Simulacion(){
        
    }
    public Simulacion(double velocidad, double temperatura, Escenario escenario,double frecuenciaSimulacion) {
        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.escenario = escenario;
        this.frecuenciaSimulacion=frecuenciaSimulacion;
    }

    
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
    
    public double getFrecuenciaSimulacion() {
        return frecuenciaSimulacion;
    }

    public void setFrecuenciaSimulacion(int frecuenciaSimulacion) {
        this.frecuenciaSimulacion = frecuenciaSimulacion;
    }
    
}
