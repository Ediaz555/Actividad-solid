public class ItemCarrito {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecio() * cantidad;
    }

    public double calcularSubtotal() {
        subtotal = producto.getPrecio() * cantidad;
        return subtotal;
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void mostrarItem() {
        System.out.println(producto + " x" + cantidad);
    }
}