/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import Modelo.Fuente;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;

 
/**
 * Programa para pintar una grilla
 * 
 * @author Ian Darwin, http://www.darwinsys.com/
 */
class GridsCanvas extends Canvas {
  int width, height;
 
  int rows;
 
  int cols;
  
  private Graphics g;
  
  BufferedImage image;
 
  GridsCanvas(int w, int h, int r, int c) {
    setSize(width = w, height = h);
    rows = r;
    cols = c;
    cargarImagen();
    repaint();
  }
  
 public void cargarImagen(){
     try {
         image = ImageIO.read(getClass().getClassLoader().getResource("altavoces-rectangulares-con-el-bajo_318-43650.png"));
     } catch (Exception e) {
         System.out.println("no cargo por: " + e);
     }
 }
 public void painComponent(ArrayList<Fuente> fuentes){
     for(int i=0; i<fuentes.size();i++){
        double[] posicion = fuentes.get(i).getPosicion();
        g.drawImage(image, (int) posicion[0], (int) posicion[1], null);
        repaint();
        //g.setColor(Color.red);
        //g.drawOval((int)posicion[0], (int)posicion[1],10 ,10);
         System.out.println(image);
     }
 }
  public void paint(Graphics g) {
    
    int i;
    this.setBackground(Color.WHITE);
    width = getSize().width;
    height = getSize().height;
    
    // draw the rows
    int rowHt = height / (rows);
    g.setColor(Color.BLACK);
    for (i = 0; i < rows; i++)
        
     g.drawLine(0, i * rowHt, width, i * rowHt);
     
 
    // draw the columns
    int rowWid = width / (cols);
    g.setColor(Color.BLACK);
    for (i = 0; i < cols; i++)    
      g.drawLine(i * rowWid, 0, i * rowWid, height);
    this.g = g;
  }
}
 
/** This is the demo class. */
 
public class Grids extends Frame {
  /*
   * Construct a GfxDemo2 given its title, width and height. Uses a
   * GridBagLayout to make the Canvas resize properly.
   */
  Grids(String title, int w, int h, int rows, int cols) {
    setTitle(title);
    setSize(200, 200);
    // Now create a Canvas and add it to the Frame.
    GridsCanvas xyz = new GridsCanvas(w, h, rows, cols);
    add(xyz);
 
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        setVisible(false);
        dispose();
        System.exit(0);
      }
    });
 
    // Normal end ... pack it up!
    pack();
  }
 
  public static void main(String[] a) {
    int h = 38*5;
    int w = h;
    new Grids("Test", w, h, 1, 1).setVisible(true);
  }
}