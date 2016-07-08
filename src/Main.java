
import Modelo.Aswos;
import Modelo.Escenario;
import Modelo.Simulacion;
import vistas.intDATOS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUERRERO-PC
 */
public class Main {
    
    
    public static void main(String args[]) {
        Simulacion simulacion = new Simulacion();
        Aswos.getAswos(simulacion);
        final intDATOS mainApp = new intDATOS();
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainApp.setVisible(true);
            }
        });
    }
}
