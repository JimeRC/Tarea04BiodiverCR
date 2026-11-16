/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import controlador.ControladorLibro;

/**
 *
 * @author jimer
 */
public class GUI_Actividad extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI_Actividad.class.getName());

    /**
     * Creates new form GUI_Actividad
     */
    private ControladorLibro controlador;
    private int preguntaActual = 0;

    public GUI_Actividad() {
        initComponents();
    }

    public GUI_Actividad(ControladorLibro controlador) {
        initComponents();
        this.controlador = controlador;

        mostrarPregunta();
    }

    private void mostrarPregunta() {

        lbl_NumeroPregunta.setText("Pregunta " + (preguntaActual + 1) + " de 3");

        lbl_Pregunta.setText(controlador.obtenerPregunta(preguntaActual));

        rbtn_OpcionA.setText(controlador.obtenerOpcion(preguntaActual, 0));
        rbtn_OpcionB.setText(controlador.obtenerOpcion(preguntaActual, 1));
        rbtn_OpcionC.setText(controlador.obtenerOpcion(preguntaActual, 2));

        rbtn_OpcionA.setSelected(false);
        rbtn_OpcionB.setSelected(false);
        rbtn_OpcionC.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        lbl_Descripción = new javax.swing.JLabel();
        lbl_Pregunta = new javax.swing.JLabel();
        rbtn_OpcionA = new javax.swing.JRadioButton();
        rbtn_OpcionB = new javax.swing.JRadioButton();
        rbtn_OpcionC = new javax.swing.JRadioButton();
        btn_Responder = new javax.swing.JButton();
        btn_VolverMenu = new javax.swing.JButton();
        lbl_NumeroPregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        lbl_Titulo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(0, 102, 0));
        lbl_Titulo.setText("BiodiverCR");

        lbl_Descripción.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_Descripción.setForeground(new java.awt.Color(0, 102, 0));
        lbl_Descripción.setText("Actividad interactiva");

        lbl_Pregunta.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        lbl_Pregunta.setForeground(new java.awt.Color(0, 102, 0));
        lbl_Pregunta.setText("¿Cuál de estos animales habitan en Costa Rica?");

        rbtn_OpcionA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtn_OpcionA.setForeground(new java.awt.Color(0, 102, 0));
        rbtn_OpcionA.setText("A. Oso perezoso");
        rbtn_OpcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_OpcionAActionPerformed(evt);
            }
        });

        rbtn_OpcionB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtn_OpcionB.setForeground(new java.awt.Color(0, 102, 0));
        rbtn_OpcionB.setText("B. Oso polar");
        rbtn_OpcionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_OpcionBActionPerformed(evt);
            }
        });

        rbtn_OpcionC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtn_OpcionC.setForeground(new java.awt.Color(0, 102, 0));
        rbtn_OpcionC.setText("C. Pingüino");
        rbtn_OpcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_OpcionCActionPerformed(evt);
            }
        });

        btn_Responder.setBackground(new java.awt.Color(0, 102, 0));
        btn_Responder.setForeground(new java.awt.Color(255, 255, 255));
        btn_Responder.setText("Responder");
        btn_Responder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResponderActionPerformed(evt);
            }
        });

        btn_VolverMenu.setBackground(new java.awt.Color(0, 102, 0));
        btn_VolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        btn_VolverMenu.setText("Volver al menú");
        btn_VolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverMenuActionPerformed(evt);
            }
        });

        lbl_NumeroPregunta.setForeground(new java.awt.Color(0, 102, 0));
        lbl_NumeroPregunta.setText("Pregunta 1 de 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_VolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Responder, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_NumeroPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(rbtn_OpcionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Descripción)
                            .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtn_OpcionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtn_OpcionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Descripción)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_NumeroPregunta)
                .addGap(4, 4, 4)
                .addComponent(lbl_Pregunta)
                .addGap(24, 24, 24)
                .addComponent(rbtn_OpcionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_OpcionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_OpcionC)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_VolverMenu)
                    .addComponent(btn_Responder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_OpcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_OpcionCActionPerformed
        if (rbtn_OpcionC.isSelected()) {
            rbtn_OpcionA.setSelected(false);
            rbtn_OpcionB.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_OpcionCActionPerformed

    private void btn_ResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResponderActionPerformed
        int respuesta = -1;

        if (rbtn_OpcionA.isSelected()) {
            respuesta = 0;
        } else if (rbtn_OpcionB.isSelected()) {
            respuesta = 1;
        } else if (rbtn_OpcionC.isSelected()) {
            respuesta = 2;
        }

        if (respuesta == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una respuesta");
        } else {
            controlador.guardarRespuesta(preguntaActual, respuesta);

            preguntaActual++;

            if (preguntaActual < 3) {
                mostrarPregunta();
            } else {
                controlador.guardarIntento();
                JOptionPane.showMessageDialog(this,
                        "Obtuvo " + controlador.calcularPuntaje() + " de 3 puntos");

                btn_Responder.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_ResponderActionPerformed

    private void rbtn_OpcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_OpcionAActionPerformed
        if (rbtn_OpcionA.isSelected()) {
            rbtn_OpcionB.setSelected(false);
            rbtn_OpcionC.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_OpcionAActionPerformed

    private void rbtn_OpcionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_OpcionBActionPerformed
        if (rbtn_OpcionB.isSelected()) {
            rbtn_OpcionA.setSelected(false);
            rbtn_OpcionC.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_OpcionBActionPerformed

    private void btn_VolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverMenuActionPerformed
       controlador.volverMenuActividad(this);
    }//GEN-LAST:event_btn_VolverMenuActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Responder;
    private javax.swing.JButton btn_VolverMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Descripción;
    private javax.swing.JLabel lbl_NumeroPregunta;
    private javax.swing.JLabel lbl_Pregunta;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JRadioButton rbtn_OpcionA;
    private javax.swing.JRadioButton rbtn_OpcionB;
    private javax.swing.JRadioButton rbtn_OpcionC;
    // End of variables declaration//GEN-END:variables

}
