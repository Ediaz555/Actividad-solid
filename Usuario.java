public class Usuario {
    protected int id;
    protected String nombre;
    protected String email;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void iniciarSesion() {
        System.out.println(nombre + " inició sesión");
    }

    public void cerrarSesion() {
        System.out.println(nombre + " cerró sesión");
    }

    public void mostrarDatos() {
        System.out.println(id + " - " + nombre + " - " + email);
    }
}