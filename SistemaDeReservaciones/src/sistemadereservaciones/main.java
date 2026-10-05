package sistemadereservaciones;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear salas separadas para cada tipo de espectáculo
        Sala salaTeatro1 = new Sala("Sala Teatro 1", 10);
        Sala salaTeatro2 = new Sala("Sala Teatro 2", 10);
        Sala salaTeatro3 = new Sala("Sala Teatro 3", 10);

        Sala salaConcierto1 = new Sala("Sala Concierto 1", 10);
        Sala salaConcierto2 = new Sala("Sala Concierto 2", 10);
        Sala salaConcierto3 = new Sala("Sala Concierto 3", 10);

        Sala salaStandUp1 = new Sala("Sala StandUp 1", 10);
        Sala salaStandUp2 = new Sala("Sala StandUp 2", 10);
        Sala salaStandUp3 = new Sala("Sala StandUp 3", 10);

        // Crear espectáculos
        ObraDeTeatro obra1 = new ObraDeTeatro("Hamlet", 120, "Drama", "Una obra clásica de Shakespeare", "Juan Pérez", new String[]{"Pedro Pérez", "Laura García"});
        ObraDeTeatro obra2 = new ObraDeTeatro("Romeo y Julieta", 150, "Romántica", "Un clásico de Shakespeare", "Ana López", new String[]{"Ricardo López", "Claudia Rodríguez"});
        ObraDeTeatro obra3 = new ObraDeTeatro("Macbeth", 100, "Tragedia", "Una tragedia de Shakespeare", "Carlos Martínez", new String[]{"Javier Martínez", "Carla Gómez"});

        Concierto concierto1 = new Concierto("Concierto de Rock", 90, "Rock", "Un concierto de una famosa banda", "Banda Rock", new String[]{"Vuela Libre", "Fuego y Alma"});
        Concierto concierto2 = new Concierto("Concierto de Jazz", 120, "Jazz", "Concierto de artistas internacionales", "Banda Jazz", new String[]{"Jazz Vibes", "Noche Estrellada"});
        Concierto concierto3 = new Concierto("Concierto de Música Electrónica", 100, "Electrónica", "Concierto en vivo", "DJ Max", new String[]{"Techno Beat", "Ritmos del Futuro"});

        StandUpComedy standUp1 = new StandUpComedy("Comedia Stand-Up", 60, "Comedia", "Un espectáculo divertido", "Carlos Alberto", 18, new String[]{"Política", "Vida cotidiana"});
        StandUpComedy standUp2 = new StandUpComedy("Comedia de Tecnología", 70, "Comedia", "Un show divertido sobre tecnología", "Miguel García", 16, new String[]{"Deportes", "Tecnología"});
        StandUpComedy standUp3 = new StandUpComedy("Comedia de Cine", 80, "Comedia", "Un show sobre las películas populares", "Sara Ruiz", 18, new String[]{"Cultura Pop", "Cine"});

        // Bucle para gestionar las reservas
        while (true) {
            System.out.println("\n¿Qué tipo de espectáculo deseas ver?");
            System.out.println("1. Obra de Teatro");
            System.out.println("2. Concierto");
            System.out.println("3. Stand-Up Comedy");
            System.out.println("4. Salir");

            // Salir del programa si el usuario elige 4
            int opcion = sc.nextInt();
            if (opcion == 4) {
                break;
            }

            Espectaculo espectaculoElegido = null;
            Sala salaSeleccionada = null;

            // Bucle para seleccionar un espectáculo específico
            while (true) {
                System.out.println("\nElige un espectáculo (o 0 para regresar):");
                if (opcion == 1) { // Mostrar opciones de obras de teatro
                    System.out.println("1. " + obra1.getTitulo() + " - Duración: " + obra1.getDuracion() + " minutos");
                    System.out.println("2. " + obra2.getTitulo() + " - Duración: " + obra2.getDuracion() + " minutos");
                    System.out.println("3. " + obra3.getTitulo() + " - Duración: " + obra3.getDuracion() + " minutos");
                } else if (opcion == 2) { // Mostrar opciones de conciertos
                    System.out.println("1. " + concierto1.getTitulo() + " - Duración: " + concierto1.getDuracion() + " minutos");
                    System.out.println("2. " + concierto2.getTitulo() + " - Duración: " + concierto2.getDuracion() + " minutos");
                    System.out.println("3. " + concierto3.getTitulo() + " - Duración: " + concierto3.getDuracion() + " minutos");
                } else if (opcion == 3) { // Mostrar opciones de stand-up comedy
                    System.out.println("1. " + standUp1.getTitulo() + " - Duración: " + standUp1.getDuracion() + " minutos");
                    System.out.println("2. " + standUp2.getTitulo() + " - Duración: " + standUp2.getDuracion() + " minutos");
                    System.out.println("3. " + standUp3.getTitulo() + " - Duración: " + standUp3.getDuracion() + " minutos");
                }

                int seleccion = sc.nextInt();

                // Asignar espectáculo y sala según la selección del usuario
                if (opcion == 1) {
                    if (seleccion == 1) {
                        espectaculoElegido = obra1;
                        salaSeleccionada = salaTeatro1;
                    } else if (seleccion == 2) {
                        espectaculoElegido = obra2;
                        salaSeleccionada = salaTeatro2;
                    } else if (seleccion == 3) {
                        espectaculoElegido = obra3;
                        salaSeleccionada = salaTeatro3;
                    }
                } else if (opcion == 2) {
                    if (seleccion == 1) {
                        espectaculoElegido = concierto1;
                        salaSeleccionada = salaConcierto1;
                    } else if (seleccion == 2) {
                        espectaculoElegido = concierto2;
                        salaSeleccionada = salaConcierto2;
                    } else if (seleccion == 3) {
                        espectaculoElegido = concierto3;
                        salaSeleccionada = salaConcierto3;
                    }
                } else if (opcion == 3) {
                    if (seleccion == 1) {
                        espectaculoElegido = standUp1;
                        salaSeleccionada = salaStandUp1;
                    } else if (seleccion == 2) {
                        espectaculoElegido = standUp2;
                        salaSeleccionada = salaStandUp2;
                    } else if (seleccion == 3) {
                        espectaculoElegido = standUp3;
                        salaSeleccionada = salaStandUp3;
                    }
                }

                if (espectaculoElegido != null && salaSeleccionada != null) {
                    break;
                }
            }

            if (espectaculoElegido == null || salaSeleccionada == null) {
                continue;
            }

            // Mostrar detalles del espectáculo seleccionado
            espectaculoElegido.mostrarDetalles();

            System.out.println("Introduce tu nombre:");
            sc.nextLine();
            String nombreEspectador = sc.nextLine();
            Espectador espectador = new Espectador(nombreEspectador, "correo@example.com");

            // Mostrar asientos disponibles
            salaSeleccionada.mostrarDisponibilidad();
            System.out.println("Elige el número de asiento que deseas reservar:");
            int numeroAsiento = sc.nextInt();
            Asiento asientoElegido = salaSeleccionada.getAsiento(numeroAsiento - 1);

            if (asientoElegido != null && salaSeleccionada.reservarAsiento(asientoElegido, espectador)) {
                System.out.println("¡Reserva exitosa! Has reservado el asiento número " + numeroAsiento);
            } else {
                System.out.println("El asiento no está disponible o no es válido.");
            }
        }
        sc.close();
    }
}
