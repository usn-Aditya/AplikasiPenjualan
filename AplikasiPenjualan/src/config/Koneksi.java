package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection mysqlconfig;
    
    public static Connection configDB() {
        try {
            // URL database, pastikan XAMPP (Apache & MySQL) kamu sudah menyala
            String url = "jdbc:mysql://localhost:3306/db_penjualan"; 
            String user = "root"; 
            String pass = "";     
            
            // Menggunakan pemanggilan driver yang lebih universal dan aman dari error library
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi database gagal: " + e.getMessage());
        }
        return mysqlconfig;
    }
}