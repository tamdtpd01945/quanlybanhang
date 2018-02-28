/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DanhMucDAO;
import dao.SanPhamDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DanhMuc;
import model.SanPham;

/**
 *
 * @author Admin
 */
public class SanPhamServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    SimpleDateFormat simpledf = new SimpleDateFormat("yyyy-MM-dd");
    SanPhamDAO spDAO = new SanPhamDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String quantity = request.getParameter("quantity");
            String price = request.getParameter("price");
            String publishday = request.getParameter("publishday");
            String idDanhMuc = request.getParameter("idDanhMuc");
            String action = request.getParameter("action");
            if (id == null) {
                getDanhMucCombo(request, response);
                request.setAttribute("LIST_SANPHAM", spDAO.getAllSanPham());
                request.getRequestDispatcher("SanPham.jsp").forward(request, response);
                return;
            }
            switch (action) {
                case "add":
                    SanPham sp = new SanPham(Integer.parseInt(id), name, Integer.parseInt(quantity),
                            Double.parseDouble(price), simpledf.parse(publishday), new DanhMuc(Integer.parseInt(idDanhMuc), ""));
                    spDAO.addSanPham(sp);
                    request.setAttribute("LIST_SANPHAM", spDAO.getAllSanPham());
                    request.getRequestDispatcher("SanPham.jsp").forward(request, response);
                    break;

                case "edit":
                    request.setAttribute("LIST_DANHMUC", dmDAO.getAllDanhMuc());
                    request.setAttribute("LIST_SANPHAM", spDAO.getAllSanPham());
                    Vector a = spDAO.getSanPhamByID(id);
                    request.setAttribute("SANPHAM", a);
                    request.setAttribute("SANPHAM_ID", a.get(0));
                    request.getRequestDispatcher("SanPham.jsp").forward(request, response);
                    break;

                case "update":
                    sp = new SanPham(Integer.parseInt(id), name, Integer.parseInt(quantity), Double.parseDouble(price),
                            simpledf.parse(publishday), new DanhMuc(Integer.parseInt(idDanhMuc), ""));
                    spDAO.updateSanPham(sp);
                    request.setAttribute("LIST_SANPHAM", spDAO.getAllSanPham());
                    request.getRequestDispatcher("SanPham.jsp").forward(request, response);
                    break;
                case "del":
                    if (spDAO.delSanPham(id) == 1) {
                        request.setAttribute("LIST_SANPHAM", spDAO.getAllSanPham());
                        request.getRequestDispatcher("SanPham.jsp").forward(request, response);
                    }
                    break;
            }
        }
    }
    DanhMucDAO dmDAO = new DanhMucDAO();

    public void getDanhMucCombo(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("LIST_DANHMUC", dmDAO.getAllDanhMuc());
            System.out.println("LIST_DANHMUC size:"+dmDAO.getAllDanhMuc().size());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(SanPhamServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(SanPhamServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
