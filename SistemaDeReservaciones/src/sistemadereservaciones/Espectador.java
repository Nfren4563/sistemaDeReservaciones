
package sistemadereservaciones;

public class Espectador {
    private String nombre;
    private String correo;

    public Espectador(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}
