/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author jimer
 */
public class PaginaActividad extends Pagina {

    private String pregunta;

    public PaginaActividad(String pregunta, String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
        this.pregunta = pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String mostrarContenido() {
      JOptionPane.showMessageDialog(null, "Página de Actividad: "
                + "\nTítulo: " + getTitulo()
                + "\nNúmero: " + getNumeroPagina()
                + "\nInstrucciones: " + getContenido()
                + "\nPregunta: " + pregunta);
        return null;
    }

}
