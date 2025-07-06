//Conexion a la base de datos SQL 
package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
  public static final String URL ="jdbc:mysql://localhost:3306/gestion_mar";
    public static final String USER ="root";
    public static final String PASS = "12345678";
    
    public static Connection conectar(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion establecida");
        }catch (SQLException e){
            System.out.println("Error en la conexion" + e.getMessage());
        }
    return conexion;
    }
  
}
