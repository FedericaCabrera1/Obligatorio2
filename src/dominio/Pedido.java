
package dominio;

import java.util.ArrayList;
        
public class Pedido {
    private int numero;
    private String nombreCliente ;
    private double totalPrecio;
    private ArrayList<Producto> listaProductos;

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

    public double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
}
