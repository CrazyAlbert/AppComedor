/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Conexion;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto Alvarez
 * @author Eduardo Hernandez
 *
 */
public class Principal extends javax.swing.JFrame implements Runnable {

    Conexion con = new Conexion();
    DefaultTableModel modelo = new DefaultTableModel();

    //Variables 
    String codigo;
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Batesville-Chihuahua Comedor Planta 1");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false); //imagen fondo
        //        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/fondo_Gris.jpg"));
        //        JLabel fondo = new JLabel();
        //        fondo.setIcon(uno);
        //        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        //        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        //time
        PnlFondo pnlFondo = new PnlFondo();
        this.add(pnlFondo, BorderLayout.CENTER);
        this.pack();
        h1 = new Thread(this);
        h1.start();
        setLocationRelativeTo(null);//para centrar la ventana
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lbEmp = new javax.swing.JLabel();
        labelEtiNom = new javax.swing.JLabel();
        lbMsj = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        txtid_emp = new javax.swing.JTextField();
        lbNomb = new javax.swing.JLabel();
        labelNumEmp = new javax.swing.JLabel();
        labelEtiDep = new javax.swing.JLabel();
        lbArea = new javax.swing.JLabel();
        labelEtiComida = new javax.swing.JLabel();
        lbTComida = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbSaludo = new javax.swing.JLabel();
        lbAlert = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEtiNom.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        labelEtiNom.setText("Nombre:");

        lbMsj.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        lbMsj.setText("Nada por el momento");

