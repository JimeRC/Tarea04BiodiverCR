# Tarea04BiodiverCR
# BiodiverCR 

## Descripción del proyecto

BiodiverCR es un minilibro interactivo sobre la biodiversidad de Costa Rica, desarrollado en Java como parte de la Tarea 4 del curso Fundamentos de Programación.

La idea de este proyecto es que las personas puedan aprender un poco más sobre la naturaleza de nuestro país de una manera sencilla e interactiva.

El libro cuenta con tres páginas informativas en las que se explican temas relacionados con los ecosistemas, la flora y la fauna de Costa Rica. También incluye una pequeña actividad de preguntas para poner en práctica lo aprendido durante la lectura.

## ¿Qué se puede hacer en el programa?

- Leer las tres páginas informativas del libro.
- Avanzar y retroceder entre las páginas.
- Realizar una actividad de tres preguntas de selección única.
- Responder la actividad hasta un máximo de tres veces.
- Consultar los resultados de los intentos realizados.
- Regresar al menú principal o salir del programa.

## Herramientas utilizadas

Para desarrollar este proyecto se utilizaron:

- Java como lenguaje de programación.
- Apache NetBeans IDE 26.
- Maven para la organización del proyecto.
- Java Swing para crear las ventanas y los botones.

## Organización del código

El programa está organizado utilizando el patrón Modelo-Vista-Controlador (MVC), que permite separar las diferentes partes del código según su función.

**Modelo:** contiene las clases `Pagina`, `PaginaInformativa`, `PaginaActividad`, `Libro` y `Cuestionario`. Estas se encargan de almacenar la información del libro, las preguntas y los resultados.

**Vista:** contiene las ventanas que puede utilizar el usuario, como la portada, el menú principal, las páginas del libro, la actividad y los resultados.

**Controlador:** contiene la clase `ControladorLibro`, que permite comunicar las ventanas con las demás clases y controlar las acciones del programa.

**Principal:** contiene la clase `Main`, que se encarga de iniciar la aplicación.

## ¿Cómo ejecutar el programa?

1. Descargar el proyecto desde este repositorio de GitHub.
2. Abrir Apache NetBeans.
3. Abrir el proyecto BiodiverCR.
4. Ejecutar la clase `Main`, que se encuentra en el paquete `principal`.
5. Una vez que aparezca la portada, presionar el botón "Empezar" para acceder al menú principal.

Desde el menú se puede elegir entre leer el libro, realizar la actividad o consultar los resultados.

## Sobre el proyecto

Este minilibro se realizó con el propósito de poner en práctica los conocimientos aprendidos durante el curso, principalmente el uso de clases, herencia, arreglos, ArrayList, interfaces gráficas y la organización del programa mediante MVC.

Autora: Jimena Rodriguez C.
