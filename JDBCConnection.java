/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcoban2trongnghia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class JDBCConnection {
    public static Connection getJDBCConnection() {
        Connection con = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            String dbUrl = "jdbc:jtds:sqlserver://DESKTOP-A8J0MGG:1433/DSsinhvien;instance=SQLEXPRESS;";
            String user="sa";
            String password="12345";
            con = DriverManager.getConnection(dbUrl,user,password);
            if(con!=null)
                System.out.println("Kết nối thành công!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
