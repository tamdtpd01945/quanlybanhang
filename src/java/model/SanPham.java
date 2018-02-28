/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SanPham {
     private int id;
    private String name;
    private int quantity;
    private double price;
    private Date publishday;
    private DanhMuc idDanhMuc;

    public SanPham() {
    }

    public SanPham(int id, String name, int quantity, double price, Date publishday, DanhMuc idDanhMuc) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.publishday = publishday;
        this.idDanhMuc = idDanhMuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishday() {
        return publishday;
    }

    public void setPublishday(Date publishday) {
        this.publishday = publishday;
    }

    public DanhMuc getIdDanhMuc() {
        return idDanhMuc;
    }

    public void setIdDanhMuc(DanhMuc idDanhMuc) {
        this.idDanhMuc = idDanhMuc;
    }

}
