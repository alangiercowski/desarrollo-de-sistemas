import java.util.HashMap;

public class Carrito {
    private Integer idCarrito;
    private HashMap<Producto, Integer>productoXcantidad;
    private Cliente cliente;

    public Carrito(Integer idCarrito, HashMap<Producto, Integer> productoXcantidad, Cliente cliente) {
        this.idCarrito = idCarrito;
        this.productoXcantidad = productoXcantidad;
        this.cliente = cliente;
    }

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public HashMap<Producto, Integer> getProductoXcantidad() {
        return productoXcantidad;
    }

    public void setProductoXcantidad(HashMap<Producto, Integer> productoXcantidad) {
        this.productoXcantidad = productoXcantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void agregarAlCarrito(Producto p, Integer cantidad){
        this.productoXcantidad.put(p,cantidad);
    }
    public void sacarDelCarrito(Producto p, Integer cantidad){
        if(productoXcantidad.get(p)> cantidad) {
            this.productoXcantidad.put(p, productoXcantidad.get(p) - cantidad);
        }
    }
}
