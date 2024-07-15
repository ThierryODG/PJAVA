/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 
 */
public class connexionbd {
   private static Connection con=null; 
   public static Connection seconnecter() throws ClassNotFoundException, SQLException{
   //charger pilote
   Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/colis","root","");
   return con;
   }
}

