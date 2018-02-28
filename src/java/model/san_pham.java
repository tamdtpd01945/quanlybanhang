/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class san_pham implements Serializable {
    private String ma_san_pham;
    private String ten_san_pham;
    private int gia_ban;
    private String giam_gia;
    private String hinh_anh;

    public san_pham() {
    }

    public san_pham(String ma_san_pham, String ten_san_pham, int gia_ban, String giam_gia, String hinh_anh) {
        this.ma_san_pham = ma_san_pham;
        this.ten_san_pham = ten_san_pham;
        this.gia_ban = gia_ban;
        this.giam_gia = giam_gia;
        this.hinh_anh = hinh_anh;
    }

    public String getMa_san_pham() {
        return ma_san_pham;
    }

    public void setMa_san_pham(String ma_san_pham) {
        this.ma_san_pham = ma_san_pham;
    }

    public String getTen_san_pham() {
        return ten_san_pham;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public int getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(int gia_ban) {
        this.gia_ban = gia_ban;
    }

    public String getGiam_gia() {
        return giam_gia;
    }

    public void setGiam_gia(String giam_gia) {
        this.giam_gia = giam_gia;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }
    
    
}
