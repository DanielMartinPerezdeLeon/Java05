/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.sql.*;
/**
 *
 * @author Daniel Martin
 */
public class CrearTablas {



  public static void main (String args[]) {
      
      //CARGAR DRIVERS
    try {
      Class.forName("org.apache.derby.jdbc.ClientDriver");

    }
    catch (Exception e) {
        System.out.println("JDBC driver falied to load.");
        return;
    }

    try {
        
    //CONEXION

      Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/p05","p05","p05");

      System.out.println("Conectado");
      
      
      
      //CREA TABLA JUGADOR

      Statement stmt = con.createStatement();
      String tablajugador= "create table jugador("
              + " codigo varchar(10) not null primary key,"
              + " nombre varchar(20),"
              + " apellido varchar(40),"
              + " beneficioTotal numeric,"
              + " contraseña varchar(20)"
              + ")";
     
      stmt.execute(tablajugador);
        System.out.println("Tabla jugador creada");
        
        

        //CREA TABLA TROFEO

      String tablatrofeo= "create table trofeo("
              + " identificador numeric(3) not null primary key,"
              + " nombre varchar(20),"
              + " importe numeric,"
              + " jugadorPropietario varchar(10)"
              + ")";
     
      stmt.execute(tablatrofeo);
      System.out.println("Tabla trofeo creada");  
      
      
    stmt = con.createStatement();   
    String creafk= ("alter table trofeo add constraint FKtrofeo foreign key (jugadorPropietario) references jugador(dni)");
    
    stmt.execute(creafk);
    System.out.println("FK creada");
        
        
      stmt.close();
      con.close();

    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
    
}
