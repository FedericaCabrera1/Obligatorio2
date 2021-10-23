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
}
