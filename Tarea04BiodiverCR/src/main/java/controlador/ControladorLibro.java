/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.GUI_Menu;
import vista.GUI_Portada;

/**
 *
 * @author jimer
 */
public class ControladorLibro {

    public void abrirMenu(GUI_Portada portada) {
        GUI_Menu menu = new GUI_Menu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        portada.dispose();

    }

    public void salir() {
        System.exit(0);
    }
}