        lbHora.setFont(new java.awt.Font("Calisto MT", 3, 60)); // NOI18N
        lbHora.setText("13:00:05");
        lbHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHoraMouseClicked(evt);
            }
        });

        txtid_emp.setFont(new java.awt.Font("Times New Roman", 0, 72)); // NOI18N
        txtid_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_empActionPerformed(evt);
            }
        });
        txtid_emp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtid_empKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtid_empKeyTyped(evt);
            }
        });

        lbNomb.setFont(new java.awt.Font("Calibri", 2, 50)); // NOI18N
        lbNomb.setText("------------");

        labelNumEmp.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        labelNumEmp.setText("Número Empleado");

        labelEtiDep.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        labelEtiDep.setText("Área: ");

        lbArea.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        lbArea.setText("---------");

        labelEtiComida.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        labelEtiComida.setText("Tipo Comida:");

        lbTComida.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        lbTComida.setText("--------");

        jLabel11.setFont(new java.awt.Font("Calibri", 2, 60)); // NOI18N
        jLabel11.setText("Area Actual :");

        lbSaludo.setFont(new java.awt.Font("Calibri", 3, 78)); // NOI18N
        lbSaludo.setText("Buen Dia");

        lbAlert.setFont(new java.awt.Font("Calibri", 3, 52)); // NOI18N
        lbAlert.setText("Alerta! Estás fuera de horario");

        menuInicio.setText("Inicio");
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInicio);

        jMenu2.setText("Tiempo Extra");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEtiNom, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNumEmp)
                                .addGap(60, 60, 60)
                                .addComponent(txtid_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEtiDep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbArea))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEtiComida)
                                .addGap(75, 75, 75)
                                .addComponent(lbTComida))
                            .addComponent(lbAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(lbMsj, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(lbSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSaludo)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNumEmp)
                            .addComponent(txtid_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomb)
                            .addComponent(labelEtiNom))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEtiDep)
                            .addComponent(lbArea))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEtiComida)
                            .addComponent(lbTComida))
                        .addGap(36, 36, 36)
                        .addComponent(lbAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addComponent(lbMsj, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Directorio
    String directory = System.getProperty("user.dir");

    private void txtid_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_empActionPerformed

    private void lbHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoraMouseClicked

        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("HH:mm:ss");
        System.out.println(fecha);


    }//GEN-LAST:event_lbHoraMouseClicked

    private void txtid_empKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_empKeyReleased
        // TODO add your handling code here
        codigo = txtid_emp.getText();

        if (codigo.length() == 6 && evt.getKeyCode() == KeyEvent.VK_ENTER) {

            System.out.println("id empleado " + codigo);

            con.ConectarBasedeDatos();
            String nombre = "", horario = "", departamento = "", platillo = "";

            String select = "SELECT *  FROM usuarios WHERE num_Emp  = '" + codigo + "'";

            try {
                con.resultado = con.sentencia.executeQuery(select);

                if (con.resultado.next()) {
                    // lbNumero.setText(primeros);

                    nombre = con.resultado.getString("nombre");
                    // horario = con.resultado.getString("horario");
                    departamento = con.resultado.getString("departamento");
                    platillo = con.resultado.getString("comida");

                    txtid_emp.setText(null);

                    String nomb = codigo;

                    String imageRoute;
                    imageRoute = directory + "\\Empleados\\" + nomb + ".png";
                    ImageIcon ima = new ImageIcon(imageRoute);
                    ImageIcon icono = new ImageIcon(ima.getImage().getScaledInstance(
                            lbEmp.getWidth(),
                            lbEmp.getHeight(),
                            Image.SCALE_SMOOTH));
                    lbEmp.setIcon(icono);

                } else {
                    JOptionPane.showMessageDialog(this, "No encontro el numero de empleado", "Codigo incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            con.DesconectarBasedeDatos();
            // lbNumero.setText(primeros);
            lbNomb.setText(nombre);
            lbTComida.setText(platillo);
            lbArea.setText(departamento);
            txtid_emp.setText(null);
            insertar();
            //insertar a la base de datos
        }

    }//GEN-LAST:event_txtid_empKeyReleased

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked

        Inicio i = new Inicio();
        i.setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_menuInicioMouseClicked

    private void txtid_empKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_empKeyTyped

        int numero = 6;
        if (txtid_emp.getText().length() >= numero) {
            evt.consume();
        }

    }//GEN-LAST:event_txtid_empKeyTyped

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        
        TiempoExtra tiempoExtra = new TiempoExtra();
        tiempoExtra.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    /**
     * @param args the command line arguments
     */
    //Proceso del tiempo///////////////////////////////////////////////////////
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            mensaje();
            saludo();
            calcula();

            lbHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    //Reloj de formato 12 hrs
    public void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);

    }

    //Test de Switch
    public void mensaje() {
        Calendar horaActual = Calendar.getInstance();
        Calendar minActual = Calendar.getInstance();

        switch (horaActual.get(Calendar.HOUR_OF_DAY)) {
            case 8://entra en el switch del desayuno
                switch (minActual.get(Calendar.MINUTE)) {
                    case 00:
                        lbMsj.setText("Herrajes, Interiores");
                        break;
                    case 05:
                        lbMsj.setText("Herrajes, Interiores, Produccion Planta 2");
                        break;
                    case 20:
                        lbMsj.setText("bugeandose 20");
                        break;
                    case 25:
                        lbMsj.setText("Produccion Planta 2, Pulido, Acabado");
                        break;
                    case 35:
                        lbMsj.setText("testing bug");
                        break;
                    case 45:
                        lbMsj.setText("Produccion Planta 2, Pulido, Acabado");
                        break;
                }
            case 9://entra en el switch del desayuno
                switch (minActual.get(Calendar.MINUTE)) {
                    case 00:
                        lbMsj.setText("Herrajes, Interiores");
                        break;
                    case 05:
                        lbMsj.setText("Herrajes, Interiores, Produccion Planta 2");
                        break;
                    case 15:
                        lbMsj.setText("bugeandose 20");
                        break;
                    case 20:
                        lbMsj.setText("Planta 2, Pulido, Acabado");
                        break;
                    case 50:
                        lbMsj.setText("Pulido, Acabado, Cajones");
                        break;
                }
                break;

            case 12://entra a switch de comida
                switch (minActual.get(Calendar.MINUTE)) {
                    case 00:
                        lbMsj.setText("Herrajes, Interiores");
                        break;
                    case 05:
                        lbMsj.setText("Herrajes, Interiores, Produccion Planta 2");
                        break;
                    case 20:
                        lbMsj.setText("Interiores,Produccion Planta 2, Pulido");
                        break;
                    case 25:
                        lbMsj.setText("Produccion Planta 2, Pulido, Acabado");
                        break;
                    case 35:
                        lbMsj.setText("Pulido, Acabado, Cajones");
                        break;
                    case 45:
                        lbMsj.setText("Pulido, Acabado, Cajones");
                        break;
                }
                break;

            case 13://entra a switch de comida
                switch (minActual.get(Calendar.MINUTE)) {
                    case 00:
                        lbMsj.setText("Herrajes, Interiores");
                        break;
                    case 15:
                        lbMsj.setText("Herrajes, Interiores, Produccion Planta 2");
                        break;
                    case 20:
                        lbMsj.setText("Interiores,Produccion Planta 2, Pulido");
                        break;
                    case 50:
                        lbMsj.setText("Pulido, Acabado, Cajones");
                        break;
                }
                break;

            case 18: // extra switch de comida de tarde
                switch (minActual.get(Calendar.MINUTE)) {
                    case 15:
                        lbMsj.setText("Herrajes, Interiores");
                        break;
                    case 25:
                        lbMsj.setText("Herrajes, Interiores, Produccion Planta 2");
                        break;
                    case 30:
                        lbMsj.setText("Interiores,Produccion Planta 2, Pulido");
                        break;
                    case 40:
                        lbMsj.setText("Produccion Planta 2, Pulido, Acabado");
                        break;
                    case 50:
                        lbMsj.setText("Pulido, Acabado, Cajones");
                        break;
                }
                break;

            case 19:// extra switch de comida de tarde
                switch (minActual.get(Calendar.MINUTE)) {
                    case 10:
                        lbMsj.setText("Acabado, Cajones, Small Parts");
                        break;
                    case 15:
                        lbMsj.setText("bugeo minuto 15");
                        break;
                    case 25:
                        lbMsj.setText("Small Parts, Tapas");
                        break;
                    case 30:
                        lbMsj.setText("Administrativos, Intendencia");
                        break;
                }
                break;

            case 21: // extra switch de cena
                switch (minActual.get(Calendar.MINUTE)) {
                    case 55:
                        lbMsj.setText("Herrajes, Interiores");
                        break;
                }
                break;
            case 22:// extra switch de cena
                switch (minActual.get(Calendar.MINUTE)) {
                    case 05:
                        lbMsj.setText("Herrajes, Interiores, Produccion Planta 2");
                        break;
                    case 10:
                        lbMsj.setText("Interiores,Planta 2, Pulido");
                        break;
                    case 20:
                        lbMsj.setText("Planta 2, Pulido, Acabado bug 20");
                        break;
                    case 30:
                        lbMsj.setText("Pulido, Acabado, Cajones");
                        break;
                    case 45:
                        lbMsj.setText("Cajones, Small Parts");
                        break;
                    case 50:
                        lbMsj.setText("Cajones, Small Parts, Tapas");
                        break;
                }
                break;
            case 23:// extra switch de cena 
                switch (minActual.get(Calendar.MINUTE)) {
                    case 00:
                        lbMsj.setText(" Tapas, Administrativos, Intendencia");
                        break;
                    case 20:
                        lbMsj.setText("");
                }
                break;
        }
    }

