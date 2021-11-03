
package dominio;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String direccion;
    private String telefono;

    
    public Cliente(String nombre, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString(){
       return this.getNombre() + " (" + this.getDireccion() + " - " + this.getTelefono() + ")";
    }
    
    public String toStringVacio(){
        return this.getNombre() + this.getDireccion() + this.getTelefono();
    }
}
