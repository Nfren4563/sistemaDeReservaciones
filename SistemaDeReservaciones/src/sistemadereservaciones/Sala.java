
package sistemadereservaciones;

public class Sala {
    private String nombre;
    private Asiento[] asientos;

    public Sala(String nombre, int numAsientos) {
        this.nombre = nombre;
        this.asientos = new Asiento[numAsientos];
        for (int i = 0; i < numAsientos; i++) {
            asientos[i] = new Asiento(i + 1); // Asientos numerados desde 1
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Asiento getAsiento(int numeroAsiento) {
        if (numeroAsiento >= 0 && numeroAsiento < asientos.length) {
            return asientos[numeroAsiento]; // Devuelve el objeto Asiento correspondiente
        }
        return null; // Si el número de asiento es inválido
    }

    public void mostrarDisponibilidad() {
        for (Asiento asiento : asientos) {
            System.out.println("Asiento " + asiento.getNumero() + ": " +
                    (asiento.isReservado() ? "Reservado" : "Disponible"));
        }
    }

    // Método para realizar la reserva
    public boolean reservarAsiento(Asiento asiento, Espectador espectador) {
        if (asiento != null && !asiento.isReservado()) {  // Verifica si el asiento no está reservado
            return asiento.reservar(espectador); // Realiza la reserva
        }
        return false; // Si el asiento está ocupado o es nulo, no se puede reservar
    }
}