/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cuestionario;
import modelo.Libro;
import modelo.Pagina;
import modelo.PaginaActividad;
import modelo.PaginaInformativa;
import vista.GUI_Actividad;
import vista.GUI_Menu;
import vista.GUI_Portada;
import vista.GUI_Libro;
import vista.GUI_Resultados;

/**
 *
 * @author jimer
 */
public class ControladorLibro {

    private Libro libro = new Libro();
    private Cuestionario cuestionario = new Cuestionario();

    public void cargarPaginas() {

        if (libro.cantidadPaginas() > 0) {
            return;
        }

        PaginaInformativa pagina1 = new PaginaInformativa(
                "Ecosistemas",
                "Ecosistemas de Costa Rica",
                1,
                "Costa Rica posee una gran variedad de ecosistemas, "
                + "como bosques tropicales, bosques nubosos y manglares. "
                + "Estos espacios albergan numerosas especies de plantas "
                + "y animales y son importantes para la biodiversidad."
        );

        PaginaInformativa pagina2 = new PaginaInformativa(
                "Flora",
                "Flora de Costa Rica",
                2,
                "Costa Rica cuenta con una gran diversidad de plantas, "
                + "entre ellas orquideas, helechos y arboles tropicales. "
                + "La flora es fundamental porque proporciona alimento "
                + "y refugio a muchas especies de animales."
        );

        PaginaInformativa pagina3 = new PaginaInformativa(
                "Fauna",
                "Fauna de Costa Rica",
                3,
                "En Costa Rica habitan animales como el tucan, "
                + "el oso perezoso, el jaguar y diferentes especies "
                + "de monos. La conservacion de sus habitats es "
                + "importante para proteger estas especies."
        );

        PaginaActividad actividad = new PaginaActividad(
                "¿Cual de estos animales habita en Costa Rica?",
                "Actividad de biodiversidad",
                4,
                "Responda las tres preguntas sobre biodiversidad."
        );

        libro.agregarPagina(pagina1);
        libro.agregarPagina(pagina2);
        libro.agregarPagina(pagina3);
        libro.agregarPagina(actividad);
    }

    public Libro getLibro() {
        return libro;
    }

    public Pagina obtenerPagina(int posicion) {
        return libro.obtenerPagina(posicion);
    }

    public void abrirMenu(GUI_Portada portada) {
        cargarPaginas();

        GUI_Menu menu = new GUI_Menu(this);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        portada.dispose();
    }

    public void abrirLibro(GUI_Menu menu) {
        GUI_Libro ventanaLibro = new GUI_Libro(this);

        ventanaLibro.setLocationRelativeTo(null);
        ventanaLibro.setVisible(true);

        menu.dispose();
    }

    public void volverMenu(GUI_Libro ventanaLibro) {
        GUI_Menu menu = new GUI_Menu(this);

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        ventanaLibro.dispose();
    }

    public String obtenerPregunta(int numero) {
        return cuestionario.obtenerPregunta(numero);
    }

    public String obtenerOpcion(int pregunta, int opcion) {
        return cuestionario.obtenerOpcion(pregunta, opcion);
    }

    public void guardarRespuesta(int pregunta, int respuesta) {
        cuestionario.guardarRespuesta(pregunta, respuesta);
    }

    public void guardarIntento() {
        cuestionario.guardarIntento();
    }

    public int calcularPuntaje() {
        return cuestionario.calcularPuntaje();
    }

    public void abrirActividad(GUI_Menu menu) {

        if (cuestionario.getCantidadIntentos() < 3) {
            reiniciarRespuestas();
            GUI_Actividad actividad = new GUI_Actividad(this);

            actividad.setLocationRelativeTo(null);
            actividad.setVisible(true);

            menu.dispose();

        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    menu, "Ya realizó los 3 intentos permitidos."
            );
        }
    }

    public void volverMenuActividad(GUI_Actividad actividad) {
        GUI_Menu menu = new GUI_Menu(this);

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        actividad.dispose();
    }

    public int obtenerCantidadIntentos() {
        return cuestionario.getCantidadIntentos();
    }

    public void reiniciarRespuestas() {
        cuestionario.reiniciarRespuestas();
    }

    public int obtenerPuntajeIntento(int intento) {
        return cuestionario.obtenerPuntajeIntento(intento);
    }

    public void abrirResultados(GUI_Menu menu) {

        GUI_Resultados resultados = new GUI_Resultados(this);

        resultados.setLocationRelativeTo(null);
        resultados.setVisible(true);

        menu.dispose();
    }

    public void volverMenuResultados(GUI_Resultados resultados) {

        GUI_Menu menu = new GUI_Menu(this);

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        resultados.dispose();
    }

    public void salir() {
        System.exit(0);
    }

}
