/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.san_pham;

/**
 *
 * @author Admin
 */
public class san_phamDAO {
    ConnectDB cn = new ConnectDB();
    
    public List<san_pham> getAllSanpham() throws SQLException{
    List<san_pham> list = new ArrayList<>();
    Connection con;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    con = cn.getConnect();
    try {
    pstmt = con.prepareStatement("SELECT * FROM `san_pham`");
    rs = pstmt.executeQuery();
    while(rs.next()) {
        san_pham sp = new san_pham();
        sp.setMa_san_pham(rs.getString(1));
        sp.setTen_san_pham(rs.getString(2));
        sp.setGia_ban(rs.getInt(3));
        sp.setGiam_gia(rs.getString(4));
        sp.setHinh_anh(rs.getString(5));
        list.add(sp);
    }
    }catch(SQLException ex) {
        Logger.getLogger(san_phamDAO.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
        ConnectDB.closeAll((com.mysql.jdbc.Connection) con, pstmt, rs);
    }
    return list;
    }
}
