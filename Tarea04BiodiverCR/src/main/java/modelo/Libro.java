/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author jimer
 */
public class Libro {

    private ArrayList<Pagina> paginas;

    public Libro() {
        paginas = new ArrayList<Pagina>();
    }

    public void agregarPagina(Pagina pagina) {
        paginas.add(pagina);
    }

    public Pagina obtenerPagina(int posicion) {
        if (posicion >= 0 && posicion < paginas.size()) {
            return paginas.get(posicion);
        } else {
            return null;
        }
    }

    public int cantidadPaginas() {
        return paginas.size();
    }

    public String mostrarTodasLasPaginas() {
        String texto = "";

        for (int i = 0; i < paginas.size(); i++) {
            texto += paginas.get(i).mostrarContenido() + "\n\n";
        }

        return texto;
    }

}
