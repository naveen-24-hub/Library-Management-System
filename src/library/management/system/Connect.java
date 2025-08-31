/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Connect {

    public static Connection Connection() {
         Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Naveen123");

        } catch (SQLException ex) {
            System.getLogger(Connect.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return con;
    }

}
