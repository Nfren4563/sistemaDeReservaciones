package sistemadereservaciones;

public abstract class Espectaculo {
    protected String titulo;
    private int duracion;
    private String genero;
    private String descripcion;

    public Espectaculo(String titulo, int duracion, String genero, String descripcion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    // Métodos para obtener los atributos
    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracion; }
    public String getGenero() { return genero; }
    public String getDescripcion() { return descripcion; }

    public abstract void mostrarDetalles();
}
