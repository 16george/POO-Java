/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import entidades.*;
import entidades.habitaciones.*;
import entidades.servicios_adicionales.*;


/**
 *
 * @author GEORGE
 */
public class Frm_Rservicios extends JFrame {

    /**
     * Creates new form Frm_Rservicios
     */
    public Frm_Rservicios() {
        initComponents();
    }

    public Frm_Rservicios(JFrame frm) {
        initComponents();
        this.setLocationRelativeTo(frm);
    }
    
    public Frm_Rservicios(JFrame frm, Hotel hotel, Persona dueño, ArrayList<Cliente> lista_huespedes, boolean estado) {
        initComponents();
        this.setLocationRelativeTo(frm);
        this.hotel = hotel;
        this.dueño = dueño;
        this.lista_huespedes = lista_huespedes;
        this.estado = estado;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Rservicios = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_tipoServicio = new javax.swing.JLabel();
        lbl_numeroH = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        jdc_fecha = new com.toedter.calendar.JDateChooser();
        lbl_descripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_descripcion = new javax.swing.JTextArea();
        lbl_costo = new javax.swing.JLabel();
        txt_numeroH = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);

        lbl_titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Servicios Adicionales");

        lbl_tipoServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_numeroH.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_numeroH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_numeroH.setText("Numero de Habitación");

        lbl_fecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fecha.setText("Fecha");

        lbl_descripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_descripcion.setText("Descripción");

        txtA_descripcion.setColumns(20);
        txtA_descripcion.setRows(5);
        jScrollPane1.setViewportView(txtA_descripcion);

        lbl_costo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_costo.setText("Costo");

        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_RserviciosLayout = new javax.swing.GroupLayout(panel_Rservicios);
        panel_Rservicios.setLayout(panel_RserviciosLayout);
        panel_RserviciosLayout.setHorizontalGroup(
            panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RserviciosLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lbl_fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_numeroH, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RserviciosLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RserviciosLayout.createSequentialGroup()
                        .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descripcion)
                            .addGroup(panel_RserviciosLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lbl_costo)))
                        .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_RserviciosLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_RserviciosLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RserviciosLayout.createSequentialGroup()
                        .addComponent(lbl_tipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
            .addGroup(panel_RserviciosLayout.createSequentialGroup()
                .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_RserviciosLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_RserviciosLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lbl_numeroH))
                    .addGroup(panel_RserviciosLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_RserviciosLayout.setVerticalGroup(
            panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RserviciosLayout.createSequentialGroup()
                .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_RserviciosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_RserviciosLayout.createSequentialGroup()
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_tipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_numeroH)
                            .addComponent(txt_numeroH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdc_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_RserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_RserviciosLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lbl_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_RserviciosLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Rservicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Rservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        //RECUPERAR DATOS
        
        String numero_habitacion;
        do {
            try {
                    numero_habitacion = txt_numeroH.getText();
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,"El numero de habitacion"
                    + "\nNo puede quedar vacio","Campo Obligatorio",JOptionPane.WARNING_MESSAGE);
                    numero_habitacion = txt_numeroH.getText();
            }
            
        } while (txt_numeroH.getText()==null || txt_numeroH.getText()=="");
        
        
        
        
            //Fecha
            int dia = jdc_fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = jdc_fecha.getCalendar().get(Calendar.MARCH);
            int año = jdc_fecha.getCalendar().get(Calendar.YEAR);
            
            Fecha fecha = new Fecha(dia,mes,año);
            
            //
        String descripcion = txtA_descripcion.getText();
        float costo;
        
        do{
            
            try {
                costo = Float.parseFloat(txt_costo.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,"El Valor debe ser un numero"
                        + "\nIntente nuevamente","Tipo de dato no permitido",JOptionPane.WARNING_MESSAGE);
                txt_costo.setText(null);
                costo = Float.parseFloat(txt_costo.getText());
            }
            
            
        }while(txt_costo.getText() == null);
        
        Frm_Registro frm_registro;
        
        switch(lbl_tipoServicio.getText()){
            case "RESTAURANTE": 
                
                Restaurante r = new Restaurante(numero_habitacion, fecha, descripcion, costo);
                frm_registro = new Frm_Registro(this, hotel, dueño, lista_huespedes, estado, r);
                this.dispose();break;
                
            case "LAVANDERIA": 
                
                Lavanderia l = new Lavanderia(numero_habitacion, fecha, descripcion, costo);
                frm_registro = new Frm_Registro(this, hotel, dueño, lista_huespedes, estado, l);
                this.dispose();break;
        }
        
    }//GEN-LAST:event_btn_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Rservicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Rservicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Rservicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Rservicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Rservicios().setVisible(true);
            }
        });
    }

    private Hotel hotel;
    private Persona dueño;
    private ArrayList<Cliente> lista_huespedes = new ArrayList<>();
    private boolean estado;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_registrar;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_fecha;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_numeroH;
    public javax.swing.JLabel lbl_tipoServicio;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel panel_Rservicios;
    private javax.swing.JTextArea txtA_descripcion;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_numeroH;
    // End of variables declaration//GEN-END:variables
}
