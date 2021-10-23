/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dominio.Cliente;
import dominio.Sistema;
import javax.swing.JOptionPane;

public class ventanaA extends javax.swing.JFrame {

    private Sistema modelo;

    public ventanaA(Sistema elModelo) {
        modelo = elModelo;
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        btn_agregarCliente = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AGREGAR CLIENTE:");

        lbl_nombre.setText("Nombre:");

        lbl_direccion.setText("Direccion:");

        lbl_telefono.setText("Telefono:");

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });

        tf_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_direccionActionPerformed(evt);
            }
        });

        tf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefonoActionPerformed(evt);
            }
        });

        btn_agregarCliente.setText("Agregar");
        btn_agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btn_agregarCliente)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_telefono)
                                        .addGap(5, 5, 5))
                                    .addComponent(lbl_direccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(tf_telefono)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nombre)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_agregarCliente)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_direccionActionPerformed

    private void tf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telefonoActionPerformed

    private void btn_agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarClienteActionPerformed
        String nombre = tf_nombre.getText();
        String direccion = tf_direccion.getText();
        String telefono = tf_telefono.getText();

        if (!espacioVacio(nombre) && !espacioVacio(direccion) && !espacioVacio(telefono)) {
            String res = "";
            for (int j = 0; j < nombre.length(); j++) {
                if (nombre.charAt(j) != ' ') {
                    res += nombre.charAt(j);
                }
            }
            Cliente c = modelo.crearCliente(res, direccion, telefono);
            boolean esUnico = modelo.verificarNombreUnico(c);
            if (!esUnico) {
                JOptionPane.showMessageDialog(null, "Ya existe un cliente con este nombre. Reingrese", "error", JOptionPane.ERROR_MESSAGE);
                tf_nombre.setText("");
                
            }else{
                modelo.agregarCliente(c);
                JOptionPane.showMessageDialog(null, "Cliente agregado con éxito!", "success", JOptionPane.OK_OPTION);
                tf_nombre.setText("");
                tf_telefono.setText("");
                tf_direccion.setText("");
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Hay campos en blanco. Reingrese", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_agregarClienteActionPerformed

    public boolean espacioVacio(String s) {
        boolean hayEspacio = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                hayEspacio = false;

            }

        }
        return hayEspacio;
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ventanaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ventanaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ventanaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ventanaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ventanaA().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
