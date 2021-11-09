package vista;

import dominio.Cliente;
import dominio.Pedido;
import dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ventanaF extends javax.swing.JFrame implements PropertyChangeListener {

    private Sistema modelo;

    public ventanaF(Sistema elModelo) {
        modelo = elModelo;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        list_clientesFiltrados.setListData(modelo.getListaClientes().toArray());
        modelo.addPropertyChangeListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titVentanaF = new javax.swing.JLabel();
        ta_filtrarCliente = new javax.swing.JTextField();
        lbl_filtrarVentanaF = new javax.swing.JLabel();
        btn_filtrarCliente = new javax.swing.JButton();
        btn_resetearBusquedaCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_clientesFiltrados = new javax.swing.JList();
        btn_elegirCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_titVentanaF.setText("LISTA DE CLIENTES:");

        ta_filtrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_filtrarClienteActionPerformed(evt);
            }
        });

        lbl_filtrarVentanaF.setText("Filtrar:");

        btn_filtrarCliente.setText("Aplicar filtro");
        btn_filtrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarClienteActionPerformed(evt);
            }
        });

        btn_resetearBusquedaCliente.setText("Resetear busqueda");
        btn_resetearBusquedaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetearBusquedaClienteActionPerformed(evt);
            }
        });

        list_clientesFiltrados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(list_clientesFiltrados);

        btn_elegirCliente.setText("ELEGIR CLIENTE");
        btn_elegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titVentanaF)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_filtrarVentanaF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ta_filtrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_filtrarCliente))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_resetearBusquedaCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_elegirCliente))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_titVentanaF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta_filtrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_filtrarVentanaF)
                    .addComponent(btn_filtrarCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_resetearBusquedaCliente)
                    .addComponent(btn_elegirCliente))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ta_filtrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_filtrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ta_filtrarClienteActionPerformed

    private void btn_filtrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarClienteActionPerformed
        String[] listData = {""};
        list_clientesFiltrados.setListData(listData);
        if (modelo.getListaClientes().size() != 0) {
            String filtro = modelo.sacarEspacios(ta_filtrarCliente.getText());
            list_clientesFiltrados.setListData(modelo.buscarClientesPorFiltro(filtro).toArray());
        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes para filtrar. Agregue uno", "error", JOptionPane.INFORMATION_MESSAGE);
            ta_filtrarCliente.setText("");
            ventanaA ventana = new ventanaA(modelo);
            ventana.setVisible(true);
        }


    }//GEN-LAST:event_btn_filtrarClienteActionPerformed

    private void btn_resetearBusquedaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetearBusquedaClienteActionPerformed
        String[] listData = {""};
        list_clientesFiltrados.setListData(listData);
        ta_filtrarCliente.setText("");
        list_clientesFiltrados.setListData(modelo.getListaClientes().toArray());
    }//GEN-LAST:event_btn_resetearBusquedaClienteActionPerformed

    private void btn_elegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegirClienteActionPerformed
        Cliente c = (Cliente) list_clientesFiltrados.getSelectedValue();
        modelo.clienteElegido(c);
        dispose();
    }//GEN-LAST:event_btn_elegirClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_elegirCliente;
    private javax.swing.JButton btn_filtrarCliente;
    private javax.swing.JButton btn_resetearBusquedaCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_filtrarVentanaF;
    private javax.swing.JLabel lbl_titVentanaF;
    private javax.swing.JList list_clientesFiltrados;
    private javax.swing.JTextField ta_filtrarCliente;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("cl")) {
            String[] listData = {""};
            list_clientesFiltrados.setListData(listData);
            String filtro = modelo.sacarEspacios(ta_filtrarCliente.getText());
            list_clientesFiltrados.setListData(modelo.buscarClientesPorFiltro(filtro).toArray());
        }
    }
}
