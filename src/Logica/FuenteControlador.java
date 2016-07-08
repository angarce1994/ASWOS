/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Modelo.Fuente;
import Modelo.Simulacion;
import vistas.CaracteristicasFuente;


/**
 *
 * @author GUERRERO-PC
 */
public class FuenteControlador {
    //Frecuencia frec=new Frecuencia;
    public static double splmax(Fuente f1){
        
        double[] sensibilidad = f1.getSensibilidad();
        double potencia = f1.getPotencia();
        return Math.rint(sensibilidad[1]+(10*Math.log10(potencia))*1000/1000);
    }
    
    public static double  distanciamax(Fuente f1, double[] punto){
        double[] posicionFuente = f1.getPosicion();
        double x = Math.pow((punto[0]-posicionFuente[0]),2.0);
        double y = Math.pow((punto[1]-posicionFuente[1]),2.0);
        double distancia = Math.sqrt(y+x);
        return Math.rint(distancia*1000/1000);
    }
    
    public static double SplTotal(Fuente f1,double[] punto){
        double splMaximo = splmax(f1);
        double distanciaMaxima = distanciamax(f1, punto);
        return Math.rint(splMaximo-(20*Math.log10(distanciaMaxima))*1000/1000);
    }
    
    
    
    public static void main(String[] args) {
        double[] sensib={120,123};
        
        double[] posicionFuente = {2,3};
        double[] punto = {10,3};
        Fuente f1 = new Fuente(sensib, 7,posicionFuente , "prueba");
        System.out.println(f1.getSplMax());
        System.out.println(distanciamax(f1, punto));
        System.out.println(SplTotal(f1, punto));
    }
}