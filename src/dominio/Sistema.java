package dominio;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Pedido> listaPedidos;
    
    public Sistema(){
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

    public boolean verificarDescripcionUnica(Categoria unaCategoria) {
        boolean esUnica = true;
        String descripcion = unaCategoria.getDescripcion();
        String descSinEspacios = sacarEspacios(descripcion);
        for (int i = 0; i < this.listaCategorias.size(); i++) {
            String descripComparar = this.listaCategorias.get(i).getDescripcion();
            if(sacarEspacios(descripComparar).equalsIgnoreCase(descSinEspacios)) {
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
        this.listaCategorias.add(c);
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

}
