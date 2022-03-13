/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcoban2trongnghia;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dell
 */
public class DSsinhvienservice {
    private DSsinhvienDao dssviendao;

    public DSsinhvienservice() {
        dssviendao=new DSsinhvienDao();
    }
    
    public List<dssinhVien> getALLsinhvien() throws SQLException{
        return dssviendao.getALLsinhvien();
    }
     public void addsinhvien(dssinhVien user) throws SQLException{
    dssviendao.addsinhvien(user);
    } 
      public void xoadulieu(int id) throws SQLException{
    dssviendao.Deletedssinhvien(id);
    }
    public void updatesinhvien(dssinhVien user) throws SQLException{
    dssviendao.updatesinhvien(user);
    }
    public dssinhVien getmasv(int masv) throws SQLException{
        return dssviendao.getmasv(masv);
    }

    
}
