
package com.mycompany.evidencia_adso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Evidencia_adso {
 public static void main(String[] args) {
       String usuario="root";
       String password="";
       String url="jdbc:mysql://localhost:3306/jdbc_test";
       Connection conexion;
        Statement statemen;
        ResultSet rs;
        
        
        try {
            conexion= DriverManager.getConnection(url, usuario, password);
            statemen=conexion.createStatement();
            rs=statemen.executeQuery("SELECT * FROM usuarios");
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
            //Insertar Datos
            statemen.execute("INSERT INTO `usuarios` (`id`, `nombre`) VALUES (NULL, 'manuel');");
             System.out.println("");
             rs=statemen.executeQuery("SELECT * FROM usuarios");
                while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
               //Actualizacion Datos
          statemen.execute("UPDATE `usuarios` SET `nombre` = 'juanita' WHERE `usuarios`.`id` = 16;");
            System.out.println("");
            rs=statemen.executeQuery("SELECT * FROM usuarios");
                while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
                   //ELiminar datos
           statemen.execute(" DELETE FROM usuarios WHERE `usuarios`.`id` = 16");
            System.out.println("");
            rs=statemen.executeQuery("SELECT * FROM usuarios");
                while(rs.next()){
                System.out.println(rs.getString("nombre"));
            } 
            
            
      
                
         
        
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Evidencia_adso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}




