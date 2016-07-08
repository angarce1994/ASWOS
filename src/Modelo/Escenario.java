/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author GUERRERO-PC
 */
public class Escenario {
    private double[] area;
    private Color color;
    private int resolucion;
    private Image imagen;
    private ArrayList<Fuente> fuentes;
    private int frecuencia; //índice 

    public Escenario(double[] area) {
        this.area = area;
        this.color= new Color(0,0,0);
        this.resolucion=1;
        this.fuentes = new ArrayList<>();
        this.frecuencia=0;
        
    }

    public ArrayList<Fuente> getFuentes() {
        return fuentes;
    }

    public void setFuentes(ArrayList<Fuente> fuentes) {
        this.fuentes = fuentes;
    }

    
    public double[] getArea() {
        return area;
    }

    public void setArea(double[] area) {
        this.area = area;
    }
    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
}