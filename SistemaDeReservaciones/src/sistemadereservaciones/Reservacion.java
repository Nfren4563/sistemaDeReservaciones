
package sistemadereservaciones;

public class Reservacion {
    private Espectador espectador;
    private Espectaculo espectaculo;
    private Sala sala;
    private int asiento;

    public Reservacion(Espectador espectador, Espectaculo espectaculo, Sala sala, int numeroAsiento) {
        Asiento asiento = sala.getAsiento(numeroAsiento);  // Obtener el objeto Asiento
        if (asiento != null && sala.reservarAsiento(asiento, espectador)) {  // Verifica si se puede reservar
            this.espectador = espectador;
            this.espectaculo = espectaculo;
            this.sala = sala;
            this.asiento = numeroAsiento;  // Almacena el número del asiento
        } else {
            System.out.println("No se pudo reservar el asiento.");
        }
    }
}

