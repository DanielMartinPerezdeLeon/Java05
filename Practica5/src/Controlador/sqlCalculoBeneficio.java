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
 
        try {
           
            Connection conn = Conectarse.getConect().getConn();

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

      
            String sql =" SELECT sum(importe) FROM trofeo "
                    + "WHERE jugadorPropietario = " + usuario;
            
            ResultSet rset = stmt.executeQuery(sql);
            
            rset.first();
            int rs = rset.getInt(1);
            


            String actualizar = "update jugador "
                    + "set beneficioTotal = (" + rs
                    + ") where codigo = " + usuario;
            

            stmt.executeUpdate(actualizar);

            System.out.println("Beneficio Calculado");
        } catch (SQLException ex) {
            Logger.getLogger(sqlCalculoBeneficio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
