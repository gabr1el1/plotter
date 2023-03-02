/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dibujo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

import evs.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Graficador extends javax.swing.JFrame {
    CoordenadasNormalizadas cn = new CoordenadasNormalizadas();
    Evaluador evaluador;
    int posicionX=0;
    
   
    /**
     * Creates new form Tranformaciones
     */
    public Graficador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        xmminLbl = new javax.swing.JLabel();
        ymminLbl = new javax.swing.JLabel();
        xmmaxLbl = new javax.swing.JLabel();
        ymmaxLbl = new javax.swing.JLabel();
        xmminSpn = new javax.swing.JSpinner();
        ymminSpn = new javax.swing.JSpinner();
        xmmaxSpn = new javax.swing.JSpinner();
        ymmaxSpn = new javax.swing.JSpinner();
        cartesianChBx = new javax.swing.JCheckBox();
        gridChBx = new javax.swing.JCheckBox();
        marksChBx = new javax.swing.JCheckBox();
        clearScreenBtn = new javax.swing.JButton();
        clearScreenLbl = new javax.swing.JLabel();
        panelOeste = new javax.swing.JPanel();
        expresionLbl = new javax.swing.JLabel();
        expresionTxtField = new javax.swing.JTextField();
        valoresTxtField = new javax.swing.JTextField();
        valoresLbl = new javax.swing.JLabel();
        graficarBtn = new javax.swing.JButton();
        aclaracionXLbl = new javax.swing.JLabel();
        canvas = new javax.swing.JPanel();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        panelSuperior.setBackground(new java.awt.Color(102, 102, 255));
        panelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        xmminLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xmminLbl.setForeground(new java.awt.Color(102, 255, 102));
        xmminLbl.setText("XMmin");

        ymminLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ymminLbl.setForeground(new java.awt.Color(102, 255, 102));
        ymminLbl.setText("YMmin");

        xmmaxLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xmmaxLbl.setForeground(new java.awt.Color(102, 255, 102));
        xmmaxLbl.setText("XMmax");

        ymmaxLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ymmaxLbl.setForeground(new java.awt.Color(102, 255, 102));
        ymmaxLbl.setText("YMmax");

        xmminSpn.setModel(new javax.swing.SpinnerNumberModel(0, -1000, 0, 1));
        xmminSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xmminSpnStateChanged(evt);
            }
        });

        ymminSpn.setModel(new javax.swing.SpinnerNumberModel(0, -1000, 0, 1));
        ymminSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ymminSpnStateChanged(evt);
            }
        });

        xmmaxSpn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        xmmaxSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xmmaxSpnStateChanged(evt);
            }
        });

        ymmaxSpn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        ymmaxSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ymmaxSpnStateChanged(evt);
            }
        });

        cartesianChBx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cartesianChBx.setForeground(new java.awt.Color(255, 255, 255));
        cartesianChBx.setText("Draw Cartesian Axes");
        cartesianChBx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartesianChBxMouseClicked(evt);
            }
        });
        cartesianChBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartesianChBxActionPerformed(evt);
            }
        });

        gridChBx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gridChBx.setForeground(new java.awt.Color(255, 255, 255));
        gridChBx.setText("Grid Lines");
        gridChBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridChBxActionPerformed(evt);
            }
        });

        marksChBx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marksChBx.setForeground(new java.awt.Color(255, 255, 255));
        marksChBx.setText("Draw Marks");
        marksChBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksChBxActionPerformed(evt);
            }
        });

        clearScreenBtn.setText("x");
        clearScreenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearScreenBtnActionPerformed(evt);
            }
        });

        clearScreenLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearScreenLbl.setForeground(new java.awt.Color(102, 255, 102));
        clearScreenLbl.setText("Clear Screen");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSuperiorLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(xmminLbl))
                            .addGroup(panelSuperiorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(xmminSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ymminSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ymminLbl))
                        .addGap(18, 18, 18)
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xmmaxSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xmmaxLbl))
                        .addGap(18, 18, 18)
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSuperiorLayout.createSequentialGroup()
                                .addComponent(ymmaxLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearScreenLbl))
                            .addGroup(panelSuperiorLayout.createSequentialGroup()
                                .addComponent(ymmaxSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                .addComponent(clearScreenBtn)
                                .addGap(32, 32, 32))))
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cartesianChBx, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marksChBx)
                        .addGap(18, 18, 18)
                        .addComponent(gridChBx)))
                .addContainerGap())
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xmminLbl)
                    .addComponent(ymminLbl)
                    .addComponent(xmmaxLbl)
                    .addComponent(ymmaxLbl)
                    .addComponent(clearScreenLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(xmminSpn)
                    .addComponent(ymminSpn)
                    .addComponent(xmmaxSpn)
                    .addComponent(ymmaxSpn)
                    .addComponent(clearScreenBtn))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartesianChBx)
                    .addComponent(gridChBx)
                    .addComponent(marksChBx)))
        );

        panelOeste.setBackground(new java.awt.Color(102, 255, 102));
        panelOeste.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelOeste.setFocusCycleRoot(true);

        expresionLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        expresionLbl.setForeground(new java.awt.Color(102, 102, 255));
        expresionLbl.setText("Expresión");

        expresionTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expresionTxtFieldActionPerformed(evt);
            }
        });

        valoresLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valoresLbl.setForeground(new java.awt.Color(102, 102, 255));
        valoresLbl.setText("Valores");

        graficarBtn.setText("Graficar");
        graficarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarBtnActionPerformed(evt);
            }
        });

        aclaracionXLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aclaracionXLbl.setForeground(new java.awt.Color(102, 102, 255));
        aclaracionXLbl.setText("(Para literales diferentes a X)");

        javax.swing.GroupLayout panelOesteLayout = new javax.swing.GroupLayout(panelOeste);
        panelOeste.setLayout(panelOesteLayout);
        panelOesteLayout.setHorizontalGroup(
            panelOesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOesteLayout.createSequentialGroup()
                .addGroup(panelOesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOesteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valoresTxtField))
                    .addGroup(panelOesteLayout.createSequentialGroup()
                        .addGroup(panelOesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOesteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(expresionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelOesteLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(expresionLbl))
                            .addGroup(panelOesteLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(graficarBtn))
                            .addGroup(panelOesteLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(valoresLbl)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelOesteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aclaracionXLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOesteLayout.setVerticalGroup(
            panelOesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOesteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(expresionLbl)
                .addGap(18, 18, 18)
                .addComponent(expresionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valoresLbl)
                .addGap(4, 4, 4)
                .addComponent(aclaracionXLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valoresTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graficarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        canvas.setBackground(new java.awt.Color(0, 0, 0));
        canvas.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelOeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartesianChBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartesianChBxActionPerformed
        // TODO add your handling code here:
        this.dibujaCartesiano();
        
    }//GEN-LAST:event_cartesianChBxActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        this.cn.setRangoDispositivo(0, 0, canvas.getWidth()-1,canvas.getHeight()-1);
        this.dibujaCartesiano();
    }//GEN-LAST:event_formComponentResized

    private void cartesianChBxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartesianChBxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cartesianChBxMouseClicked

    private void gridChBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridChBxActionPerformed
        // TODO add your handling code here:
        this.dibujaCartesiano();
    }//GEN-LAST:event_gridChBxActionPerformed

    private void marksChBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marksChBxActionPerformed
        // TODO add your handling code here:
        this.dibujaCartesiano();
    }//GEN-LAST:event_marksChBxActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        cn.setRangoDispositivo(0, 0, canvas.getWidth()-1, canvas.getHeight()-1);
        cn.setRangoMundiales((int)this.xmminSpn.getValue(),(int)this.ymminSpn.getValue(),(int)this.xmmaxSpn.getValue(),(int)this.ymmaxSpn.getValue());
       
  
        
        
        this.dibujaCartesiano();
    }//GEN-LAST:event_formComponentShown

    private void xmminSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xmminSpnStateChanged
        // TODO add your handling code here:
        cn.XMmin=(int)this.xmminSpn.getValue();
        //System.out.println(cn.YMmin);
        this.dibujaCartesiano();
    }//GEN-LAST:event_xmminSpnStateChanged

    private void ymminSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ymminSpnStateChanged
        // TODO add your handling code here:
        cn.YMmin=(int)this.ymminSpn.getValue();
        this.dibujaCartesiano();
    }//GEN-LAST:event_ymminSpnStateChanged

    private void xmmaxSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xmmaxSpnStateChanged
        // TODO add your handling code here:
        cn.XMmax=(int)this.xmmaxSpn.getValue();
        this.dibujaCartesiano();
    }//GEN-LAST:event_xmmaxSpnStateChanged

    private void ymmaxSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ymmaxSpnStateChanged
        // TODO add your handling code here:
        cn.YMmax=(int)this.ymmaxSpn.getValue();
        this.dibujaCartesiano();
    }//GEN-LAST:event_ymmaxSpnStateChanged

    private void expresionTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expresionTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expresionTxtFieldActionPerformed

    private void graficarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarBtnActionPerformed
        evaluador = new Evaluador();
        evaluador.expresionInfija=this.expresionTxtField.getText();
        evaluador.expresionPostfija=EntrefijoAPostfijo.Infijo2PosfijoTxt(evaluador.expresionInfija);
        try {
            evaluador.asignarValoresX(evaluador.expresionPostfija, this.valoresTxtField.getText().split(","));
        } catch (Exception ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        dibujaFuncion();
        
    }//GEN-LAST:event_graficarBtnActionPerformed

    private void clearScreenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearScreenBtnActionPerformed
        // TODO add your handling code here:
        canvas.repaint();
        this.cartesianChBx.setSelected(false);
        this.marksChBx.setSelected(false);
        this.gridChBx.setSelected(false);
        
    }//GEN-LAST:event_clearScreenBtnActionPerformed
    
    private void dibujaFuncion(){
        
       Graphics2D g2d = (Graphics2D)canvas.getGraphics();
       g2d.setColor(Color.RED);
       double y;
        
       for(double x=cn.XMmin;x<cn.XMmax;x+=0.001){
           
            if(evaluador.hayX){
                double valorParaX=x;
                for(int i=0;i<evaluador.posicionesX.size();i++){

                    evaluador.evaluables.get(evaluador.posicionesX.get(i)).valor=valorParaX;

                }
            
            }
            y=evaluador.evaluar(evaluador.evaluables);
            g2d.drawLine(cn.getXD(x), cn.getYD(y), cn.getXD(x), cn.getYD(y));
            
       }
        
        
    }
    
    private void dibujaCartesiano(){
        
        Graphics2D g2d = (Graphics2D)canvas.getGraphics();
        canvas.update(g2d);

        
        if(this.gridChBx.isSelected()){
            
            g2d.setColor(Color.GRAY);			
            float guiones[]= {3,3};
            g2d.setStroke(new BasicStroke(0,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,0, guiones,0));
            
            //LINEAS DEL GRID VERTICALES
            for(double i=cn.XMmin;i<=cn.XMmax;i++)g2d.drawLine(cn.getXD(i),cn.getYD(cn.YMmax),cn.getXD(i),cn.getYD(cn.YMmin)); 
            //LINEAS DEL GRID HORIZONTALES
            for(double i=cn.YMmin;i<=cn.YMmax;i++)g2d.drawLine(cn.getXD(cn.XMmin),cn.getYD(i),cn.getXD(cn.XMmax),cn.getYD(i)); 								   
        }
        g2d.setColor(Color.GREEN);
        //DIBUJA EJE X y Y
        if(this.cartesianChBx.isSelected()){
            //EJE HORIZONTAL
            g2d.drawLine(cn.getXD(cn.XMmin),cn.getYD(0),cn.getXD(cn.XMmax),cn.getYD(0));  
            //EJE VERTICAL
            g2d.drawLine(cn.getXD(0),cn.getYD(cn.YMmax), cn.getXD(0),cn.getYD(cn.YMmin)); 
        }
        if(this.marksChBx.isSelected()){
            //MARCAS EJE VERTICALNM, 
            for(double i=cn.XMmin;i<cn.XMmax;i++)g2d.drawLine(cn.getXD(i), cn.getYD(0)-5, cn.getXD(i), cn.getYD(0)+5);
            for(double i=cn.YMmin;i<cn.YMmax;i++)g2d.drawLine(cn.getXD(0)-5, cn.getYD(i), cn.getXD(0)+5, cn.getYD(i));  
        }
        
    }
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
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficador().setVisible(true);
               
            }
        });
    }
    
    
    
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aclaracionXLbl;
    public javax.swing.JPanel canvas;
    private javax.swing.JCheckBox cartesianChBx;
    private javax.swing.JButton clearScreenBtn;
    private javax.swing.JLabel clearScreenLbl;
    private javax.swing.JLabel expresionLbl;
    private javax.swing.JTextField expresionTxtField;
    private javax.swing.JButton graficarBtn;
    private javax.swing.JCheckBox gridChBx;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox marksChBx;
    private javax.swing.JPanel panelOeste;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel valoresLbl;
    private javax.swing.JTextField valoresTxtField;
    private javax.swing.JLabel xmmaxLbl;
    private javax.swing.JSpinner xmmaxSpn;
    private javax.swing.JLabel xmminLbl;
    private javax.swing.JSpinner xmminSpn;
    private javax.swing.JLabel ymmaxLbl;
    private javax.swing.JSpinner ymmaxSpn;
    private javax.swing.JLabel ymminLbl;
    private javax.swing.JSpinner ymminSpn;
    // End of variables declaration//GEN-END:variables


}


    
