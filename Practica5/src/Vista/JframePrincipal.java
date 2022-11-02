
package Vista;

import Controlador.Conectarse;

/**
 *
 * @author alumno
 */

public class JframePrincipal extends javax.swing.JFrame {


    public JframePrincipal() {
        initComponents();

        botondesconectarsesion.setEnabled(true);
        botoniniciarsesion.setEnabled(true);

    }

    public void actualizarPanel(javax.swing.JPanel panel) {
        this.setContentPane(panel);
        pack();
    }

    public static void cambiarBotones() {
        if (botondesconectarsesion.isEnabled() == false) {
            botondesconectarsesion.setEnabled(true);
            botoniniciarsesion.setEnabled(false);
        } else {
            botondesconectarsesion.setEnabled(false);
            botoniniciarsesion.setEnabled(true);
        }
    } 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        botoniniciarsesion = new javax.swing.JMenuItem();
        botondesconectarsesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        botonvisualuno = new javax.swing.JMenuItem();
        botonVisualResumen = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Conectarse");

        botoniniciarsesion.setText("Conectarse/iniciar sesion");
        botoniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoniniciarsesionActionPerformed(evt);
            }
        });
        jMenu1.add(botoniniciarsesion);

        botondesconectarsesion.setText("Desconectarse");
        botondesconectarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondesconectarsesionActionPerformed(evt);
            }
        });
        jMenu1.add(botondesconectarsesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualizar");

        botonvisualuno.setText("Trofeos");
        botonvisualuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvisualunoActionPerformed(evt);
            }
        });
        jMenu2.add(botonvisualuno);

        botonVisualResumen.setText("Resumen Jugador");
        botonVisualResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVisualResumenActionPerformed(evt);
            }
        });
        jMenu2.add(botonVisualResumen);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca de");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoniniciarsesionActionPerformed
        IniciarSesionPanel panel = new IniciarSesionPanel();
        Conectarse.CrearConexion();
        actualizarPanel(panel);
        
    }//GEN-LAST:event_botoniniciarsesionActionPerformed

    private void botonvisualunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvisualunoActionPerformed
        VisualUnoAUno panel = new VisualUnoAUno();
        actualizarPanel(panel);
    }//GEN-LAST:event_botonvisualunoActionPerformed

    private void botondesconectarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondesconectarsesionActionPerformed
        Conectarse.getConect().close();
    }//GEN-LAST:event_botondesconectarsesionActionPerformed

    private void botonVisualResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVisualResumenActionPerformed
        VisualResumen panel = new VisualResumen();
        actualizarPanel(panel);
    }//GEN-LAST:event_botonVisualResumenActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        String[] ar = null;
        Modal.main(ar);
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botonVisualResumen;
    private static javax.swing.JMenuItem botondesconectarsesion;
    private static javax.swing.JMenuItem botoniniciarsesion;
    private javax.swing.JMenuItem botonvisualuno;
    private static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
