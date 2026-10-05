package sistemadereservaciones;

public class Asiento {
    private int numero;
    private boolean reservado;
    private Espectador espectador;

    public Asiento(int numero) {
        this.numero = numero;
        this.reservado = false;
        this.espectador = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservado() {
        return reservado;
    }

    public boolean reservar(Espectador espectador) {
        if (!reservado) {
            this.espectador = espectador;
            this.reservado = true;
            return true; // Reserva exitosa
        }
        return false; // Si ya está reservado, no se puede reservar
    }
}
