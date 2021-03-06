/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5.View;

import com.mycompany.practica5.Controller.ImageHandler;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ItemEvent;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private boolean noeffect = false;
    private boolean blue=true;
    private boolean green=true;
    private boolean red=true;
            
    public MainJFrame() {
        ImageHandler.setImage();
        ImageHandler.setLogo();
     
        
        initComponents();
        initializeButtonGroup();
        ImageHandler.setLogoPosition("TOPRIGHT");
        this.setSize(new Dimension(1030,1030));
        this.setResizable(false);
        this.setVisible(true);
    }
    private void initializeButtonGroup(){
        buttonGroup.add(arribaIzquierdaButton);
        buttonGroup.add(arribaDerechaButton);
        buttonGroup.add(abajoIzquierdaButton);
        buttonGroup.add(abajoDerechaButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lienzo2 = new com.mycompany.practica5.View.Lienzo();
        jPanel1 = new javax.swing.JPanel();
        redCheckBox = new javax.swing.JCheckBox();
        greenCheckBox = new javax.swing.JCheckBox();
        blueCheckBox = new javax.swing.JCheckBox();
        allCheckBox = new javax.swing.JCheckBox();
        titleLabel = new javax.swing.JLabel();
        authorsLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        abajoIzquierdaButton = new javax.swing.JRadioButton();
        abajoDerechaButton = new javax.swing.JRadioButton();
        arribaIzquierdaButton = new javax.swing.JRadioButton();
        arribaDerechaButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout lienzo2Layout = new javax.swing.GroupLayout(lienzo2);
        lienzo2.setLayout(lienzo2Layout);
        lienzo2Layout.setHorizontalGroup(
            lienzo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzo2Layout.setVerticalGroup(
            lienzo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        redCheckBox.setSelected(true);
        redCheckBox.setText("Rojo");
        redCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                redCheckBoxItemStateChanged(evt);
            }
        });

        greenCheckBox.setSelected(true);
        greenCheckBox.setText("Verde");
        greenCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                greenCheckBoxItemStateChanged(evt);
            }
        });

        blueCheckBox.setSelected(true);
        blueCheckBox.setText("Azul");
        blueCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                blueCheckBoxItemStateChanged(evt);
            }
        });

        allCheckBox.setSelected(true);
        allCheckBox.setText("Todos");
        allCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allCheckBoxItemStateChanged(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        titleLabel.setText("RGB PICKER");

        authorsLabel.setText("Azael Santana Henríquez y Pablo López Martín");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(redCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(greenCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blueCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allCheckBox))))
                    .addComponent(authorsLabel))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(authorsLabel)
                .addGap(38, 38, 38)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redCheckBox)
                    .addComponent(greenCheckBox)
                    .addComponent(blueCheckBox)
                    .addComponent(allCheckBox))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));

        abajoIzquierdaButton.setText("Abajo Izquierda");
        abajoIzquierdaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoIzquierdaButtonActionPerformed(evt);
            }
        });

        abajoDerechaButton.setText("Abajo Derecha");
        abajoDerechaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoDerechaButtonActionPerformed(evt);
            }
        });

        arribaIzquierdaButton.setText("Arriba Izquierda");
        arribaIzquierdaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaIzquierdaButtonActionPerformed(evt);
            }
        });

        arribaDerechaButton.setSelected(true);
        arribaDerechaButton.setText("Arriba Derecha");
        arribaDerechaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaDerechaButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Posición del logo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(abajoIzquierdaButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abajoDerechaButton)
                            .addComponent(arribaDerechaButton)
                            .addComponent(arribaIzquierdaButton)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arribaIzquierdaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arribaDerechaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abajoIzquierdaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abajoDerechaButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lienzo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lienzo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_redCheckBoxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            red=true;
            ImageHandler.unApplyFilter("Red");
            lienzo2.repaint();
        }else if(evt.getStateChange() == ItemEvent.DESELECTED){
            red=false;
            noeffect= true;allCheckBox.setSelected(false);noeffect=false;
            if(!blue && !green){
               greenCheckBox.setSelected(true); 
            }
            ImageHandler.applyFilter("Red");
            lienzo2.repaint();
        }
    }//GEN-LAST:event_redCheckBoxItemStateChanged

    private void greenCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_greenCheckBoxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            green=true;
            ImageHandler.unApplyFilter("Green");
            lienzo2.repaint();
        }else if(evt.getStateChange() == ItemEvent.DESELECTED){
            green=false;
            noeffect= true;allCheckBox.setSelected(false);noeffect=false;
            if(!green && !red){
               blueCheckBox.setSelected(true); 
            }
            ImageHandler.applyFilter("Green");
            lienzo2.repaint();
        }
    }//GEN-LAST:event_greenCheckBoxItemStateChanged

    private void blueCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_blueCheckBoxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            blue=true;
            ImageHandler.unApplyFilter("Blue");
            lienzo2.repaint();
        }else if(evt.getStateChange() == ItemEvent.DESELECTED){
            blue=false;
            noeffect= true; allCheckBox.setSelected(false);noeffect=false;
            if(!red && !green){
               redCheckBox.setSelected(true); 
            }
            ImageHandler.applyFilter("Blue");
            lienzo2.repaint();
        }
    }//GEN-LAST:event_blueCheckBoxItemStateChanged

    private void allCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allCheckBoxItemStateChanged
        if(!noeffect){
            if(evt.getStateChange() == ItemEvent.SELECTED){
                redCheckBox.setSelected(true);
                blueCheckBox.setSelected(true);
                greenCheckBox.setSelected(true);
            }else if(evt.getStateChange() == ItemEvent.DESELECTED){
                redCheckBox.setSelected(true);
                blueCheckBox.setSelected(false);
                greenCheckBox.setSelected(false);
                lienzo2.repaint();
            }
        }
    }//GEN-LAST:event_allCheckBoxItemStateChanged

    private void arribaIzquierdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaIzquierdaButtonActionPerformed
        ImageHandler.setLogoPosition("TOPLEFT");
        lienzo2.repaint();
    }//GEN-LAST:event_arribaIzquierdaButtonActionPerformed

    private void arribaDerechaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaDerechaButtonActionPerformed
        ImageHandler.setLogoPosition("TOPRIGHT");
        lienzo2.repaint();
    }//GEN-LAST:event_arribaDerechaButtonActionPerformed

    private void abajoIzquierdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoIzquierdaButtonActionPerformed
        ImageHandler.setLogoPosition("BOTTOMLEFT");
        lienzo2.repaint();
    }//GEN-LAST:event_abajoIzquierdaButtonActionPerformed

    private void abajoDerechaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoDerechaButtonActionPerformed
        ImageHandler.setLogoPosition("BOTTOMRIGHT");
        lienzo2.repaint();
    }//GEN-LAST:event_abajoDerechaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abajoDerechaButton;
    private javax.swing.JRadioButton abajoIzquierdaButton;
    private javax.swing.JCheckBox allCheckBox;
    private javax.swing.JRadioButton arribaDerechaButton;
    private javax.swing.JRadioButton arribaIzquierdaButton;
    private javax.swing.JLabel authorsLabel;
    private javax.swing.JCheckBox blueCheckBox;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JCheckBox greenCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.mycompany.practica5.View.Lienzo lienzo2;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
