
package Reastaurent_s;

import java.sql.Connection;
import java.sql.DriverManager;

 
public class JavaDbCon {
    
    
  public static   Connection javadb(){
    try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/Restaurent";
            String username = "root";
            String password = "";
            Class.forName(driver); 
             Connection conn =  DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            System.out.println("javadatabaseconnect.JavaDatabaseConnect.getConnection()");
        }
        
    
        return null;
}}
