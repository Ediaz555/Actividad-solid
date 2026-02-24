public class Cliente extends Usuario {
    private Carrito carrito;

    public Cliente(String nombre, String email) {
        super(nombre, email);
        carrito = new Carrito();
    }

    public Carrito getCarrito() {
        return carrito;
    }
}