/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DanhMuc;

/**
 *
 * @author Admin
 */
public class DanhMucDAO {
    public List<DanhMuc> getAllDanhMuc() throws SQLException {
        Connection conn = null;
        List<DanhMuc> listDanhMuc = new ArrayList<>();
        ConnectDB con = new ConnectDB();
        conn = con.getConnect();
        try {
            Statement pre = conn.createStatement();
            ResultSet rs = pre.executeQuery("SELECT * FROM tbdanhmuc");
            while (rs.next()) {
                DanhMuc danhmuc = new DanhMuc(rs.getInt(1), rs.getString(2));
                listDanhMuc.add(danhmuc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn.close();
        return listDanhMuc;
    }
}
