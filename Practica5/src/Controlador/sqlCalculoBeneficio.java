/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class sqlCalculoBeneficio {

    public static void ActualizarUsuario(int usuario) {
        Statement stmt;
        ResultSet datossql;

        try {
            stmt = Conectarse.getConect().getConn().createStatement();

            String sql = "SELECT sum(importe) FROM trofeo "
                    + "WHERE jugadorPropietario = " + usuario;
            
            stmt.execute(sql);

            String actualizar = "update jugador "
                    + "set beneficioTotal = (" + sql
                    + ") where codigo = " + usuario;

            stmt.executeUpdate(actualizar);

            System.out.println("Beneficio Calculado");
        } catch (SQLException ex) {
            Logger.getLogger(sqlCalculoBeneficio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
