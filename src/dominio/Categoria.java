
package dominio;

import java.io.Serializable;

public class Categoria implements Serializable {
//Mercedes Bañales & Federica Cabrera
 
    private String descripcion;
    private int prioridad;
    private String detalles;

    
    public Categoria(String unaDescripcion, int unaPrioridad, String unosDetalles){
        descripcion = unaDescripcion;
        prioridad = unaPrioridad;
        detalles = unosDetalles;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    public String toString(){
        return "descripción: " + this.getDescripcion() + " prioridad: " + this.getPrioridad() + " detalles: " + this.getDetalles();
    }
    
    
}
