
package Vista;

import Controlador.Conectarse;
import Controlador.Modo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        botondesconectarse = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        botoniniciarsesion = new javax.swing.JMenuItem();
        botondesconectarsesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        botonvisualuno = new javax.swing.JMenuItem();
        botonVisualResumen = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("Conexion");

        botondesconectarse.setText("Conectarse a la base de datos");
        botondesconectarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondesconectarseActionPerformed(evt);
            }
        });
        jMenu3.add(botondesconectarse);

        jMenuItem2.setText("Desconectarse de la base de datos");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Sesion");

        botoniniciarsesion.setText("Iniciar Sesion");
        botoniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoniniciarsesionActionPerformed(evt);
            }
        });
        jMenu1.add(botoniniciarsesion);

        botondesconectarsesion.setText("Desconectarse");
        jMenu1.add(botondesconectarsesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualizar");

        botonvisualuno.setText("Uno a uno");
        botonvisualuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvisualunoActionPerformed(evt);
            }
        });
        jMenu2.add(botonvisualuno);

        botonVisualResumen.setText("Resumen");
        botonVisualResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVisualResumenActionPerformed(evt);
            }
        });
        jMenu2.add(botonVisualResumen);

        jMenuBar1.add(jMenu2);

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
        actualizarPanel(panel);
        
    }//GEN-LAST:event_botoniniciarsesionActionPerformed

    private void botondesconectarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondesconectarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botondesconectarseActionPerformed

    private void botonvisualunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvisualunoActionPerformed
        VisualUnoAUno panel = new VisualUnoAUno();
        actualizarPanel(panel);
    }//GEN-LAST:event_botonvisualunoActionPerformed

    private void botonVisualResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVisualResumenActionPerformed
        VisualResumen panel = new VisualResumen();
        actualizarPanel(panel);
    }//GEN-LAST:event_botonVisualResumenActionPerformed

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
    private javax.swing.JMenuItem botondesconectarse;
    private static javax.swing.JMenuItem botondesconectarsesion;
    private static javax.swing.JMenuItem botoniniciarsesion;
    private javax.swing.JMenuItem botonvisualuno;
    private static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
