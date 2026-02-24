public class Factura {
    private int numero;
    private String fecha;
    private double total;

    public Factura(int numero, String fecha, double total) {
        this.numero = numero;
        this.fecha = fecha;
        this.total = total;
    }

    public void generarFactura() {
        System.out.println("Factura #" + numero + " - $" + total);
    }

    public void enviarFactura() {
        System.out.println("Factura enviada");
    }

    public void mostrarFactura() {
        System.out.println(numero + " - " + fecha + " - $" + total);
    }
}