/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class testconnection {
     public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library"; // Your DB name
        String user = "root"; // Your username
        String password = "Naveen123"; // Your password

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ MySQL Connected Successfully!");
            con.close();
        } catch (SQLException e) {
            System.out.println("❌ Connection Failed!");
            e.printStackTrace();
        }
    }
}





