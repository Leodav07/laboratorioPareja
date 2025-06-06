/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratoriopareja;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author hnleo
 */
public class memoramaPantalla extends javax.swing.JFrame {

    /**
     * Creates new form memoramaPantalla
     */
    public memoramaPantalla() {
        initComponents();
        iniciar();
    }
    private memoramaJuego inicio;
    private JButton buttons[][];
    private void iniciar(){
        inicio = new memoramaJuego(6, 6);
        botonesArreglo();
        oportunidades.setText("Numero de intentos: "+inicio.contador);
    }
    
    private void botonesArreglo(){
        buttons = new JButton[6][6];
        buttons[0][0] = boton1_0;
        buttons[0][1] = boton1_1;
        buttons[0][2] = boton1_2;
        buttons[0][3] = boton1_3;
        buttons[0][4] = boton1_4;
        buttons[0][5] = boton1_5;
        buttons[1][0] = boton2_0;
        buttons[1][1] = boton2_1;
        buttons[1][2] = boton2_2;
        buttons[1][3] = boton2_3;
        buttons[1][4] = boton2_4;
        buttons[1][5] = boton2_5;
        buttons[2][0] = boton3_0;
        buttons[2][1] = boton3_1;
        buttons[2][2] = boton3_2;
        buttons[2][3] = boton3_3;
        buttons[2][4] = boton3_4;
        buttons[2][5] = boton3_5;
        buttons[3][0] = boton4_0;
        buttons[3][1] = boton4_1;
        buttons[3][2] = boton4_2;
        buttons[3][3] = boton4_3;
        buttons[3][4] = boton4_4;
        buttons[3][5] = boton4_5;
        buttons[4][0] = boton5_0;
        buttons[4][1] = boton5_1;
        buttons[4][2] = boton5_2;
        buttons[4][3] = boton5_3;
        buttons[4][4] = boton5_4;
        buttons[4][5] = boton5_5;
        buttons[5][0] = boton6_0;
        buttons[5][1] = boton6_1;
        buttons[5][2] = boton6_2;
        buttons[5][3] = boton6_3;
        buttons[5][4] = boton6_4;
        buttons[5][5] = boton6_5;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                final int row = i;
                final int column = j;
                buttons[i][j].addActionListener(e -> clics(row, column));
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
                
            }
        }
    }
    private void clics(int row, int column){
       inicio.seleccionDeCasilla(row, column, buttons[row][column]);
       
       if(inicio.finalJuego()){
           JOptionPane.showMessageDialog(this, "Intentos Máximos alcanzados.");
          
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroPanel = new javax.swing.JPanel();
        boton1_0 = new javax.swing.JButton();
        boton1_1 = new javax.swing.JButton();
        boton1_2 = new javax.swing.JButton();
        boton1_3 = new javax.swing.JButton();
        boton1_4 = new javax.swing.JButton();
        boton1_5 = new javax.swing.JButton();
        boton2_0 = new javax.swing.JButton();
        boton2_1 = new javax.swing.JButton();
        boton2_2 = new javax.swing.JButton();
        boton2_3 = new javax.swing.JButton();
        boton2_4 = new javax.swing.JButton();
        boton2_5 = new javax.swing.JButton();
        boton3_0 = new javax.swing.JButton();
        boton3_1 = new javax.swing.JButton();
        boton3_2 = new javax.swing.JButton();
        boton3_3 = new javax.swing.JButton();
        boton3_4 = new javax.swing.JButton();
        boton3_5 = new javax.swing.JButton();
        boton4_0 = new javax.swing.JButton();
        boton4_1 = new javax.swing.JButton();
        boton4_2 = new javax.swing.JButton();
        boton4_3 = new javax.swing.JButton();
        boton4_4 = new javax.swing.JButton();
        boton4_5 = new javax.swing.JButton();
        boton5_0 = new javax.swing.JButton();
        boton5_1 = new javax.swing.JButton();
        boton5_2 = new javax.swing.JButton();
        boton5_3 = new javax.swing.JButton();
        boton5_4 = new javax.swing.JButton();
        boton5_5 = new javax.swing.JButton();
        boton6_0 = new javax.swing.JButton();
        boton6_1 = new javax.swing.JButton();
        boton6_2 = new javax.swing.JButton();
        boton6_3 = new javax.swing.JButton();
        boton6_4 = new javax.swing.JButton();
        boton6_5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        oportunidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setPreferredSize(new java.awt.Dimension(600, 700));
        setResizable(false);

        tableroPanel.setBackground(new java.awt.Color(255, 239, 230));
        tableroPanel.setMaximumSize(new java.awt.Dimension(600, 600));
        tableroPanel.setMinimumSize(new java.awt.Dimension(600, 600));
        tableroPanel.setLayout(new java.awt.GridLayout(6, 6));
        tableroPanel.add(boton1_0);
        tableroPanel.add(boton1_1);
        tableroPanel.add(boton1_2);
        tableroPanel.add(boton1_3);

        boton1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1_4ActionPerformed(evt);
            }
        });
        tableroPanel.add(boton1_4);
        tableroPanel.add(boton1_5);
        tableroPanel.add(boton2_0);
        tableroPanel.add(boton2_1);
        tableroPanel.add(boton2_2);
        tableroPanel.add(boton2_3);
        tableroPanel.add(boton2_4);
        tableroPanel.add(boton2_5);
        tableroPanel.add(boton3_0);
        tableroPanel.add(boton3_1);
        tableroPanel.add(boton3_2);
        tableroPanel.add(boton3_3);
        tableroPanel.add(boton3_4);
        tableroPanel.add(boton3_5);
        tableroPanel.add(boton4_0);
        tableroPanel.add(boton4_1);
        tableroPanel.add(boton4_2);
        tableroPanel.add(boton4_3);
        tableroPanel.add(boton4_4);
        tableroPanel.add(boton4_5);
        tableroPanel.add(boton5_0);
        tableroPanel.add(boton5_1);
        tableroPanel.add(boton5_2);
        tableroPanel.add(boton5_3);
        tableroPanel.add(boton5_4);
        tableroPanel.add(boton5_5);
        tableroPanel.add(boton6_0);
        tableroPanel.add(boton6_1);

        boton6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6_2ActionPerformed(evt);
            }
        });
        tableroPanel.add(boton6_2);
        tableroPanel.add(boton6_3);
        tableroPanel.add(boton6_4);
        tableroPanel.add(boton6_5);

        getContentPane().add(tableroPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("MEMORAMA");

        oportunidades.setText("Numero de Intentos: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oportunidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(oportunidades)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton1_4ActionPerformed

    private void boton6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton6_2ActionPerformed

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
            java.util.logging.Logger.getLogger(memoramaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(memoramaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(memoramaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(memoramaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new memoramaPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1_0;
    private javax.swing.JButton boton1_1;
    private javax.swing.JButton boton1_2;
    private javax.swing.JButton boton1_3;
    private javax.swing.JButton boton1_4;
    private javax.swing.JButton boton1_5;
    private javax.swing.JButton boton2_0;
    private javax.swing.JButton boton2_1;
    private javax.swing.JButton boton2_2;
    private javax.swing.JButton boton2_3;
    private javax.swing.JButton boton2_4;
    private javax.swing.JButton boton2_5;
    private javax.swing.JButton boton3_0;
    private javax.swing.JButton boton3_1;
    private javax.swing.JButton boton3_2;
    private javax.swing.JButton boton3_3;
    private javax.swing.JButton boton3_4;
    private javax.swing.JButton boton3_5;
    private javax.swing.JButton boton4_0;
    private javax.swing.JButton boton4_1;
    private javax.swing.JButton boton4_2;
    private javax.swing.JButton boton4_3;
    private javax.swing.JButton boton4_4;
    private javax.swing.JButton boton4_5;
    private javax.swing.JButton boton5_0;
    private javax.swing.JButton boton5_1;
    private javax.swing.JButton boton5_2;
    private javax.swing.JButton boton5_3;
    private javax.swing.JButton boton5_4;
    private javax.swing.JButton boton5_5;
    private javax.swing.JButton boton6_0;
    private javax.swing.JButton boton6_1;
    private javax.swing.JButton boton6_2;
    private javax.swing.JButton boton6_3;
    private javax.swing.JButton boton6_4;
    private javax.swing.JButton boton6_5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel oportunidades;
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