/////////////////////////////////////////////////////////
    public void saludo() {
        Calendar calendario = new GregorianCalendar();

        int h23, h24;

        h23 = calendario.get(Calendar.HOUR_OF_DAY);
        h24 = calendario.get(Calendar.MINUTE);

        if (h23 >= 00) {
            if (h24 >= 5) {
                lbSaludo.setText("Buen Dia");
            }
        }

        if (h23 >= 12) {
            if (h24 >= 00) {
                lbSaludo.setText("Buena Tarde");
            }
        }

        if (h23 >= 20) {
            if (h24 >= 00) {
                lbSaludo.setText("Buena Noche");
            }
        }

    }

    public void insertar() {
        //Insertar 
        String insert = "INSERT INTO reportediario VALUES ('"
                + codigo + ",'"
                + ",'" + lbNomb.getText() + "'"
                + ",'" + lbArea.getText() + "'"
                + ",'" + lbTComida.getText() + "'"
                + ",'" + lbHora.getText() + "'"
                + ",'" + lbAlert.getText() + "'"
                + ",current_date())";

        try {
            con.ConectarBasedeDatos();
            con.sentencia.execute(insert);
            con.DesconectarBasedeDatos();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel labelEtiComida;
    private javax.swing.JLabel labelEtiDep;
    private javax.swing.JLabel labelEtiNom;
    private javax.swing.JLabel labelNumEmp;
    private javax.swing.JLabel lbAlert;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbEmp;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbMsj;
    private javax.swing.JLabel lbNomb;
    private javax.swing.JLabel lbSaludo;
    private javax.swing.JLabel lbTComida;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JTextField txtid_emp;
    // End of variables declaration//GEN-END:variables

}

/*
if 

switch


 */
