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
import java.util.logging.Level;

/**
 *
 * @author Admin
 */
public class LoginDAO {
    PreparedStatement ps1;
    Connection con = null;
    ConnectDB cn = new ConnectDB();
    
    public boolean login(String Username, String password) throws SQLException {
        try {
            con = cn.getConnect();
            ps1 = con.prepareStatement("SELECT * FROM `java4` WHERE `Username` = ? AND `password` = ?");
            ps1.setString(1, Username);
            ps1.setString(2, password);
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            return false;
        }
        return false;
    }
}
