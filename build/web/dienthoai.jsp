<%-- 
    Document   : dienthoai
    Created on : Oct 19, 2017, 3:02:09 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Điện thoại</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            * {box-sizing:border-box}
            body {font-family: Verdana,sans-serif;}
            .mySlides {display:none}

            /* Slideshow container */
            .slideshow-container {
                max-width: 1000px;
                position: relative;
                margin: auto;
            }

            /* Caption text */
            .text {
                color: #f2f2f2;
                font-size: 15px;
                padding: 8px 12px;
                position: absolute;
                bottom: 8px;
                width: 100%;
                text-align: center;
            }

            /* Number text (1/3 etc) */
            .numbertext {
                color: #f2f2f2;
                font-size: 12px;
                padding: 8px 12px;
                position: absolute;
                top: 0;
            }

            /* The dots/bullets/indicators */
            .dot {
                height: 15px;
                width: 15px;
                margin: 0 2px;
                background-color: #bbb;
                border-radius: 50%;
                display: inline-block;
                transition: background-color 0.6s ease;
            }

            .active {
                background-color: #717171;
            }

            /* Fading animation */
            .fade {
                -webkit-animation-name: fade;
                -webkit-animation-duration: 1.5s;
                animation-name: fade;
                animation-duration: 1.5s;
            }

            @-webkit-keyframes fade {
                from {opacity: .4} 
                to {opacity: 1}
            }

            @keyframes fade {
                from {opacity: .4} 
                to {opacity: 1}
            }

            /* On smaller screens, decrease text size */
            @media only screen and (max-width: 300px) {
                .text {font-size: 11px}
            }
        </style>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <div class="slideshow-container">

                <div class="mySlides fade">
                    <div class="numbertext">1 / 3</div>
                    <img src="img/hawai.png" style="width:100%">
                </div>

                <div class="mySlides fade">
                    <div class="numbertext">2 / 3</div>
                    <img src="img/wiki.jpg" style="width:100%">
                </div>

                <div class="mySlides fade">
                    <div class="numbertext">3 / 3</div>
                    <img src="img/zenfone.png" style="width:100%">
                </div>

            </div>
            <br>

            <div style="text-align:center">
                <span class="dot"></span> 
                <span class="dot"></span> 
                <span class="dot"></span> 
            </div>

            <script>
                var slideIndex = 0;
                showSlides();

                function showSlides() {
                    var i;
                    var slides = document.getElementsByClassName("mySlides");
                    var dots = document.getElementsByClassName("dot");
                    for (i = 0; i < slides.length; i++) {
                        slides[i].style.display = "none";
                    }
                    slideIndex++;
                    if (slideIndex > slides.length) {
                        slideIndex = 1
                    }
                    for (i = 0; i < dots.length; i++) {
                        dots[i].className = dots[i].className.replace(" active", "");
                    }
                    slides[slideIndex - 1].style.display = "block";
                    dots[slideIndex - 1].className += " active";
                    setTimeout(showSlides, 2000); // Change image every 2 seconds
                }
            </script>

            <div class="btn-group btn-group-justified">
                <a href="apple.jsp" class="btn btn-primary">Apple</a>
                <a href="#" class="btn btn-primary">Samsung</a>
                <a href="#" class="btn btn-primary">Sony</a>
                <a href="#" class="btn btn-primary">Nokia</a>
            </div>
            <div class="container-fluid bg-3 text-center">    
                <h3 style="text-align: left">Điện thoại hot nhất</h3><hr>
                <div class="row">
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                    <div class="col-sm-3">
                        <a href="#">
                            <img src="img/oppo.jpg" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                            <p style="font-weight: bolder">Oppo F3 Lite</p>
                        </a>
                        <p class="fs-dtprice " style="color: red">5.490.000 <strong>₫</strong></p>
                    </div>
                </div><br>

                <div class="container-fluid bg-3 text-center">    
                    <h3 style="text-align: left">Điện thoại mới ra mắt</h3><hr>
                    <div class="row">
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                        <div class="col-sm-3">
                            <a href="#">
                                <img src="img/nokia6.png" class="img-responsive" style="width:70%; margin: auto" alt="Image">
                                <p style="font-weight: bolder">Nokia 6</p>
                            </a>
                            <p class="fs-dtprice " style="color: red">5.590.000 <strong>₫</strong></p>
                        </div>
                    </div>
                </div><br>
            <jsp:include page="footer.jsp"></jsp:include>
            </body>
            </html> 
