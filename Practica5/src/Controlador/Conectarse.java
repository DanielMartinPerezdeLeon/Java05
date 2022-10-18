package Controlador;

import java.sql.*;

public class Conectarse {

  public Conectarse() {
    try {
      Class.forName("org.apache.derby.jdbc.ClientDriver");	
    } catch (ClassNotFoundException e) {
      System.out.println("ERROR: Error al cargar los drivers");
    } 
  }

  public static Connection getConnection() throws SQLException {
    String url = "jdbc:derby://localhost:1527/p05";
	return DriverManager.getConnection(url,"p05","p05");
  } 

  public static void close(ResultSet rs) {
    try {
      rs.close();
    } catch (Exception ignored) {}
  } 

  public static void close(Statement stmt) {
    try {
      stmt.close();
    } catch (Exception ignored) {}
  } 

  public static void close(Connection conn) {
    try {
      conn.close();
    } catch (Exception ignored) {}
  } 
}