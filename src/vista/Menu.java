package vista;

import dominio.Categoria;
import dominio.Cliente;
import dominio.Pedido;
import dominio.Producto;
import dominio.Sistema;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        btn_sinDatos = new javax.swing.JButton();
        btn_datosPrueba = new javax.swing.JButton();
        btn_datosPrevios = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_sinDatos.setText("Sistema vacío");
        btn_sinDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinDatosActionPerformed(evt);
            }
        });

        btn_datosPrueba.setText("Datos de prueba");
        btn_datosPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datosPruebaActionPerformed(evt);
            }
        });

        btn_datosPrevios.setText("Datos de ejecución previa");
        btn_datosPrevios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datosPreviosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_datosPrevios, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(btn_datosPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sinDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_sinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_datosPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_datosPrevios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sinDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinDatosActionPerformed
        Sistema s = new Sistema();
        VentanaPrincipal ventana = new VentanaPrincipal(s, 1);
        ventana.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_sinDatosActionPerformed

    private void btn_datosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datosPruebaActionPerformed
       JFileChooser j = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("csv", "csv", "csv");
       j.setFileFilter(filtro);
        int i = j.showOpenDialog(null);
        if (i == j.APPROVE_OPTION) {
            File f = j.getSelectedFile();
            String filepath = f.getPath();
            Sistema s = datosPrecargados(filepath);
            VentanaPrincipal ventana = new VentanaPrincipal(s, 1);
            ventana.setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_btn_datosPruebaActionPerformed

    public Sistema datosPrecargados(String p) {
        BufferedReader br = null;
        Sistema s = new Sistema();

        try {
            br = new BufferedReader(new FileReader(p));
            String line = br.readLine();
            int contador = 0;
            int aux = 0;
            while (br.ready()) {
                String[] fields = line.split(";");
                if (fields.length == 1) {
                    contador = Integer.parseInt(fields[0]);
                    line = br.readLine();
                    aux++;
                }
                int aux2 = 0;
                while (aux2 != contador && fields.length != 1) {
                    if (aux == 1) {
                        String nombre = fields[0];
                        String direccion = fields[1];
                        String telefono = fields[2];
                        Cliente cliente = new Cliente(nombre, direccion, telefono);
                        s.agregarCliente(cliente);
                    } else {
                        if (aux == 2) {
                            String descripcion = fields[0];
                            String detalles = fields[1];
                            int prioridad = Integer.parseInt(fields[2]);
                            Categoria categoria = new Categoria(descripcion, prioridad, detalles);
                            s.agregarCategoria(categoria);
                        } else {
                            if (aux == 3) {
                                String nombre = fields[0];
                                double precio = Double.parseDouble(fields[1]);
                                ArrayList<Categoria> categoriasProducto = new ArrayList<>();
                                for (int i = 2; i < fields.length; i++) {
                                    String nombreCategoria = fields[i];
                                    Categoria catProducto = s.buscarCategoriaPorDescripcion(nombreCategoria);
                                    categoriasProducto.add(catProducto);
                                }
                                Producto producto = new Producto(categoriasProducto, nombre, precio);
                                s.agregarProducto(producto);
                            }
                        }
                    }
                    aux2++;
                    if (br.ready()) {
                        line = br.readLine();
                    }
                    fields = line.split(";");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el archivo.", "error", JOptionPane.ERROR_MESSAGE);
        }

        return s;
    }

    private void btn_datosPreviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datosPreviosActionPerformed

        try {
            Sistema s = recuperarDatos();
            int cantidadPedidos = s.getListaPedidos().size();
            VentanaPrincipal ventana = new VentanaPrincipal(s, cantidadPedidos + 1);
            ventana.setVisible(true);
            dispose();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos", "Salir", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_datosPreviosActionPerformed

    public Sistema recuperarDatos() throws ClassNotFoundException {
        Sistema s = new Sistema();
        try {
            FileInputStream archivo = new FileInputStream("Datos");
            ObjectInputStream datos = new ObjectInputStream(archivo);
            s = (Sistema) datos.readObject();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos", "Salir", JOptionPane.ERROR_MESSAGE);
        }

        return s;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datosPrevios;
    private javax.swing.JButton btn_datosPrueba;
    private javax.swing.JButton btn_sinDatos;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
