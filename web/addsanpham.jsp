<%-- 
    Document   : addsanpham
    Created on : Oct 23, 2017, 10:26:23 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm sản phẩm</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/admin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="home.jsp">Home</a></li>
                        <li><a href="dienthoai.jsp">Điện thoại</a></li>
                        <li><a href="laptop.jsp">Laptop</a></li>
                        <li><a href="phukien.jsp">Phụ kiện</a></li>
                        <li><a href="tablet.jsp">Tablet</a></li>
                    </ul>
                    <form class="navbar-form navbar-right" role="search">
                        <div class="form-group input-group">
                            <input type="text" class="form-control" placeholder="Search..">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <span class="glyphicon glyphicon-search"></span>
                                </button>
                            </span>        
                        </div>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <div class="dropdown">
                            <button onclick="myFunction()" class="dropbtn">Admin</button>
                            <div id="myDropdown" class="dropdown-content">
                                <a href="#home">Logout</a>
                                <a href="#about">Exit</a>
                            </div>
                        </div>

                        <script>
                            /* When the user clicks on the button, 
                             toggle between hiding and showing the dropdown content */
                            function myFunction() {
                                document.getElementById("myDropdown").classList.toggle("show");
                            }

                            // Close the dropdown if the user clicks outside of it
                            window.onclick = function (event) {
                                if (!event.target.matches('.dropbtn')) {

                                    var dropdowns = document.getElementsByClassName("dropdown-content");
                                    var i;
                                    for (i = 0; i < dropdowns.length; i++) {
                                        var openDropdown = dropdowns[i];
                                        if (openDropdown.classList.contains('show')) {
                                            openDropdown.classList.remove('show');
                                        }
                                    }
                                }
                            }
                        </script>
                    </ul>
                </div>
            </div>
        </nav>
        <ul class="nav nav-tabs">
            <li><a href="SanPham.jsp">Nhập sản phẩm</a></li>
            <li><a href="addsanpham.jsp">Thêm sản phẩm</a></li>
        </ul>
        <div class="row">
            <div class="col-sm-8">
                <h2>Thêm sản phẩm</h2>
                <form>
                    <div class="form-group">
                        <label for="inputsm">Tên sản phẩm</label>
                        <input class="form-control input-sm" id="inputsm" type="text" placeholder="Tên sản phẩm">
                    </div>
                    <div class="form-group">
                        <label for="inputsm">Giá sản phẩm</label>
                        <input class="form-control input-sm" id="inputsm" type="text" placeholder="Giá sản phẩm">
                    </div>
                    <div class="form-group">
                        <label for="comment">Chi tiết sản phẩm</label>
                        <textarea class="form-control" rows="5" id="comment" placeholder="Chi tiết sản phẩm"></textarea>
                    </div>
                    <button type="button" class="btn btn-primary btn-md">Thêm sản phẩm</button>
                    <button type="button" class="btn btn-default">Hủy</button>
                </form>
            </div>
            <div class="col-sm-4">
                <h2>Gallery</h2>
            </div>
        </div>
    </body>
</html>
