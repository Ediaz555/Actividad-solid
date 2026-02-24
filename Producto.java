public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println(id + " - " + nombre + " - $" + precio);
    }
}