/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

import dominio.Categoria;
import dominio.Cliente;
import dominio.Producto;
import dominio.Sistema;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import vista.VentanaPrincipal;

public class Prueba {

    public static final String QUOTE = "\"";

    public static void main(String[] args) {
        String archCSV = "DatosPrueba.csv";
        //        try {
        //            FileInputStream file2 = new FileInputStream(archCSV); //le paso el nombre del archivo y el path
        //            BufferedInputStream b2 = new BufferedInputStream(file2);
        //            ObjectInputStream ob2 = new ObjectInputStream(b2);
        //
        //        } catch (IOException e) {
        //
        //        }

        BufferedReader br = null;
        Sistema s = new Sistema();

        try {

            br = new BufferedReader(new FileReader("DatosPrueba.csv"));
            String line = br.readLine();
            int contador = 0;
            int aux = 1;
            while (null != line) {
                String[] fields = line.split(";");
                if (fields.length == 1) {
                    contador = Integer.parseInt(fields[0]);
                    br.readLine();
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
                    br.readLine();
                }
                aux++;
                System.out.println(Arrays.toString(fields));

            }

        } catch (Exception e) {

        }

        String[] fila = null;
        for (int i = 0; i < s.getListaCategorias().size(); i++) {
            System.out.println(s.getListaCategorias().get(i));
        }
        //        VentanaPrincipal ventana = new VentanaPrincipal(s);
        //
        //        ventana.setVisible(true);

    }

}
