/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcoban2trongnghia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class DSsinhvienDao {
    dssinhVien dssinhvien;
    
      public List<dssinhVien> getALLsinhvien() throws SQLException{
        List<dssinhVien> sv= new ArrayList<dssinhVien>();
        Connection connection=JDBCConnection.getJDBCConnection();
        String sql="SELECT * FROM sinhvien ";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                dssinhVien user=new dssinhVien();
                user.setMasv(rs.getInt("masv"));
                user.setTensv(rs.getString("Tensv"));
                user.setLop(rs.getString("lop"));
                              
                sv.add(user);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return sv;
        }
      public void addsinhvien(dssinhVien user) throws SQLException{
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="INSERT INTO sinhvien( Tensv,lop)"
                + "values(?,? )";
        
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, user.getTensv());
            preparedStatement.setString(2, user.getLop());
          
           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    }
        public void Deletedssinhvien(int id) throws SQLException{
         Connection connection = JDBCConnection.getJDBCConnection();
         String sql="delete from sinhvien where masv = ? ";
         try {
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1, id);
             int rs=preparedStatement.executeUpdate();
             System.out.println(rs);
         }catch (SQLException e){
                e.printStackTrace();
        }
    }
        public dssinhVien getmasv(int masv) throws SQLException{
            Connection connection = JDBCConnection.getJDBCConnection();
             String sql="SELECT * FROM sinhvien where masv = ?";
             try{
             PreparedStatement preparedStatement=connection.prepareStatement(sql);
             preparedStatement.setInt(1, masv);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                dssinhVien user=new dssinhVien();
                user.setMasv(rs.getInt("masv"));
                user.setTensv(rs.getString("Tensv"));
                user.setLop(rs.getString("lop"));
                              
                return user;
            }
             }catch (SQLException e){
                e.printStackTrace();
            }
        return null;
        
        }
        
         public void updatesinhvien(dssinhVien user) throws SQLException{
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="Update sinhvien set Tensv = ?,Lop = ? Where masv = ?";
        
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, user.getTensv());
            preparedStatement.setString(2, user.getLop());
          preparedStatement.setInt(3, user.getMasv());
           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    }
        
}
