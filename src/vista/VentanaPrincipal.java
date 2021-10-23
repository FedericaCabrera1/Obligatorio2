/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dominio.Sistema;

/**
 *
 * @author federicacabrera
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Sistema modelo;
    public VentanaPrincipal(Sistema elModelo) {
        modelo = elModelo;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_elegirCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JButton();
        btn_categorias = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_verPedidos = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btn_reiniciarPedidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_eliminarItem = new javax.swing.JButton();
        btn_grabarPedido = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(new java.awt.GridLayout());

        jPanel2.setLayout(new java.awt.GridLayout(3, 2));

        jPanel3.setLayout(new java.awt.GridLayout(3, 2));

        btn_elegirCliente.setText("Elegir Cliente");
        btn_elegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegirClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_elegirCliente);

        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jPanel3.add(jLabel3);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2);

        jRadioButton3.setText("Categorias por orden alfabetico");
        jPanel3.add(jRadioButton3);

        jRadioButton4.setText("Categorias por orden prioridad");
        jPanel3.add(jRadioButton4);

        jPanel2.add(jPanel3);

        jPanel8.setLayout(new java.awt.GridLayout(1, 4));

        btn_clientes.setText("Clientes");
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });
        jPanel8.add(btn_clientes);

        btn_categorias.setText("Categorias");
        btn_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categoriasActionPerformed(evt);
            }
        });
        jPanel8.add(btn_categorias);

        btn_productos.setText("Productos");
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });
        jPanel8.add(btn_productos);

        btn_verPedidos.setText("Ver pedidos");
        btn_verPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verPedidosActionPerformed(evt);
            }
        });
        jPanel8.add(btn_verPedidos);

        jPanel2.add(jPanel8);

        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboBox1);

        jPanel2.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        btn_reiniciarPedidos.setText("Reiniciar Pedidos");
        jPanel4.add(btn_reiniciarPedidos);
        jPanel4.add(jLabel1);

        jPanel2.add(jPanel4);

        jPanel6.setLayout(new java.awt.GridLayout(3, 1));
        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel7.add(jScrollPane1);

        btn_eliminarItem.setText("Eliminar Item");
        jPanel7.add(btn_eliminarItem);

        btn_grabarPedido.setText("Grabar Pedido");
        jPanel7.add(btn_grabarPedido);

        jPanel2.add(jPanel7);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_elegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegirClienteActionPerformed
        ventanaF ventana = new ventanaF();
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_elegirClienteActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        ventanaA ventana = new ventanaA(modelo);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriasActionPerformed
        ventanaB ventana = new ventanaB();
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_categoriasActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
        ventanaC ventana = new ventanaC();
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_productosActionPerformed

    private void btn_verPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verPedidosActionPerformed
        ventanaD ventana = new ventanaD();
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_verPedidosActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_categorias;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_elegirCliente;
    private javax.swing.JButton btn_eliminarItem;
    private javax.swing.JButton btn_grabarPedido;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_reiniciarPedidos;
    private javax.swing.JButton btn_verPedidos;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
