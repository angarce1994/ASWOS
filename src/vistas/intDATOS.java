package vistas;

import Logica.EscenarioControlador;
import Logica.FuenteControlador;
import Modelo.Aswos;
import Modelo.Escenario;
import Modelo.Fuente;
import Modelo.Simulacion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.util.ArrayList;
import sun.net.www.content.image.gif;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUERRERO-PC
 */
public class intDATOS extends javax.swing.JFrame {
    int heig;
    int width;
    double[] area = new double[2];
    //GridsCanvas gridCanvas;
    private Dimension dim;
    /**
     * 
     * Creates new form intDATOS
     */
    public intDATOS() {
        
        heig=getToolkit().getScreenSize().height ;
        width=getToolkit().getScreenSize().width ;
        
        
        
        //super.setUndecorated(true);
        //super.setVisible(true);        
        
        
        area[0] = width-38;
        area[1] = heig-200;
        //gridCanvas = new GridsCanvas((int)area[0], (int)area[1], 10, 10);
        //panelCanvas.add(gridCanvas);
        
        initComponents();
        dim=super.getToolkit().getScreenSize();
        super.setSize(dim);
    }
    
    public void modificarCanvasFuentes(){
        panelEscenario.repaint();
    }
    public void modeficarCanvasEscenario(){
        panelEscenario.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        freq = new javax.swing.JComboBox<String>();
        nuevafuente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        PanelDatos = new javax.swing.JPanel();
        lblDatos = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        nuevafuente1 = new javax.swing.JButton();
        panelEscenario = new vistas.panelEscenario((int)area[0], (int)area[1], 10, 10);
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevoarchivo = new javax.swing.JMenuItem();
        abrirarchivo = new javax.swing.JMenuItem();
        guardararchivo = new javax.swing.JMenuItem();
        guardarcomo = new javax.swing.JMenuItem();
        importar = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        Rehacer = new javax.swing.JMenuItem();
        deshacer = new javax.swing.JMenuItem();
        seleccionar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        herramientas = new javax.swing.JMenu();
        zoomin = new javax.swing.JMenuItem();
        zoomout = new javax.swing.JMenuItem();
        grilla = new javax.swing.JMenuItem();
        reporte = new javax.swing.JMenuItem();
        preferencias = new javax.swing.JMenu();
        unidades = new javax.swing.JMenuItem();
        medidas = new javax.swing.JMenuItem();
        temperatura = new javax.swing.JMenuItem();
        fondo = new javax.swing.JMenuItem();
        resoluciongrilla = new javax.swing.JMenuItem();
        colorgrilla = new javax.swing.JMenuItem();
        paletaSPL = new javax.swing.JMenuItem();
        vistas = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASWOS 1.0");
        setAlwaysOnTop(true);
        setIconImages(getIconImages());
        setResizable(false);

        freq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "20 Hz", "25 Hz", "31.5 Hz", "40 Hz", "50 Hz", "63 Hz", "80 Hz", "100 Hz", "125Hz", "160 Hz", "200 Hz", "250 kHz" }));
        freq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freqActionPerformed(evt);
            }
        });

        nuevafuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/altavoces-rectangulares-con-el-bajo_318-43650.png"))); // NOI18N
        nuevafuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevafuenteActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mas.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menos.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(55, 31));
        jButton4.setMinimumSize(new java.awt.Dimension(55, 31));
        jButton4.setPreferredSize(new java.awt.Dimension(55, 31));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flat-symbol-theme-action-move-icon-moving.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grid.gif"))); // NOI18N
        jButton5.setAlignmentX(0.5F);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Simulacion"));

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblInfo)
                .addGap(157, 157, 157)
                .addComponent(lblDatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatos)
                    .addComponent(lblInfo))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lblInfo.getAccessibleContext().setAccessibleName("lblInfo");

        nuevafuente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo.png"))); // NOI18N
        nuevafuente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevafuente1ActionPerformed(evt);
            }
        });

        panelEscenario.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEscenarioLayout = new javax.swing.GroupLayout(panelEscenario);
        panelEscenario.setLayout(panelEscenarioLayout);
        panelEscenarioLayout.setHorizontalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelEscenarioLayout.setVerticalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        archivo.setText("Archivo");

        nuevoarchivo.setText("Nuevo");
        nuevoarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoarchivoActionPerformed(evt);
            }
        });
        archivo.add(nuevoarchivo);

        abrirarchivo.setText("Abrir");
        abrirarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirarchivoActionPerformed(evt);
            }
        });
        archivo.add(abrirarchivo);

        guardararchivo.setText("Guardar");
        archivo.add(guardararchivo);

        guardarcomo.setText("Guardar como...");
        archivo.add(guardarcomo);

        importar.setText("Importar ");
        importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarActionPerformed(evt);
            }
        });
        archivo.add(importar);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        jMenuBar1.add(archivo);

        edicion.setText("Edición");

        Rehacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        Rehacer.setText("Rehacer");
        edicion.add(Rehacer);

        deshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        deshacer.setText("Deshacer");
        deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshacerActionPerformed(evt);
            }
        });
        edicion.add(deshacer);

        seleccionar.setText("Seleccionar");
        edicion.add(seleccionar);

        jMenuItem1.setText("Copiar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        edicion.add(jMenuItem1);

        jMenuItem2.setText("Pegar");
        edicion.add(jMenuItem2);

        jMenuItem3.setText("Borrar");
        edicion.add(jMenuItem3);

        jMenuBar1.add(edicion);

        herramientas.setText("Herramientas");

        zoomin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        zoomin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mas.png"))); // NOI18N
        zoomin.setText("Zoom In");
        herramientas.add(zoomin);

        zoomout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, 0));
        zoomout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menos.png"))); // NOI18N
        zoomout.setText("Zoon Out");
        herramientas.add(zoomout);

        grilla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        grilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grid.gif"))); // NOI18N
        grilla.setText("Grilla");
        herramientas.add(grilla);

        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdf.png"))); // NOI18N
        reporte.setText("Reporte");
        herramientas.add(reporte);

        jMenuBar1.add(herramientas);

        preferencias.setText("Preferencias");

        unidades.setText("Unidades");
        unidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesActionPerformed(evt);
            }
        });
        preferencias.add(unidades);

        medidas.setText("Medidas");
        medidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medidasActionPerformed(evt);
            }
        });
        preferencias.add(medidas);

        temperatura.setText("Temperatura");
        preferencias.add(temperatura);

        fondo.setText("Fondo");
        fondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoActionPerformed(evt);
            }
        });
        preferencias.add(fondo);

        resoluciongrilla.setText("Resolución de Grilla");
        preferencias.add(resoluciongrilla);

        colorgrilla.setText("Color Grilla");
        colorgrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorgrillaActionPerformed(evt);
            }
        });
        preferencias.add(colorgrilla);

        paletaSPL.setText("Paleta SPL");
        preferencias.add(paletaSPL);

        jMenuBar1.add(preferencias);

        vistas.setText("Vistas");

        jMenuItem20.setText("Planta");
        vistas.add(jMenuItem20);

        jMenuItem21.setText("Corte  ");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        vistas.add(jMenuItem21);

        jMenuItem22.setText("Respuesta en Frecuencia");
        vistas.add(jMenuItem22);

        jMenuBar1.add(vistas);

        ayuda.setText("Ayuda");
        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(nuevafuente1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nuevafuente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(freq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(206, 206, 206)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevafuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(freq)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevafuente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int frec = freq.getSelectedIndex();
        Aswos.getAswos().getSimulacion().getEscenario().setFrecuencia(frec);
        ArrayList<Fuente> fuentes= Aswos.getAswos().getSimulacion().getEscenario().getFuentes();
        
        for(int i=0;i<fuentes.size();i++){
            fuentes.get(i).setSplMax(FuenteControlador.splmax(fuentes.get(i)));
        }
        //gridCanvas.painComponent(fuentes);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void abrirarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirarchivoActionPerformed
       SelectionArchive arch = new SelectionArchive(this, true);
       arch.setLocation(300, 50);
       arch.setVisible(true);
       
    }//GEN-LAST:event_abrirarchivoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void deshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshacerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deshacerActionPerformed

    private void unidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesActionPerformed

    private void medidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidasActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarActionPerformed
       SelectionImage img = new SelectionImage(this, true);
       img.setLocation(300, 50);
       img.setVisible(true);
    }//GEN-LAST:event_importarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void freqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freqActionPerformed
        
        
        
    }//GEN-LAST:event_freqActionPerformed

    private void nuevoarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoarchivoActionPerformed
       CaracteristicasSimulacion carc = new CaracteristicasSimulacion(this, true);
       carc.setLocation(300, 50);
       carc.setVisible(true);
    }//GEN-LAST:event_nuevoarchivoActionPerformed

    private void nuevafuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevafuenteActionPerformed
        try {
            Escenario esc = Aswos.getAswos().getSimulacion().getEscenario();    
            CaracteristicasFuente carfuente = new CaracteristicasFuente(this, true);
            carfuente.setLocation(300, 50);
            carfuente.setVisible(true);
        } catch (Exception e) {
            MessageAlert MSS = new MessageAlert(this, true);
            MSS.setLocation(300, 50);
            MSS.setVisible(true);
            CaracteristicasSimulacion carc = new CaracteristicasSimulacion(this, true);
            carc.setLocation(300, 50);
            carc.setVisible(true);
        }
        
    }//GEN-LAST:event_nuevafuenteActionPerformed

    private void colorgrillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorgrillaActionPerformed
       ColorSelection col = new ColorSelection(this, true);
       col.setLocation(300, 50);
       col.setVisible(true);
    }//GEN-LAST:event_colorgrillaActionPerformed

    private void fondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoActionPerformed
        ColorSelection col = new ColorSelection(this, true);
        col.setLocation(300, 50);
        col.setVisible(true);
    }//GEN-LAST:event_fondoActionPerformed

    private void nuevafuente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevafuente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevafuente1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(intDATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(intDATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(intDATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(intDATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
           
            public void run() {
                new intDATOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelDatos;
    private javax.swing.JMenuItem Rehacer;
    private javax.swing.JMenuItem abrirarchivo;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenuItem colorgrilla;
    private javax.swing.JMenuItem deshacer;
    private javax.swing.JMenu edicion;
    private javax.swing.JMenuItem fondo;
    public static javax.swing.JComboBox<String> freq;
    private javax.swing.JMenuItem grilla;
    private javax.swing.JMenuItem guardararchivo;
    private javax.swing.JMenuItem guardarcomo;
    private javax.swing.JMenu herramientas;
    private javax.swing.JMenuItem importar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JLabel lblDatos;
    public javax.swing.JLabel lblInfo;
    private javax.swing.JMenuItem medidas;
    private javax.swing.JButton nuevafuente;
    private javax.swing.JButton nuevafuente1;
    private javax.swing.JMenuItem nuevoarchivo;
    private javax.swing.JMenuItem paletaSPL;
    private vistas.panelEscenario panelEscenario;
    private javax.swing.JMenu preferencias;
    private javax.swing.JMenuItem reporte;
    private javax.swing.JMenuItem resoluciongrilla;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem seleccionar;
    private javax.swing.JMenuItem temperatura;
    private javax.swing.JMenuItem unidades;
    private javax.swing.JMenu vistas;
    private javax.swing.JMenuItem zoomin;
    private javax.swing.JMenuItem zoomout;
    // End of variables declaration//GEN-END:variables
}
