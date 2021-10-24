package dominio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Pedido> listaPedidos;
    private PropertyChangeSupport gestor = new PropertyChangeSupport(this);

    public Sistema() {
        listaClientes = new ArrayList();
        listaCategorias = new ArrayList();
        listaProductos = new ArrayList();
        listaPedidos = new ArrayList();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public Cliente crearCliente(String nombre, String direccion, String telefono) {
        Cliente cliente = new Cliente(nombre, direccion, telefono);
        return cliente;
    }

    public void agregarCliente(Cliente c) {
        this.listaClientes.add(c);
    }

    public boolean verificarNombreUnico(Cliente unCliente) {
        boolean esUnico = true;
        String nombre = unCliente.getNombre();
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (listaClientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                esUnico = false;
            }
        }

        return esUnico;
    }

    public boolean verificarNombreUnicoProducto(Producto unProducto) {
        boolean esUnico = true;
        String nombre = unProducto.getNombre();
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if (listaProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                esUnico = false;
            }
        }

        return esUnico;
    }

    public boolean validacionFormatoPrecio(String precio){
    boolean esCorrecto = false;
        try {
            double precioDouble = Double.parseDouble(precio);
            esCorrecto = true;
        } catch (NumberFormatException e) {
            esCorrecto = false;
        }
        return esCorrecto;
    }

    public boolean verificarDescripcionUnica(Categoria unaCategoria) {
        boolean esUnica = true;
        String descripcion = unaCategoria.getDescripcion();
        String descSinEspacios = sacarEspacios(descripcion);
        for (int i = 0; i < this.listaCategorias.size(); i++) {
            String descripComparar = this.listaCategorias.get(i).getDescripcion();
            if (sacarEspacios(descripComparar).equalsIgnoreCase(descSinEspacios)) {
                esUnica = false;
            }
        }
        return esUnica;
    }

    public Categoria crearCategoria(String descripcion, int prioridad, String detalles) {
        Categoria categoria = new Categoria(descripcion, prioridad, detalles);
        return categoria;
    }

    public void agregarCategoria(Categoria c) {
        ArrayList<Categoria> old = this.getListaCategorias();
        this.listaCategorias.add(c);
        gestor.firePropertyChange("valor", old, this.getListaCategorias());
    }

    public Producto crearProducto(ArrayList<Categoria> lasCategorias, String unNombre, double unPrecio) {
        Producto producto = new Producto(lasCategorias, unNombre, unPrecio);
        return producto;
    }

    public void agregarProducto(Producto p) {
        this.listaProductos.add(p);
    }

    public String sacarEspacios(String s) {
        String res = "";
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != ' ') {
                res += s.charAt(j);
            }
        }
        return res;
    }

    public boolean espacioVacio(String s) {
        boolean hayEspacio = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                hayEspacio = false;

            }

        }
        return hayEspacio;
    }
    
    
     public ArrayList<Categoria> ordenarPorDescripcion(){
       Collections.sort(listaCategorias, new Comparator<Categoria>(){
           public int compare(Categoria c1, Categoria c2){
            return c1.getDescripcion().compareTo(c2.getDescripcion());
           }
       }); 
       return listaCategorias;
   }
   
    public class criterioPorPrioridad implements Comparator<Categoria>{
       @Override
       public int compare(Categoria c1, Categoria c2){
           return (int)(c2.getPrioridad() - c1.getPrioridad());
       }
   }
    
    public ArrayList<Categoria> ordenarPorPrioridad (){
        Collections.sort(listaCategorias, new criterioPorPrioridad());
        return listaCategorias;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener lis){
        gestor.addPropertyChangeListener(lis);
    }
    
    public ArrayList<Producto> darProductosDeCategoria(Categoria c){
        ArrayList<Producto> productosDeLaCategoria = new ArrayList<Producto>();
        for(int i=0; i<this.listaProductos.size();i++){
            boolean esta = false;
            ArrayList<Categoria> catProd = this.listaProductos.get(i).getCategorias();
            for(int j=0; j<catProd.size() && !esta; j++){
                if(catProd.get(i).getDescripcion().equalsIgnoreCase(c.getDescripcion())){
                    esta = true;
                }
            }
            if(esta){
                    productosDeLaCategoria.add(this.listaProductos.get(i));
                }
            
        }
        return productosDeLaCategoria;
    }

}
