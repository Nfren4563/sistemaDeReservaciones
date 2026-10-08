# Sistema de Reservaciones

## Creador

Efren Alejandro Gonzalez  
GitHub: [Nfren4563](https://github.com/Nfren4563)

## Descripción

Este proyecto es un sistema de reservaciones desarrollado en Java.

El programa permite seleccionar diferentes tipos de espectáculos, como obras de teatro, conciertos y shows de comedia. Después de seleccionar un espectáculo, el usuario puede consultar los asientos disponibles y reservar uno.

Este proyecto fue realizado para practicar programación orientada a objetos en Java.

## Funciones principales

- Mostrar diferentes espectáculos.
- Consultar la duración y los detalles de cada espectáculo.
- Mostrar los asientos disponibles.
- Registrar el nombre del espectador.
- Reservar un asiento.
- Evitar que un asiento sea reservado más de una vez.

## Requisitos

- Java JDK 8 o superior.
- Una terminal o un IDE como NetBeans, IntelliJ IDEA o Eclipse.

## Cómo ejecutar el proyecto

Primero descarga el repositorio:

```bash
git clone https://github.com/Nfren4563/sistemaDeReservaciones.git
```

Entra en la carpeta del proyecto:

```bash
cd sistemaDeReservaciones/SistemaDeReservaciones
```

Compila el programa:

```bash
javac -d out src/sistemadereservaciones/*.java
```

Ejecuta el programa:

```bash
java -cp out sistemadereservaciones.main
```

También puedes abrir el proyecto en un IDE y ejecutar el archivo `main.java`.

## Cómo utilizarlo

1. Selecciona un tipo de espectáculo.
2. Elige uno de los espectáculos disponibles.
3. Escribe tu nombre.
4. Consulta los asientos.
5. Selecciona el asiento que deseas reservar.
6. Puedes realizar otra reservación o salir.

## Imágenes

![Menú principal](imagenes/menu-principal.png)

![Selección de asiento](imagenes/seleccion-asiento.png)

## Nota

Las reservaciones solamente se guardan mientras el programa está abierto.

## Estado del proyecto

Proyecto terminado con fines educativos.
