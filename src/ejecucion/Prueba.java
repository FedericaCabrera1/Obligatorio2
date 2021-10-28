/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

import dominio.Sistema;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import vista.VentanaPrincipal;

public class Prueba {

    public static void main(String[] args) {
        String archCSV = "C:/Users/María Mercedes/Documents/Programación 2/Obligatorio2/DatosPrueba.csv";
//        try {
//            FileInputStream file2 = new FileInputStream(archCSV); //le paso el nombre del archivo y el path
//            BufferedInputStream b2 = new BufferedInputStream(file2);
//            ObjectInputStream ob2 = new ObjectInputStream(b2);
//
//        } catch (IOException e) {
//
//        }

        String[] fila = null;
        Sistema s = new Sistema();
        VentanaPrincipal ventana = new VentanaPrincipal(s);

        ventana.setVisible(true);

    }

}
