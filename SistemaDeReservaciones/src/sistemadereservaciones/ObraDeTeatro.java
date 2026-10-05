
package sistemadereservaciones;

public class ObraDeTeatro extends Espectaculo {
    private String director;
    private String[] elenco;

    public ObraDeTeatro(String titulo, int duracion, String genero, String descripcion, String director, String[] elenco) {
        super(titulo, duracion, genero, descripcion);
        this.director = director;
        this.elenco = elenco;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Obra de Teatro: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Elenco: " + String.join(", ", elenco));
    }
}
