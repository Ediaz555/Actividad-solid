public interface Descuento {
    double aplicar(double total);
    String tipoDescuento();
    void mostrarDescuento();
}