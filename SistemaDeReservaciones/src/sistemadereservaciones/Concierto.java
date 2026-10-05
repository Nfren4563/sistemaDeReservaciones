package sistemadereservaciones;

public class Concierto extends Espectaculo {

    private String banda;
    private String[] canciones;

    public Concierto(String titulo, int duracion, String genero, String descripcion, String banda, String[] canciones) {
        super(titulo, duracion, genero, descripcion);
        this.banda = banda;
        this.canciones = canciones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Concierto: " + titulo);
        System.out.println("Banda: " + banda);
        System.out.println("Canciones: " + String.join(", ", canciones));
    }
}
