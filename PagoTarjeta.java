public class PagoTarjeta implements Pago {
    private String numeroTarjeta;
    private String titular;
    private String banco;

    public PagoTarjeta(String numeroTarjeta, String titular, String banco) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.banco = banco;
    }

    public void pagar(double monto) {
        System.out.println("Pago con tarjeta por $" + monto);
    }

    public String obtenerTipo() {
        return "Tarjeta";
    }

    public void generarComprobante() {
        System.out.println("Comprobante generado - Tarjeta");
    }
}