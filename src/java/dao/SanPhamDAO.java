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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DanhMuc;
import model.SanPham;

/**
 *
 * @author Admin
 */
public class SanPhamDAO {
     Connection conn = null;
    PreparedStatement pre1, pre2, pre3;
    ConnectDB con = new ConnectDB();
    SimpleDateFormat simpledf = new SimpleDateFormat("yyyy-MM-dd");

    public int addSanPham(SanPham sanpham) {
        conn = new ConnectDB().getConnect();
        try {
            pre1 = conn.prepareStatement("INSERT INTO `tbsanpham`(`ID`, `Name`, `Quantity`, `Price`, `Publishday`, `IDDanhMuc`) VALUES (?,?,?,?,?,?);");
            pre1.setInt(1, sanpham.getId());
            pre1.setString(2, sanpham.getName());
            pre1.setInt(3, sanpham.getQuantity());
            pre1.setDouble(4, sanpham.getPrice());
            pre1.setString(5, simpledf.format(sanpham.getPublishday()));
            pre1.setInt(6, sanpham.getIdDanhMuc().getId());
            if (pre1.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<SanPham> getAllSanPham() throws ParseException, SQLException {
        List<SanPham> listsp = new ArrayList<>();
        conn = con.getConnect();
        Statement sm;
        try {
            sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT tbsanpham.ID, tbsanpham.Name, tbsanpham.Quantity, tbsanpham.Price, tbsanpham.Publishday, tbdanhmuc.ID, tbdanhmuc.Name FROM `tbsanpham` INNER JOIN `tbdanhmuc` ON tbdanhmuc.ID = tbsanpham.IDDanhMuc");
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getInt(4), simpledf.parse(rs.getString(5)), new DanhMuc(rs.getInt(6), rs.getString(7)));
                listsp.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn.close();
        return listsp;
    }

    public Vector getSanPhamByID(String id) {
        Vector kq = new Vector();
        Connection conn = con.getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM `tbsanpham` WHERE `tbsanpham`.`ID` = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kq.add(rs.getInt(1));
                kq.add(rs.getString(2));
                kq.add(rs.getInt(3));
                kq.add(rs.getDouble(4));
                kq.add(rs.getString(5));
                kq.add(rs.getInt(6));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public int updateSanPham(SanPham sanpham) throws SQLException {
        conn = new ConnectDB().getConnect();
        try {
            pre2 = conn.prepareStatement("UPDATE `tbsanpham` SET `Name` = ?, `Quantity` = ?, `Price` = ?, `Publishday` = ?, `IDDanhMuc` = ? WHERE `tbsanpham`.`ID` = ?;");
            pre2.setString(1, sanpham.getName());
            pre2.setInt(2, sanpham.getQuantity());
            pre2.setDouble(3, sanpham.getPrice());
            pre2.setString(4, simpledf.format(sanpham.getPublishday()));
            pre2.setInt(5, sanpham.getIdDanhMuc().getId());
            pre2.setInt(6, sanpham.getId());
            if (pre2.executeUpdate() == 1) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return -1;
    }

    public int delSanPham(String ID) {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("DELETE FROM `tbsanpham` WHERE `tbsanpham`.`ID` = ?");
            pre3.setString(1, ID);
            if (pre3.executeUpdate() != 0) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }
}
