
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {
    private ArrayList<Categoria> categorias;
    private String nombre;
    private double precio;
    private static final long serialVersionUID = 11111;

    public Producto(ArrayList<Categoria> lasCategorias, String unNombre, double unPrecio){
        categorias = lasCategorias;
        nombre = unNombre;
        precio = unPrecio;
    }
    
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String toString(){
        return nombre + " $" + precio;
    }
    
    
}
