public class DescuentoPorcentaje implements Descuento {
    private double porcentaje;
    private String motivo;
    private String codigo;

    public DescuentoPorcentaje(double porcentaje, String motivo, String codigo) {
        this.porcentaje = porcentaje;
        this.motivo = motivo;
        this.codigo = codigo;
    }

    public double aplicar(double total) {
        return total - (total * porcentaje / 100);
    }

    public String tipoDescuento() {
        return "Porcentaje";
    }

    public void mostrarDescuento() {
        System.out.println("Descuento " + porcentaje + "% - " + motivo);
    }
}