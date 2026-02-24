public class Cliente extends Usuario {
    private Carrito carrito;
    private String direccion;
    private String telefono;

    public Cliente(int id, String nombre, String email, String direccion, String telefono) {
        super(id, nombre, email);
        this.direccion = direccion;
        this.telefono = telefono;
        this.carrito = new Carrito();
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void actualizarDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarCliente() {
        System.out.println(nombre + " - " + direccion + " - " + telefono);
    }
}