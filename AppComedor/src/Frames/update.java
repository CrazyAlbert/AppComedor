/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Conexion;
import java.awt.BorderLayout;
//import Frames.MenuPrincipal;
//import Frames.Menuimpo;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto Alvarez
 */
public class update extends javax.swing.JFrame {

    Conexion con = new Conexion();
   // DefaultTableModel modelo = new DefaultTableModel();
    String Ubicacion;
    /**
     * Creates new form Actualizacion
     */
    public update() {
        initComponents();
        setTitle("Batesville-Chihuahua Actualizacion"); // Titulo
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false); //imagen fondo
        
        PnlFondo pnlFondo = new PnlFondo();
        this.add(pnlFondo, BorderLayout.CENTER);
        this.pack();
        TableImpo.getTableHeader().setFont(new Font("Times New Roman", 1, 16));
        TableImpo.getTableHeader().setBackground(Color.DARK_GRAY);
        
    }

    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnImportar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableImpo = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel2.setText("Actualizar Base de Datos");

        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        TableImpo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableImpo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TableImpo);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(1069, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImportar)
                        .addGap(68, 68, 68)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
         if (TableImpo.getRowCount() > 0) {
            for (int i = 0; i < TableImpo.getRowCount(); i++) {
                String insert = "INSERT INTO usuarios Values("
                               + obtenercontenido(i, 0)
                        + ",'" + obtenercontenido(i, 1) + "'"
                        + ",'" + obtenercontenido(i, 2) + "'"
                        + ",'" + obtenercontenido(i, 3) + "'"
                        + ",'" + obtenercontenido(i, 4) + "'"
                        + ",'" + obtenercontenido(i, 5) + "'"
                        + ",'" + obtenercontenido(i, 6) + "'"
                        + ",'" + obtenercontenido(i, 7) + "'";
                       
                
                System.out.println(insert);
                try {
                    con.ConectarBasedeDatos();
                    con.sentencia.execute(insert);
                    con.DesconectarBasedeDatos();
                } catch (SQLException ex) {
                    Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(this, "Datos Guardados con Exito");
        } else {
            JOptionPane.showMessageDialog(this, " El reporte se encuntra vacio");
        }
         ((DefaultTableModel) TableImpo.getModel()).setRowCount(0);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        Principal P = new Principal();
        P.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TableImpo;
    private javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImportar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private String obtenercontenido(int fila, int columna) {
        Object palabraOB = TableImpo.getValueAt(fila, columna);
        String palabra = "";
        if (palabraOB != null) {
            palabra = palabraOB.toString();
        }
        return palabra;
    }

}
