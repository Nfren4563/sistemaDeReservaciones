
package sistemadereservaciones;

public class StandUpComedy extends Espectaculo {
    private String comediante;
    private int edadMinima;
    private String[] temas;

    public StandUpComedy(String titulo, int duracion, String genero, String descripcion, String comediante, int edadMinima, String[] temas) {
        super(titulo, duracion, genero, descripcion);
        this.comediante = comediante;
        this.edadMinima = edadMinima;
        this.temas = temas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Stand-Up Comedy: " + titulo);
        System.out.println("Comediante: " + comediante);
        System.out.println("Edad Mínima Recomendada: " + edadMinima);
    }
}


