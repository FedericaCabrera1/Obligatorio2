/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dominio.Sistema;
import javax.swing.JFrame;

import dominio.Categoria;
import dominio.Producto;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ventanaC extends javax.swing.JFrame implements PropertyChangeListener {

    private Sistema modelo;

    public ventanaC(Sistema elModelo) {
        modelo = elModelo;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        list_categoriasProducto.setListData(modelo.getListaCategorias().toArray());
        modelo.addPropertyChangeListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_categoriasProducto = new javax.swing.JLabel();
        lbl_nombreProducto = new javax.swing.JLabel();
        lbl_precioProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_categoriasProducto = new javax.swing.JList();
        ta_nombreProducto = new javax.swing.JTextField();
        ta_precioProducto = new javax.swing.JTextField();
        btn_agregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AGREGAR PRODUCTO:");

        lbl_categoriasProducto.setText("Categorias:");

        lbl_nombreProducto.setText("Nombre:");

        lbl_precioProducto.setText("Precio:");

        list_categoriasProducto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                list_categoriasProductoComponentHidden(evt);
            }
        });
        list_categoriasProducto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_categoriasProductoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list_categoriasProducto);

        ta_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_nombreProductoActionPerformed(evt);
            }
        });

        ta_precioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_precioProductoActionPerformed(evt);
            }
        });

        btn_agregarProducto.setText("Agregar");
        btn_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombreProducto)
                            .addComponent(lbl_precioProducto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ta_precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ta_nombreProducto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(btn_agregarProducto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(lbl_categoriasProducto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(lbl_categoriasProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreProducto)
                    .addComponent(ta_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_precioProducto)
                    .addComponent(ta_precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btn_agregarProducto)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ta_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ta_nombreProductoActionPerformed

    private void ta_precioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_precioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ta_precioProductoActionPerformed

    private void btn_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarProductoActionPerformed
        Collection categorias = list_categoriasProducto.getSelectedValuesList();
        String nombre = ta_nombreProducto.getText();
        String precio = (ta_precioProducto.getText());

        if (!modelo.espacioVacio(nombre) && !modelo.espacioVacio(precio) && !categorias.isEmpty()) {
            String res = "";
            for (int j = 0; j < nombre.length(); j++) {
                if (nombre.charAt(j) != ' ') {
                    res += nombre.charAt(j);
                }
            }
            boolean precioEsDouble = modelo.validacionFormatoPrecio(precio);
            if (!precioEsDouble) {
                JOptionPane.showMessageDialog(null, "Error en el formato del precio. Reingrese ", "error", JOptionPane.ERROR_MESSAGE);
                ta_precioProducto.setText("");
            } else {
                ArrayList<Categoria> Arraycategorias = new ArrayList();
                Iterator<Categoria> it = categorias.iterator();
                while(it.hasNext()){
                    Arraycategorias.add((Categoria) it.next());
                }
                
                Producto p = modelo.crearProducto(Arraycategorias, res, Double.parseDouble(precio));
                boolean esUnico = modelo.verificarNombreUnicoProducto(p);

                if (!esUnico) {
                    JOptionPane.showMessageDialog(null, "Ya existe un producto con este nombre. Reingrese", "error", JOptionPane.ERROR_MESSAGE);
                    ta_nombreProducto.setText("");

                } else {
                    modelo.agregarProducto(p);
                    JOptionPane.showMessageDialog(null, "Producto agregado con éxito!", "success", JOptionPane.INFORMATION_MESSAGE);
                    ta_nombreProducto.setText("");
                    ta_precioProducto.setText("");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hay campos en blanco. Reingrese", "error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_agregarProductoActionPerformed

    private void list_categoriasProductoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_list_categoriasProductoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_list_categoriasProductoComponentHidden

    private void list_categoriasProductoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_categoriasProductoValueChanged

    }//GEN-LAST:event_list_categoriasProductoValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_categoriasProducto;
    private javax.swing.JLabel lbl_nombreProducto;
    private javax.swing.JLabel lbl_precioProducto;
    private javax.swing.JList list_categoriasProducto;
    private javax.swing.JTextField ta_nombreProducto;
    private javax.swing.JTextField ta_precioProducto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String[] listData = {""};
        list_categoriasProducto.setListData(listData);
        list_categoriasProducto.setListData(modelo.getListaCategorias().toArray());
    }
}
