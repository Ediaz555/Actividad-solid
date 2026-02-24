
public class Usuario {
    protected String nombre;
    protected String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void iniciarSesion() {
        System.out.println(nombre + " inició sesión");
    }
}