package vista;

import dominio.Categoria;
import dominio.Producto;
import dominio.Sistema;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JFrame implements PropertyChangeListener {

    private Sistema modelo;
    private JComboBox suggestionComboBox;

    public VentanaPrincipal(Sistema elModelo) {
        modelo = elModelo;
        initComponents();
        this.setSize(900, 500);
////        combo_parteK.addItem("rojo");
////        combo_parteK.addItem("vede");
////        combo_parteK.addItem("azul");
////        combo_parteK.addItem("amarillo");
////        combo_parteK.addItem("negro");
//        combo_parteK.addItemListener(this);
//        
//        ArrayList<Categoria> listaCategorias = modelo.getListaCategorias();
//        for(int i=0; i<listaCategorias.size(); i++){
//            combo_parteK.addItem(listaCategorias.get(i).getDescripcion());
//        }
//        combo_parteK.addItemListener(this);
        //mostrarEnCombo(combo_parteK);
        mostrarEnCombo(modelo.getListaCategorias());
        modelo.addPropertyChangeListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_elegirCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        rbtn_ordenAlfabetico = new javax.swing.JRadioButton();
        rbtn_ordenPrioridad = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JButton();
        btn_categorias = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_verPedidos = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        combo_parteK = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btn_reiniciarPedidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_eliminarItem = new javax.swing.JButton();
        btn_grabarPedido = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

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

        buttonGroup1.add(rbtn_ordenAlfabetico);
        rbtn_ordenAlfabetico.setText("Categorias por orden alfabetico");
        rbtn_ordenAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ordenAlfabeticoActionPerformed(evt);
            }
        });
        jPanel3.add(rbtn_ordenAlfabetico);

        buttonGroup1.add(rbtn_ordenPrioridad);
        rbtn_ordenPrioridad.setText("Categorias por orden prioridad");
        rbtn_ordenPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ordenPrioridadActionPerformed(evt);
            }
        });
        jPanel3.add(rbtn_ordenPrioridad);

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

        combo_parteK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_parteKItemStateChanged(evt);
            }
        });
        combo_parteK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_parteKActionPerformed(evt);
            }
        });
        jPanel5.add(combo_parteK);

        jPanel2.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        btn_reiniciarPedidos.setText("Reiniciar Pedidos");
        jPanel4.add(btn_reiniciarPedidos);
        jPanel4.add(jLabel1);

        jPanel2.add(jPanel4);

        panelProducto.setLayout(new java.awt.GridLayout(1, 2));
        jPanel2.add(panelProducto);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

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
        ventanaF ventana = new ventanaF(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_elegirClienteActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        ventanaA ventana = new ventanaA(modelo);
        ventana.setVisible(true);

    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriasActionPerformed
        ventanaB ventana = new ventanaB(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_categoriasActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
        ventanaC ventana = new ventanaC(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_productosActionPerformed

    private void btn_verPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verPedidosActionPerformed
        ventanaD ventana = new ventanaD();
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_verPedidosActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void combo_parteKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_parteKActionPerformed


    }//GEN-LAST:event_combo_parteKActionPerformed

    private void rbtn_ordenAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ordenAlfabeticoActionPerformed
        ArrayList<Categoria> lista = modelo.ordenarPorDescripcion();
        mostrarEnCombo(lista);
    }//GEN-LAST:event_rbtn_ordenAlfabeticoActionPerformed

    private void rbtn_ordenPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ordenPrioridadActionPerformed
        ArrayList<Categoria> lista = modelo.ordenarPorPrioridad();
        mostrarEnCombo(lista);
    }//GEN-LAST:event_rbtn_ordenPrioridadActionPerformed

    private void combo_parteKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_parteKItemStateChanged
        // TODO add your handling code here:
        int index = combo_parteK.getSelectedIndex();
        if (index != -1) {
            String descripcion = combo_parteK.getSelectedItem().toString();
            Categoria c = modelo.buscarCategoriaPorDescripcion(descripcion);
            mostrarProductos(c);
        }


    }//GEN-LAST:event_combo_parteKItemStateChanged

    public void mostrarProductos(Categoria categoria) {
        panelProducto.removeAll();
        panelProducto.revalidate();
        panelProducto.repaint();
        ArrayList<Producto> listaProductosDeCategoria = modelo.darProductosDeCategoria(categoria);
        int contador = 0;
        while (contador < listaProductosDeCategoria.size() && listaProductosDeCategoria.size() != 0) {
            JButton nuevo = new JButton(" ");
            nuevo.setMargin(new Insets(-5, -5, -5, -5));
            nuevo.setBackground(Color.BLACK);
            nuevo.setForeground(Color.WHITE);
            nuevo.setText(listaProductosDeCategoria.get(contador).getNombre());
            nuevo.addActionListener(new ProductoListener());
            panelProducto.add(nuevo);
            contador++;
        }
        panelProducto.revalidate();
    }

    private class ProductoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton cual = ((JButton) e.getSource());
            // código a completar según el botón presionado

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_categorias;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_elegirCliente;
    private javax.swing.JButton btn_eliminarItem;
    private javax.swing.JButton btn_grabarPedido;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_reiniciarPedidos;
    private javax.swing.JButton btn_verPedidos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> combo_parteK;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JRadioButton rbtn_ordenAlfabetico;
    private javax.swing.JRadioButton rbtn_ordenPrioridad;
    // End of variables declaration//GEN-END:variables

    public void mostrarEnCombo(ArrayList<Categoria> listaCategorias) {
        combo_parteK.removeAllItems();
        for (int i = 0; i < listaCategorias.size(); i++) {
            combo_parteK.addItem(listaCategorias.get(i).getDescripcion());
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("c")) {
            ArrayList<Categoria> lista = new ArrayList<Categoria>();
            if (rbtn_ordenAlfabetico.isSelected()) {
                lista = modelo.ordenarPorDescripcion();
            } else if (rbtn_ordenPrioridad.isSelected()) {
                lista = modelo.ordenarPorPrioridad();
            } else {
                lista = modelo.getListaCategorias();
            }
            mostrarEnCombo(lista);

        } else {
            if (evt.getPropertyName().equals("p")) {
                int index = combo_parteK.getSelectedIndex();
                String descripcion = combo_parteK.getSelectedItem().toString();
                Categoria c = modelo.buscarCategoriaPorDescripcion(descripcion);
                mostrarProductos(c);

            }

        }
    }
}
