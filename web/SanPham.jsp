<%-- 
    Document   : SanPham
    Created on : Oct 20, 2017, 2:56:03 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nhập sản phẩm</title>
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
        <div class="container">
            <h1>Sản phẩm</h1>
            <form action="SanPhamServlet">
                <div class="form-group">
                    <label for="email">ID:</label>
                    <input type="text" class="form-control" placeholder="Enter id" name="id" value="${SANPHAM.get(0)}">
                </div>
                <div class="form-group">
                    <label for="pwd">Name:</label>
                    <input type="text" class="form-control" placeholder="Enter name" name="name" value="${SANPHAM.get(1)}">
                </div>
                <div class="form-group">
                    <label for="pwd">Quantity:</label>
                    <input type="number" class="form-control" placeholder="Enter Quantity" name="quantity" value="${SANPHAM.get(2)}">
                </div>
                <div class="form-group">
                    <label for="pwd">Price:</label>
                    <input type="number" class="form-control" placeholder="Enter price" name="price" value="${SANPHAM.get(3)}">
                </div>
                <div class="form-group">
                    <label for="pwd">Publishday:</label>

                    <input type="date" class="form-control" placeholder="Enter Publishday:" name="publishday" value="${SANPHAM.get(4)}">
                </div>
                <div class="form-group">
                    <label for="pwd">Danh Mục:</label>
                    <select id="" name="idDanhMuc" class="form-control">
                        <c:forEach items="${LIST_DANHMUC}" var="danhmuc">
                            <option value="${danhmuc.id}" ${danhmuc.id == SANPHAM_ID ? 'selected = "selected"' : ''}>${danhmuc.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-default" name="action" value="add">Add</button>
                <button type="submit" class="btn btn-default" name="action" value="update">Update</button>
            </form>
        </div><br>
        <div class="container">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>quantity</th>
                        <th>price</th>
                        <th>publishday</th>
                        <th>idDanhMuc</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="sp" items="${LIST_SANPHAM}">
                        <tr>
                            <td>${sp.id}</td>
                            <td>${sp.name}</td>
                            <td>${sp.quantity}</td>
                            <td>${sp.price}</td>
                            <td><fmt:formatDate pattern="dd-MM-yyyy" value="${sp.publishday}"></fmt:formatDate></td>
                    <td>${sp.idDanhMuc.name}</td>
                    <td>
                        <a href="SanPhamServlet?action=edit&id=${sp.id}">Edit</a>|
                        <a href="SanPhamServlet?action=del&id=${sp.id}">Del</a>
                    </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

