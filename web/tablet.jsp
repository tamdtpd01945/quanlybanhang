<%-- 
    Document   : tablet
    Created on : Oct 19, 2017, 9:02:43 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Tablet</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
            .row.content {height: 1500px}

            /* Set gray background color and 100% height */
            .sidenav {
                background-color: #f1f1f1;
                height: 100%;
            }

            /* Set black background color, white text and some padding */
            

            /* On small screens, set height to 'auto' for sidenav and grid */
            @media screen and (max-width: 767px) {
                .sidenav {
                    height: auto;
                    padding: 15px;
                }
                .row.content {height: auto;} 
            }
        </style>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="container-fluid">
            <div class="row content">
                <div class="col-sm-3 sidenav">
                    <h4>Hãng sản xuất</h4>
                    <ul class="nav nav-pills nav-stacked">
                        <li><a href="#section2">Samsung</a></li>
                        <li><a href="#section2">apple(iPad)</a></li>
                        <li><a href="#section3">Lenovo</a></li>
                        <li><a href="#section3">Masstel</a></li>
                        <li><a href="#section3">Huawei</a></li>
                    </ul>
                    <h4>Hệ điều hành</h4>
                    <ul class="nav nav-pills nav-stacked">
                        <li><a href="#section2">Android</a></li>
                        <li><a href="#section2">iOS</a></li>
                        <li><a href="#section3">Windows</a></li>
                    </ul>
                </div>
                <div class="container-fluid bg-3 text-center">    
                    <h3 style="text-align: left; font-weight: bolder">Máy tính bản</h3><hr>
                    <div class="row">
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/ipad.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">iPad Wi-Fi 32GB (2017)</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">8.999.000 <strong>₫</strong></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

