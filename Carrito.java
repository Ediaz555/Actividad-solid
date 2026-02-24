import java.util.ArrayList;

public class Carrito {
    private int id;
    private ArrayList<ItemCarrito> items;
    private double total;

    public Carrito() {
        this.id = 1;
        items = new ArrayList<>();
        total = 0;
    }

    public void agregarProducto(Producto p, int cantidad) {
        items.add(new ItemCarrito(p, cantidad));
    }

    public double calcularTotal() {
        total = 0;
        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void vaciarCarrito() {
        items.clear();
        total = 0;
    }
}