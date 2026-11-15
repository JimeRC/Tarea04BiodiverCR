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
public class PaginaInformativa extends Pagina {

    private String tema;

    public PaginaInformativa(String tema, String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String mostrarContenido() {
        JOptionPane.showMessageDialog(null, "Información de la página: "
                + "\nTítulo: " + getTitulo()
                + "\nNúmero: " + getNumeroPagina()
                + "\nTema: " + tema
                + "\nContenido: " + getContenido());
        return null;
    }

}
