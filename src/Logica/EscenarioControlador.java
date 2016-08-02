/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static Logica.FuenteControlador.SplTotal;
import static Logica.FuenteControlador.distanciamax;
import Modelo.Aswos;
import Modelo.Coords;
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
    
   public static double matrixCoordenadas(double[] area){
       
       
       int x = 0;
       int y = 0;
       
           System.out.println(area[0]);   
           System.out.println(area[1]);
           for(int j=0 ; j < area[1] ; j++){
               
                for(int i=0 ; i < area[0] ; i++){
                    x=(38*1)+x;
                    if (x<area[0] && y<area[1]){
                        Coords coor=new Coords(x, y);
                        //Escenario esc = Aswos.getAswos().getSimulacion().getEscenario();
                        //esc.getCoordenadas().add(coor);
                        System.out.println(x+" , "+y);
                    }
                    if(x > area[0]){
                        x=0;
                        break;
                        
                        
                    }
                    
                }
                
                
                y=(38*1)+y;
                if(y > area[1]){
                        break;
                    }
                System.out.println(y);
       
            }
               
       return x;
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