/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jimer
 */
public class Cuestionario {

    private int[] respuestasCorrectas = {0, 1, 2};

    private int[] respuestasUsuario = {-1, -1, -1};
    private int[][] historial = new int[3][3];
    private int cantidadIntentos = 0;

    private String[] preguntas = {
        "¿Cuál de estos animales habita en Costa Rica?",
        "¿Cuál de estos ecosistemas existe en Costa Rica?",
        "¿Por qué es importante proteger la biodiversidad?"
    };

    private String[][] opciones = {
        {"Oso perezoso", "Oso polar", "Pingüino emperador"},
        {"Desierto del Sahara", "Bosque nuboso", "Tundra ártica"},
        {"Para destruir los bosques", "Para aumentar la contaminación",
            "Para conservar las especies y sus hábitats"}
    };

    public String obtenerPregunta(int numero) {
        return preguntas[numero];
    }

    public String obtenerOpcion(int numeroPregunta, int numeroOpcion) {
        return opciones[numeroPregunta][numeroOpcion];
    }

    public void guardarRespuesta(int pregunta, int respuesta) {
        if (pregunta >= 0 && pregunta < 3
                && respuesta >= 0 && respuesta < 3) {

            respuestasUsuario[pregunta] = respuesta;

        }
    }

    public void guardarIntento() {
        if (cantidadIntentos < 3) {
            for (int i = 0; i < 3; i++) {
                historial[cantidadIntentos][i] = respuestasUsuario[i];
            }
            cantidadIntentos++;
        }
    }

    public int calcularPuntaje() {
        int puntos = 0;

        for (int i = 0; i < 3; i++) {
            if (respuestasUsuario[i] == respuestasCorrectas[i]) {
                puntos++;
            }
        }

        return puntos;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void reiniciarRespuestas() {

        for (int i = 0; i < 3; i++) {
            respuestasUsuario[i] = -1;
        }
    }

    public int obtenerPuntajeIntento(int intento) {
        if (intento < 0 || intento >= cantidadIntentos) {
            return 0;
        }
        int puntos = 0;

        if (intento >= 0 && intento < cantidadIntentos) {
            for (int i = 0; i < 3; i++) {
                if (historial[intento][i] == respuestasCorrectas[i]) {
                    puntos++;
                }
            }
        }

        return puntos;
    }

}
