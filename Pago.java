public interface Pago {
    void pagar(double monto);
    String obtenerTipo();
    void generarComprobante();
}