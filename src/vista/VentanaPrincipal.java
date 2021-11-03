package vista;

import dominio.Categoria;
import dominio.Cliente;
import dominio.Pedido;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JFrame implements PropertyChangeListener {

    private Sistema modelo;
    private ArrayList<String> productos;
    private int contadorPedidos;

    public VentanaPrincipal(Sistema elModelo, int contador) {
        modelo = elModelo;
        initComponents();
        productos = new ArrayList();
        contadorPedidos = contador;
        this.setSize(900, 500);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null,
                        "¿Está seguro de que desea salir del sistema?", "Salir",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        FileOutputStream archivo = new FileOutputStream("Datos");
                        ObjectOutputStream datos = new ObjectOutputStream(archivo);
                        datos.writeObject(modelo);
                        datos.close();
                    } catch (IOException exception) {
                        JOptionPane.showMessageDialog(null, "Error al guardar datos", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    }
                    System.exit(0);
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        mostrarEnCombo(modelo.getListaCategorias());
        if (modelo.getListaCategorias().size() != 0) {
            String descripcion = combo_parteK.getSelectedItem().toString();
            Categoria c = modelo.buscarCategoriaPorDescripcion(descripcion);
            mostrarProductos(c);
        }
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
        lbl_elegirCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_observaciones = new javax.swing.JTextField();
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
        btn_reiniciarPedido = new javax.swing.JButton();
        lbl_mostrarPedido = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_listaProductos = new javax.swing.JList<>();
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
        jPanel3.add(lbl_elegirCliente);

        jLabel3.setText("Observaciones");
        jPanel3.add(jLabel3);

        txt_observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_observacionesActionPerformed(evt);
            }
        });
        jPanel3.add(txt_observaciones);

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
        jPanel5.add(combo_parteK);

        jPanel2.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        btn_reiniciarPedido.setText("Reiniciar Pedido");
        btn_reiniciarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarPedidoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_reiniciarPedido);

        lbl_mostrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbl_mostrarPedido);

        jPanel2.add(jPanel4);

        panelProducto.setLayout(new java.awt.GridLayout(3, 0));
        jPanel2.add(panelProducto);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        lst_listaProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_listaProductosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_listaProductos);

        jPanel7.add(jScrollPane1);

        btn_eliminarItem.setText("Eliminar Item");
        btn_eliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarItemActionPerformed(evt);
            }
        });
        jPanel7.add(btn_eliminarItem);

        btn_grabarPedido.setText("Grabar Pedido");
        btn_grabarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarPedidoActionPerformed(evt);
            }
        });
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
        ventanaD ventana = new ventanaD(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_verPedidosActionPerformed

    private void txt_observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_observacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionesActionPerformed

    private void rbtn_ordenAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ordenAlfabeticoActionPerformed
        ArrayList<Categoria> lista = modelo.ordenarPorDescripcion();
        mostrarEnCombo(lista);
    }//GEN-LAST:event_rbtn_ordenAlfabeticoActionPerformed

    private void rbtn_ordenPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ordenPrioridadActionPerformed
        ArrayList<Categoria> lista = modelo.ordenarPorPrioridad();
        mostrarEnCombo(lista);
    }//GEN-LAST:event_rbtn_ordenPrioridadActionPerformed

    private void btn_grabarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarPedidoActionPerformed
        // TODO add your handling code here:
        Collection prod = lst_listaProductos.getSelectedValuesList();
        String nombreCliente = lbl_elegirCliente.getText();
        String observaciones = txt_observaciones.getText();
        if (nombreCliente.equals("") || prod.isEmpty()) {
            if (nombreCliente.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente para grabar un pedido. Intente de nuevo", "error", JOptionPane.ERROR_MESSAGE);
            }
            if (prod.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ninguna opcion de la lista fue seleccionada. Seleccione una.", "error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            ArrayList<String> prods = (ArrayList<String>) prod;
            ArrayList<Producto> products = new ArrayList<Producto>();
            for (int i = 0; i < prods.size(); i++) {
                String producto = prods.get(i);
                int pos = 0;
                String nombre = "";
                for (int j = producto.length() - 1; j > 0 && nombre.equals(""); j--) {
                    if (producto.charAt(j) == ' ') {
                        pos = j;
                        nombre = producto.substring(0, pos);
                    }
                }
                Producto p = modelo.buscarProductoPorNombre(nombre);
                products.add(p);
            }
            Pedido pedido = modelo.crearPedido(contadorPedidos, nombreCliente, products, observaciones);
            modelo.agregarPedido(pedido);
            JOptionPane.showMessageDialog(null, "Pedido grabado con exito!", "success", JOptionPane.INFORMATION_MESSAGE);
            String[] listData = {""};
            lst_listaProductos.setListData(listData);
            txt_observaciones.setText("");
            productos.clear();
            lbl_mostrarPedido.setText("");
            contadorPedidos++;
        }

    }//GEN-LAST:event_btn_grabarPedidoActionPerformed

    private void btn_eliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarItemActionPerformed
        // TODO add your handling code here:
        int[] prod = lst_listaProductos.getSelectedIndices();
        if (prod.length == 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun item para eliminar. Seleccione uno.", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            int contador = 0;
            for (int i = 0; i < prod.length; i++) {
                productos.remove(prod[i] - contador);
                contador++;

            }
            String[] listData = {""};
            lst_listaProductos.setListData(listData);
            String[] arr = new String[productos.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = productos.get(i);
            }
            lst_listaProductos.setListData(arr);
            lbl_mostrarPedido.setText("Pedido " + contadorPedidos + " $0.0");
        }
    }//GEN-LAST:event_btn_eliminarItemActionPerformed

    private void lst_listaProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_listaProductosValueChanged
        // TODO add your handling code here:
        Collection prod = lst_listaProductos.getSelectedValuesList();
        if (prod.size() != 0) {
            ArrayList<String> prods = (ArrayList<String>) prod;
            ArrayList<Producto> products = new ArrayList<Producto>();
            for (int i = 0; i < prods.size(); i++) {
                String producto = prods.get(i);
                int pos = 0;
                String nombre = "";
                for (int j = producto.length() - 1; j > 0 && nombre.equals(""); j--) {
                    if (producto.charAt(j) == ' ') {
                        pos = j;
                        nombre = producto.substring(0, pos);
                    }
                }
                Producto p = modelo.buscarProductoPorNombre(nombre);
                products.add(p);
            }
            String nombreCliente = lbl_elegirCliente.getText();
            String observaciones = txt_observaciones.getText();
            Pedido p = new Pedido(contadorPedidos, nombreCliente, products, observaciones);
            lbl_mostrarPedido.setText(p.toString());
        }
    }//GEN-LAST:event_lst_listaProductosValueChanged

    private void btn_reiniciarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarPedidoActionPerformed
        String[] listData = {""};
        lst_listaProductos.setListData(listData);
        lbl_mostrarPedido.setText("");
        lbl_elegirCliente.setText("");

    }//GEN-LAST:event_btn_reiniciarPedidoActionPerformed

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
            nuevo.setText(listaProductosDeCategoria.get(contador).toString());
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
            String producto = cual.getText();
            productos.add(producto);
            String[] arr = new String[productos.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = productos.get(i);
            }
            lst_listaProductos.setListData(arr);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_categorias;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_elegirCliente;
    private javax.swing.JButton btn_eliminarItem;
    private javax.swing.JButton btn_grabarPedido;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_reiniciarPedido;
    private javax.swing.JButton btn_verPedidos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> combo_parteK;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_elegirCliente;
    private javax.swing.JLabel lbl_mostrarPedido;
    private javax.swing.JList<String> lst_listaProductos;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JRadioButton rbtn_ordenAlfabetico;
    private javax.swing.JRadioButton rbtn_ordenPrioridad;
    private javax.swing.JTextField txt_observaciones;
    // End of variables declaration//GEN-END:variables

    public void mostrarEnCombo(ArrayList<Categoria> listaCategorias) {
        combo_parteK.removeAllItems();
        for (int i = 0; i < listaCategorias.size(); i++) {
            String descripcion = listaCategorias.get(i).getDescripcion();
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

            } else {
                if (evt.getPropertyName().equals("cliente")) {
                    Cliente c = (Cliente) evt.getNewValue();
                    if (c != null) {
                        lbl_elegirCliente.setText(c.toString());
                    }
                }
            }

        }
    }
}
