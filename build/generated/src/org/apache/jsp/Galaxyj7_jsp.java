package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Galaxyj7_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Samsung Galaxy J7 Pro</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/img.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"dienthoai.jsp\">Điện thoại</a></li>\n");
      out.write("                        <li><a href=\"laptop.jsp\">Laptop</a></li>\n");
      out.write("                        <li><a href=\"phukien.jsp\">Phụ kiện</a></li>\n");
      out.write("                        <li><a href=\"tablet.jsp\">Tablet</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("                        <div class=\"form-group input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search..\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-default\" type=\"button\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </span>        \n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Đăng nhập</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("            <h2>Samsung Galaxy J7 Pro</h2><hr>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img id=\"myImg\" src=\"img/j71.jpg\" alt=\"Trolltunga, Norway\" width=\"400\" height=\"400\">\n");
      out.write("                    <!-- The Modal -->\n");
      out.write("                    <div id=\"myModal\" class=\"modal\">\n");
      out.write("                        <span class=\"close\">&times;</span>\n");
      out.write("                        <img class=\"modal-content\" id=\"img01\">\n");
      out.write("                        <div id=\"caption\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                    // Get the modal\n");
      out.write("                        var modal = document.getElementById('myModal');\n");
      out.write("\n");
      out.write("                    // Get the image and insert it inside the modal - use its \"alt\" text as a caption\n");
      out.write("                        var img = document.getElementById('myImg');\n");
      out.write("                        var modalImg = document.getElementById(\"img01\");\n");
      out.write("                        var captionText = document.getElementById(\"caption\");\n");
      out.write("                        img.onclick = function () {\n");
      out.write("                            modal.style.display = \"block\";\n");
      out.write("                            modalImg.src = this.src;\n");
      out.write("                            captionText.innerHTML = this.alt;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    // Get the <span> element that closes the modal\n");
      out.write("                        var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("                    // When the user clicks on <span> (x), close the modal\n");
      out.write("                        span.onclick = function () {\n");
      out.write("                            modal.style.display = \"none\";\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <h1 >6.990.000 <strong>₫</strong></h1><hr>\n");
      out.write("                    <div class=\"fs-dtich clearfix\" data-toggle=\"modal\" data-target=\"#PopTSKT\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><label>Màn Hình:</label> <span>5.5 inch (1920 x 1080 pixels)</span></li>\n");
      out.write("                            <li><label>Camera:</label> <span>Chính: 13.0 MP, Phụ: 13.0 MP</span></li>\n");
      out.write("                            <li><label>Pin:</label> <span> 3600 mAh</span></li>\n");
      out.write("                            <li><label>Ram:</label> <span> 3 GB</span></li>\n");
      out.write("                            <li><label>CPU :</label><span> Exynos 7870, 8 Nhân, Octa-core 1.6 GHz</span></li>\n");
      out.write("                            <li><label>HĐH:</label> <span>Android 7.0 Nougat</span></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <p style=\"font-weight: bolder; color: #6699ff\">Khuyến mại đặc biệt (SL có hạn)</p>\n");
      out.write("                        <div class=\"fs-dtslbox\">\n");
      out.write("                            <div class=\"fs-dtslct\">\n");
      out.write("                                <p><strong>CHƯƠNG TRÌNH KHUYẾN MẠI ĐẶC BIỆT ĐẾN 31/10:</strong></p>\n");
      out.write("\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Cơ hội Trúng 108 Tivi Samsung 65\" &amp; Tủ Lạnh Samsung&nbsp;</li>\n");
      out.write("                                    <li>Giảm ngay 2 triệu khi mua máy kèm gói cước FPT288</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <p><strong>HOẶC CHỌN CHƯƠNG TRÌNH KHUYẾN MẠI ĐẾN 22/10:</strong></p>\n");
      out.write("\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Cơ hội Trúng 108 Tivi Samsung 65\" &amp; Tủ Lạnh Samsung&nbsp;</li>\n");
      out.write("                                    <li>Trả góp 0% Hoặc 100% trúng PMH Phụ Kiện/ Dịch Vụ từ 150,000đ đến 10,000,000đ&nbsp;</li>\n");
      out.write("                                    <li>Tặng PMH Phụ Kiện 300,000đ</li>\n");
      out.write("                                    <li>Tặng PMH Phụ Kiện 100,000đ khi mua Online</li>\n");
      out.write("                                    <li>Giảm ngay 200,000đ khi mua Thẻ nhớ 32GB cùng máy</li>\n");
      out.write("                                    <li>Trả góp sinh viên&nbsp;</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-info\" role=\"button\">Mua hàng online</a>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-info\" role=\"button\">Thêm vào giỏ hàng</a>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-info\" role=\"button\">Trả góp</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <h3>Danh sách shop:</h3>\n");
      out.write("                    <p>116 Tôn Đức Thắng, P.Hòa Minh, Q.Liên Chiểu, TP.Đà Nẵng</p>\n");
      out.write("                    <hr>\n");
      out.write("                    <p>144 Nguyễn Lương Bằng, P. Hòa Khánh Bắc, H. Liên Chiểu, TP. Đà Nẵng (đối diện trường cao đẳng Kinh Tế Kế Hoạch)</p>\n");
      out.write("                    <hr>\n");
      out.write("                    <p>908A Tôn Đức Thắng, Phường Hòa Khánh Bắc, Quận Liên Chiểu, Thành Phố Đà Nẵng</p>\n");
      out.write("                </div>\n");
      out.write("            </div><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
