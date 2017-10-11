/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;


import Clases.Conexion;
import Frames.Principal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alberto Alvarez
 */
public class ReporteGeneral extends javax.swing.JFrame {

    Conexion con = new Conexion();
    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Creates new form Exportar
     */
    public ReporteGeneral() {
        initComponents();
        setTitle("Batesville-Chihuahua Comedor Reportes"); // Titulo
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false); //imagen fondo
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/test14.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        
        
        TableExpo.getTableHeader().setFont(new Font("Times New Roman", 1, 16));
        TableExpo.getTableHeader().setBackground(Color.DARK_GRAY);
        mos_reg("");
    }

    public void mos_reg(String valor) {
        modelo.addColumn("Id Empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("Area");
        modelo.addColumn("Tipo");
        modelo.addColumn("Hora");
        modelo.addColumn("Asistencia");
        modelo.addColumn("Fecha");
       
        
        TableExpo.setModel(modelo);
        String select 
                = "SELECT *  FROM reportediario";
        String[] datos = new String[7];
        int[] anchos = {130, 100, 100, 100, 100, 100, 100 };
        try {
            con.ConectarBasedeDatos();
            con.resultado = con.sentencia.executeQuery(select);

            while (con.resultado.next()) {
                datos[0] = con.resultado.getString(1);
                datos[1] = con.resultado.getString(2);
                datos[2] = con.resultado.getString(3);
                datos[3] = con.resultado.getString(4);
                datos[4] = con.resultado.getString(5);
                datos[5] = con.resultado.getString(6);
                datos[6] = con.resultado.getString(7);
                
                
                modelo.addRow(datos);
            }
            for (int i = 0; i < TableExpo.getColumnCount(); i++) {
                TableExpo.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            TableExpo.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ReporteGeneral.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        BtnExportar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableExpo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Reporte Tiempor Extra");

        BtnExportar.setText("Exportar");
        BtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        TableExpo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TableExpo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(971, 971, 971))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnExportar)
                    .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnExportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegresar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        Principal P = new Principal();
        P.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportarActionPerformed
        // TODO add your handling code here:
        if (this.TableExpo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.", "BCO",
                    JOptionPane.INFORMATION_MESSAGE);
            this.BtnExportar.grabFocus();
            return;
        }
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            List<JTable> tb = new ArrayList<>();
            List<String> nom = new ArrayList<>();
            tb.add(TableExpo);
            nom.add("Detalle");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            try {
                Clases.Exportar e = new Clases.Exportar(new File(file), tb, nom);
                if (e.export()) {
                    JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel con exito.", "BCO",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Hubo un error" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnExportarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExportar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTable TableExpo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables


    private String obtenercontenido(int fila, int columna) {
        Object palabraOB = TableExpo.getValueAt(fila, columna);
        String palabra = "";
        if (palabraOB != null) {
            palabra = palabraOB.toString();
        }
        return palabra;
    }
}
