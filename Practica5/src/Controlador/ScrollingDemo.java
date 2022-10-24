/* Acesso a la base de datos:
   - Con recorrido aleatorio o ResultSet arrastable (ResultSet.TYPE_SCROLL_INSENSITIVE 
                                                     y ResultSet.TYPE_SCROLL_SENSITIVE)
   - Con Statemen de s�lo lectura -> createStatement() (sin p�rametros. Opciones por defecto.
   - Actualizaciones, Borrados, e inserciones directas a la BDs y no al ResulSet.
 */
package Controlador;

import Controlador.Conectarse;
import Modelo.Jugador;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScrollingDemo {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rset = null;

    public void conexionTrofeosVisual(Jugador j) {

        try {
            conn = Conectarse.getConect().getConn();

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            // Selecciona todos los trofeos y los ordena por el ID
            String sql = "SELECT * FROM trofeo "
                    + "WHERE jugadorPropietario = " + j.getCodigoJug()
                    + " ORDER BY identificador";
            rset = stmt.executeQuery(sql);

            if (rset.next()) {
                rset.beforeFirst();
                boolean done = false;
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

                while (!done) {
                    System.out.println("\nOpciones: F (first), N (next), P (previous), "
                            + "L (last), Q (quit) : ");
                    String s = in.readLine();
                    boolean result = false;

                    result = rset.first();

                    //OJO!!
                    if (s.equalsIgnoreCase("F")) {
                        result = rset.first();
                    } else if (s.equalsIgnoreCase("N")) {
                        result = rset.next();
                    } else if (s.equalsIgnoreCase("P")) {
                        result = rset.previous();
                    } else if (s.equalsIgnoreCase("L")) {
                        result = rset.last();
                    } else if (s.equalsIgnoreCase("Q")) {
                        done = true;
                    }
                    if (done) {
                        break;
                    }
                    if (result) {
                        System.out.println("CURSOR movido a la fila " + rset.getRow());
                        System.out.println("NUMERO: " + rset.getInt(1)
                                + ", NOMBRE: " + rset.getString(2)
                                + ", APELLIDO: " + rset.getString(3)
                                + ", FOTO: " + rset.getString(4)
                                + ", SUELDO: " + rset.getFloat(5)
                                + ", SUELDO-MAXIMO: " + rset.getFloat(6)
                                + ", FECHA-ALTA: " + rset.getDate(7)
                        );

                    } else {
                        System.out.println("NO se puede mover el cursor");
                    }
                }
                in.close();
            } else {
                System.out.println("ResultSet sin filas");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conectarse.close(rset);
            Conectarse.close(stmt);
            // Conectarse.close(conn);
        }
    }

    public ResultSet siguiente() {
        try {
            rset.next();

        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }
    
    public ResultSet anterior() {
        try {
            rset.last();

        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }

}
