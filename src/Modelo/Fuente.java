/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Logica.FuenteControlador;

/**
 *
 * @author GUERRERO-PC
 */
public class Fuente {
    
    private double[] sensibilidad;
    private double potencia;
    private double[] posicion;
    private String nombre;
    private double splmax;
    
     public Fuente(double[] sensibilidad, double potencia, double[] posicion,String nombre) {
        this.sensibilidad = sensibilidad;
        this.potencia = potencia;
        this.nombre = nombre;
        this.posicion = posicion;
        this.splmax= FuenteControlador.splmax(this);
    }
    public double getSplMax(){
        return splmax;
    }

    public double[] getSensibilidad(){
        return sensibilidad;
    }

    public void setSensibilidad(double[] sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setPosicion(double[] posicion) {
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPotencia(){
        return potencia;
    }
    public double[] getPosicion(){
        return posicion;
    }
    public String getNombre(){
        return nombre;
    }
    
}
