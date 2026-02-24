public class Pedido {
    private int id;
    private double total;
    private String estado;
    private Factura factura;   // ← ahora sí está asociada

    public Pedido(int id, Carrito carrito) {
        this.id = id;
        this.total = carrito.calcularTotal();
        this.estado = "Pendiente";
    }

    public void aplicarDescuento(Descuento descuento) {
        total = descuento.aplicar(total);
    }

    public void procesarPago(Pago pago) {
        pago.pagar(total);
        estado = "Pagado";
        factura = new Factura(id, "24/02/2026", total);
        factura.generarFactura();
    }

    public void mostrarPedido() {
        System.out.println("Pedido #" + id + " - $" + total + " - " + estado);
    }
}