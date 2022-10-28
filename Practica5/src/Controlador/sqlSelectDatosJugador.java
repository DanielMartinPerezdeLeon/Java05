
package Controlador;

import Modelo.Jugador;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class sqlSelectDatosJugador {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rset = null;

    public ResultSet crear() {
        try {
            conn = Conectarse.getConect().getConn();

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            // Selecciona todos los jugadores y los ordena por el ID
            String sql = "SELECT * FROM jugador "
                    + "WHERE codigo = " + Jugador.getUsuario().getCodigoJug()
                    + " ORDER BY codigo";
            rset = stmt.executeQuery(sql);
            rset.first();

        } catch (SQLException e) {
            System.err.println("Error de SQL");
        } finally {

            return rset;
        }
    }

    public ResultSet siguiente() {
        try {
            rset.next();
        } catch (SQLException ex) {
            Logger.getLogger(sqlSelectDatosJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }

    public ResultSet anterior() {
        try {
            rset.previous();
        } catch (SQLException ex) {
            Logger.getLogger(sqlSelectDatosJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }
}
