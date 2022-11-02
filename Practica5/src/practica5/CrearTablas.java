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
              + " codigo numeric(3) not null primary key,"
              + " nombre varchar(20),"
              + " apellido varchar(40),"
              + " beneficioTotal numeric,"
              + " contraseña varchar(20),"
              + " imagen varchar(40)"
              + ")";
     
      stmt.execute(tablajugador);
        System.out.println("Tabla jugador creada");
        
        

        //CREA TABLA TROFEOjdbc:derby://localhost:1527/p05 [p05 on P05]

      String tablatrofeo= "create table trofeo("
              + " identificador numeric(3) not null primary key,"
              + " nombre varchar(20),"
              + " importe numeric,"
              + " jugadorPropietario numeric(3),"
              + " fecha date"
              + ")";
     
      stmt.execute(tablatrofeo);
      System.out.println("Tabla trofeo creada");  
      
      
    stmt = con.createStatement();   
    String creafk= ("alter table trofeo add constraint FKtrofeo foreign key (jugadorPropietario) references jugador(codigo)");
    
    stmt.execute(creafk);
    System.out.println("FK creada");
        
    
    
    
    String insert=    "INSERT INTO jugador VALUES (100,'Manuel','Perez',0,'100','1001')";
    stmt.execute(insert);
    
    insert=    "INSERT INTO jugador VALUES (101,'Antonio','Castillo',0,'101','1002')";
    stmt.execute(insert);
        
    insert=    "INSERT INTO trofeo VALUES (100,'supercopa',200,100,'5/12/2001')";
    stmt.execute(insert);
    
    insert=    "INSERT INTO trofeo VALUES (101,'ultracopa',150,100,'7/10/2020')";
    stmt.execute(insert);
    
      stmt.close();
      con.close();

    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
    
}
