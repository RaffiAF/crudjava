/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raffi
 */
public class Koneksi {
    private  static Connection conn;
    
    public static Connection getConnection(){
        if (conn==null) {
            try {
                String url = "jdbc:mysql://localhost:3306/tubes_pbo";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection)DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conn;
    }
}
