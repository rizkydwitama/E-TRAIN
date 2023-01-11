/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
/**
 *
 * @author LEGION
 */
public class Koneksi {
    Connection koneksi;
    
    public Koneksi() throws SQLException{
        try{
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/e-train";
            String username = "root";
            String password = "";
            System.setProperty(driver, "");
            koneksi = DriverManager.getConnection(url, username, password);
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getKoneksi() {
        return koneksi;
    }

    public void setKoneksi(Connection koneksi) {
        this.koneksi = koneksi;
    }
}
