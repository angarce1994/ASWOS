/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static Logica.FuenteControlador.SplTotal;
import static Logica.FuenteControlador.distanciamax;
import Modelo.Aswos;
import Modelo.Escenario;
import Modelo.Fuente;
import java.util.ArrayList;

/**
 *
 * @author GUERRERO-PC
 */
public class EscenarioControlador {
    public static double splEnergetico(ArrayList<Fuente> arregloFuentes, double[]punto){
         double sumatoria=0;
       for(int i=0; i<arregloFuentes.size();i++ ){
            double splTotalFuente= FuenteControlador.SplTotal(arregloFuentes.get(i), punto);
            double Spart1=Math.pow(10,splTotalFuente/10);
            sumatoria= Spart1+sumatoria;
    }
       double TotalPunto= 10*Math.log10(sumatoria);
       return Math.rint(TotalPunto);
    }
    
   
    
    public static void main(String[] args) {
        double[] posicionFuente = {2,3};
        double[] sensib={120,123};
        double[] posicionFuente2 = {4,5};
        double[] punto = {10,3};
        Fuente f1 = new Fuente(sensib, 70,posicionFuente , "prueba");
        Fuente f2 = new Fuente(sensib, 70,posicionFuente2 , "prueba1");
        ArrayList<Fuente> arregloFuentes= new ArrayList<> ();
        arregloFuentes.add(f2);
        arregloFuentes.add(f1);
        double Total=splEnergetico(arregloFuentes, punto);
        System.out.println("splEnergetico: " + Total);
    }
}