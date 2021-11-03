
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
        
public class Pedido implements Serializable{
    private int numero;
    private String nombreCliente;
    private ArrayList<Producto> listaProductos;
    private String observaciones;
    
    public Pedido (int unNumero, String unCliente, ArrayList<Producto> unaListaProductos, String unaObservacion){
        numero = unNumero;
        nombreCliente = unCliente;
        listaProductos = unaListaProductos;
        observaciones = unaObservacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

  

    public double precioTotal() {
        double precioTotal = 0;
        for (int i=0; i<this.listaProductos.size(); i++){
            precioTotal += this.listaProductos.get(i).getPrecio();
        }
        return precioTotal;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public String toString(){
        return "Pedido " + numero + " $" + this.precioTotal();
    }
   
    
    
}
