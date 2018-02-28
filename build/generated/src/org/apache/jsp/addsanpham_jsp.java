package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addsanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Thêm sản phẩm</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <button onclick=\"myFunction()\" class=\"dropbtn\">Admin</button>\n");
      out.write("                            <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("                                <a href=\"#home\">Logout</a>\n");
      out.write("                                <a href=\"#about\">Exit</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            /* When the user clicks on the button, \n");
      out.write("                             toggle between hiding and showing the dropdown content */\n");
      out.write("                            function myFunction() {\n");
      out.write("                                document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            // Close the dropdown if the user clicks outside of it\n");
      out.write("                            window.onclick = function (event) {\n");
      out.write("                                if (!event.target.matches('.dropbtn')) {\n");
      out.write("\n");
      out.write("                                    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("                                    var i;\n");
      out.write("                                    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("                                        var openDropdown = dropdowns[i];\n");
      out.write("                                        if (openDropdown.classList.contains('show')) {\n");
      out.write("                                            openDropdown.classList.remove('show');\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        </script>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <h2>Thêm sản phẩm</h2>\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputsm\">Tên sản phẩm</label>\n");
      out.write("                        <input class=\"form-control input-sm\" id=\"inputsm\" type=\"text\" placeholder=\"Tên sản phẩm\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputsm\">Giá sản phẩm</label>\n");
      out.write("                        <input class=\"form-control input-sm\" id=\"inputsm\" type=\"text\" placeholder=\"Giá sản phẩm\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"comment\">Chi tiết sản phẩm</label>\n");
      out.write("                        <textarea class=\"form-control\" rows=\"5\" id=\"comment\" placeholder=\"Chi tiết sản phẩm\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Upload File</legend>\n");
      out.write("                        <form action=\"FileUploadServlet\" method=\"post\"\n");
      out.write("                              enctype=\"multipart/form-data\">\n");
      out.write("                            <label for=\"fileName\">Select File: </label>\n");
      out.write("                            <input id=\"fileName\" type=\"file\" name=\"fileName\" size=\"30\" /><br />\n");
      out.write("                            <input type=\"submit\" value=\"Upload\" />\n");
      out.write("                        </form>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary btn-md\">Thêm sản phẩm</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\">Hủy</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <h2>Gallery</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
