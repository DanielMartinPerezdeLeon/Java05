package Controlador;

import java.sql.*;

public class Conectarse {

    private Connection conn;
    
    
    public Conectarse() {
        //CARGAR DRIVERS
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

        } catch (Exception e) {
            System.out.println("JDBC driver falied to load.");
            return;
        }

        try {

            //CONEXION
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/p05", "p05", "p05");

            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConn() {
        return conn;
    }
    
    
    

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (Exception ignored) {
        }
    }

    public static void close(Statement stmt) {
        try {
            stmt.close();
        } catch (Exception ignored) {
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (Exception ignored) {
        }
    }
}
