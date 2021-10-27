/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

import dominio.Sistema;
import vista.VentanaPrincipal;

public class Prueba {
    
    public static void main(String[] args) {
       Sistema s = new Sistema();
       VentanaPrincipal ventana = new VentanaPrincipal(s);
       ventana.setVisible(true);
       
    }
}
