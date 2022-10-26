/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class sqlActualizarTrofeo {
    
    public static void ActualizarTrofeo(int trofeo, int nuevoimporte, String nuevafecha){
        Statement stmt;
        

        try {
            stmt = Conectarse.getConect().getConn().createStatement();
            
            String actualizar= "update trofeo "
                    + "set importe = " + nuevoimporte + ", fecha = " + "'"+ nuevafecha+ "'" 
                    + " where identificador = " + trofeo;
              
     
            stmt.executeUpdate(actualizar);
            
        System.out.println("trofeo Actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(sqlActualizarTrofeo.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    
}
