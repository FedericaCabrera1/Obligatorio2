package vista;

import dominio.Categoria;
import dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ventanaB extends javax.swing.JFrame {

    private Sistema modelo;

    public ventanaB(Sistema elModelo) {
        modelo = elModelo;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_descripcionCategoria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcionCategoria = new javax.swing.JTextArea();
        lbl_prioridadCategoria = new javax.swing.JLabel();
        sp_prioridadCategoria = new javax.swing.JSpinner();
        lbl_detallesCategoria = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_detallesCategoria = new javax.swing.JTextArea();
        btn_agregarCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("AGREGAR CATEGORIA:");

        lbl_descripcionCategoria.setText("Descripcion:");

        ta_descripcionCategoria.setColumns(20);
        ta_descripcionCategoria.setRows(5);
        jScrollPane1.setViewportView(ta_descripcionCategoria);

        lbl_prioridadCategoria.setText("Prioridad: (1 - 10)");

        sp_prioridadCategoria.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        lbl_detallesCategoria.setText("Detalles:");

        ta_detallesCategoria.setColumns(20);
        ta_detallesCategoria.setRows(5);
        jScrollPane2.setViewportView(ta_detallesCategoria);

        btn_agregarCategoria.setText("Agregar");
        btn_agregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_prioridadCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(sp_prioridadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_detallesCategoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_descripcionCategoria)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btn_agregarCategoria)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbl_descripcionCategoria))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_prioridadCategoria)
                    .addComponent(sp_prioridadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbl_detallesCategoria))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn_agregarCategoria)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCategoriaActionPerformed
        String descripcion = ta_descripcionCategoria.getText();
        String detalles = ta_detallesCategoria.getText();
        int prioridad = Integer.parseInt(String.valueOf(sp_prioridadCategoria.getValue()));

        if (!modelo.espacioVacio(descripcion) && !modelo.espacioVacio(detalles)) {
            Categoria c = modelo.crearCategoria(descripcion, prioridad, detalles);
            boolean esUnica = modelo.verificarDescripcionUnica(c);
            if (!esUnica) {
                JOptionPane.showMessageDialog(null, "Ya existe una categoria con esa descripcion. Reingrese", "error", JOptionPane.ERROR_MESSAGE);
                ta_descripcionCategoria.setText("");

            } else {
                modelo.agregarCategoria(c);
                JOptionPane.showMessageDialog(null, "Categoria agregada con éxito!", "success", JOptionPane.INFORMATION_MESSAGE);
                ta_descripcionCategoria.setText("");
                sp_prioridadCategoria.setValue(1);
                ta_detallesCategoria.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hay campos en blanco. Reingrese", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_agregarCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_descripcionCategoria;
    private javax.swing.JLabel lbl_detallesCategoria;
    private javax.swing.JLabel lbl_prioridadCategoria;
    private javax.swing.JSpinner sp_prioridadCategoria;
    private javax.swing.JTextArea ta_descripcionCategoria;
    private javax.swing.JTextArea ta_detallesCategoria;
    // End of variables declaration//GEN-END:variables



}
