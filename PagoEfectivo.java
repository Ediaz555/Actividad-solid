public class PagoEfectivo implements Pago {
    private double montoRecibido;
    private double cambio;
    private String cajero;

    public PagoEfectivo(double montoRecibido, String cajero) {
        this.montoRecibido = montoRecibido;
        this.cajero = cajero;
    }

    public void pagar(double monto) {
        cambio = montoRecibido - monto;
        System.out.println("Pago en efectivo. Cambio: $" + cambio);
    }

    public String obtenerTipo() {
        return "Efectivo";
    }

    public void generarComprobante() {
        System.out.println("Comprobante generado - Efectivo");
    }
}