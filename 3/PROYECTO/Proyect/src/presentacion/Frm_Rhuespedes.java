/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidades.Cliente;
import entidades.Doc_Identidad;
import entidades.Hotel;
import entidades.Persona;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author GEORGE
 */
public class Frm_Rhuespedes extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Rhuespedes
     */
    public Frm_Rhuespedes() {
        initComponents();
    }
    public Frm_Rhuespedes(JFrame frm) {
        initComponents();
        this.setLocationRelativeTo(frm);
    }
    public Frm_Rhuespedes(JFrame frm, byte numero_huespedes){
        initComponents();
        this.setLocationRelativeTo(frm);
        this.numero_huespedes = numero_huespedes;
    }
    
    public Frm_Rhuespedes(JFrame frm, Persona dueño, Hotel hotel) {
        initComponents();
        this.setLocationRelativeTo(frm);
        
        this.dueño = dueño;
        this.hotel = hotel;
    }
    
    public Frm_Rhuespedes(JFrame frm, Persona dueño, Hotel hotel, byte numero_huespedes) {
        initComponents();
        this.setLocationRelativeTo(frm);
        this.numero_huespedes = numero_huespedes;
        this.dueño = dueño;
        this.hotel = hotel;
    }
    
    public Frm_Rhuespedes(JFrame frm, Persona dueño, Hotel hotel, byte numero_huespedes, boolean c) {
        initComponents();
        this.setLocationRelativeTo(frm);
        this.numero_huespedes = numero_huespedes;
        this.dueño = dueño;
        this.hotel = hotel;
        cerrar = c;
    }
    
    public Frm_Rhuespedes(JFrame frm, Persona dueño, Hotel hotel,ArrayList<Cliente> huespedes){
         initComponents();
        this.setLocationRelativeTo(frm);
        this.dueño = dueño;
        this.hotel = hotel;
        lista_huespedes = huespedes;
        
    }
        // ACA ME QUEDE
    
//    public Frm_Rhuespedes() {
//        initComponents();
          
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_registroH = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_cancelar = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        txt_nacionalidad = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        lbl_nacionalidad = new javax.swing.JLabel();
        cbox_tiposDocumentos = new javax.swing.JComboBox<>();
        lbl_docTipo = new javax.swing.JLabel();
        lbl_docNumero = new javax.swing.JLabel();
        txt_numeroDoc = new javax.swing.JTextField();
        lbl_docTitulo = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_cancelar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_siguiente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btn_siguiente.setText("Siguiente");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        lbl_telefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_telefono.setText("Telefono de Contacto");

        lbl_nacionalidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_nacionalidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nacionalidad.setText("Nacionalidad");

        cbox_tiposDocumentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnet de Extranjeria", "DNI", "Pasaporte", "RUC" }));
        cbox_tiposDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_tiposDocumentosActionPerformed(evt);
            }
        });

        lbl_docTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_docTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_docTipo.setText("Tipo");

        lbl_docNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_docNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_docNumero.setText("Numero");

        txt_numeroDoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_docTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_docTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_docTitulo.setText("Documento de Identidad");

        lbl_nombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_nombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombres.setText("Nombres");

        lbl_apellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_apellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_apellidos.setText("Apellidos");

        lbl_titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Registro de Huesped");

        javax.swing.GroupLayout panel_registroHLayout = new javax.swing.GroupLayout(panel_registroH);
        panel_registroH.setLayout(panel_registroHLayout);
        panel_registroHLayout.setHorizontalGroup(
            panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroHLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbl_docTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_registroHLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registroHLayout.createSequentialGroup()
                        .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registroHLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lbl_docTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbox_tiposDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registroHLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_registroHLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroHLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_docNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addComponent(txt_numeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(panel_registroHLayout.createSequentialGroup()
                        .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registroHLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lbl_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(txt_nacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(panel_registroHLayout.createSequentialGroup()
                        .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(txt_nombres)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroHLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registroHLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap()))
        );
        panel_registroHLayout.setVerticalGroup(
            panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroHLayout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(lbl_docTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_docTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_docNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_tiposDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(panel_registroHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registroHLayout.createSequentialGroup()
                    .addGap(260, 260, 260)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(124, 124, 124)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(115, 115, 115)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_registroH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_registroH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_tiposDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_tiposDocumentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_tiposDocumentosActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed

         registroFinal();
    }//GEN-LAST:event_btn_siguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    private void registroFinal(){
        huesped = registro();
        lista_huespedes.add(huesped);
        
        frm_registro = new Frm_Registro(this,hotel,dueño,lista_huespedes,cerrar);
        frm_registro.setVisible(cerrar); //modificacion
        this.dispose();
    }
    
    private Cliente registro(){
        // Recuperar Datos
        
        String apellidos = txt_apellidos.getText();
        String nombres = txt_nombres.getText();
        
            // datos para el Doc. de identidad
            byte index_doc = (byte)(cbox_tiposDocumentos.getSelectedIndex());
            String numero_doc = txt_numeroDoc.getText();
            //

            // Objeto Documento de Identidad

            Doc_Identidad doc_i = new Doc_Identidad(numero_doc, index_doc);

            //
        
        String nacionalidad = txt_nacionalidad.getText();
        String telefono = txt_telefono.getText();
        
        //
        
        Cliente h = new Cliente(nacionalidad, telefono, nombres, apellidos, doc_i);
        //
        
        // BORRAR DATOS
        
        txt_apellidos.setText(null);
        txt_nombres.setText(null);
        txt_numeroDoc.setText(null);
        txt_nacionalidad.setText(null);
        txt_telefono.setText(null);
        
        
        return h;
    }
    
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
            java.util.logging.Logger.getLogger(Frm_Rhuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Rhuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Rhuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Rhuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Rhuespedes().setVisible(true);
            }
        });
    }
    
    private static Hotel hotel;
    private static Persona dueño;
    private static Cliente huesped;
    private static ArrayList <Cliente> lista_huespedes = new ArrayList<>();
    private byte numero_huespedes;
    private static byte control;
    static Frm_Rhuespedes frm_Rhuesped;
    static Frm_Registro frm_registro;
    public boolean cerrar = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    public javax.swing.JButton btn_siguiente;
    private javax.swing.JComboBox<String> cbox_tiposDocumentos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_docNumero;
    private javax.swing.JLabel lbl_docTipo;
    private javax.swing.JLabel lbl_docTitulo;
    private javax.swing.JLabel lbl_nacionalidad;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel panel_registroH;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numeroDoc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
