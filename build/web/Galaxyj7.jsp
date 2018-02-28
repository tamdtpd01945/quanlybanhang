<%-- 
    Document   : Galaxyj7
    Created on : Oct 19, 2017, 11:04:33 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Samsung Galaxy J7 Pro</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/img.css" rel="stylesheet" type="text/css"/>
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
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Đăng nhập</a></li>
                    </ul>
                </div>
            </div>
        </nav>
            <h2>Samsung Galaxy J7 Pro</h2><hr>
            <div class="container">
                <div class="col-sm-4">
                    <img id="myImg" src="img/j71.jpg" alt="Trolltunga, Norway" width="400" height="400">
                    <!-- The Modal -->
                    <div id="myModal" class="modal">
                        <span class="close">&times;</span>
                        <img class="modal-content" id="img01">
                        <div id="caption"></div>
                    </div>

                    <script>
                    // Get the modal
                        var modal = document.getElementById('myModal');

                    // Get the image and insert it inside the modal - use its "alt" text as a caption
                        var img = document.getElementById('myImg');
                        var modalImg = document.getElementById("img01");
                        var captionText = document.getElementById("caption");
                        img.onclick = function () {
                            modal.style.display = "block";
                            modalImg.src = this.src;
                            captionText.innerHTML = this.alt;
                        }

                    // Get the <span> element that closes the modal
                        var span = document.getElementsByClassName("close")[0];

                    // When the user clicks on <span> (x), close the modal
                        span.onclick = function () {
                            modal.style.display = "none";
                        }
                    </script>
                </div>
                <div class="col-sm-4">
                    <h1 >6.990.000 <strong>₫</strong></h1><hr>
                    <div class="fs-dtich clearfix" data-toggle="modal" data-target="#PopTSKT">
                        <ul>
                            <li><label>Màn Hình:</label> <span>5.5 inch (1920 x 1080 pixels)</span></li>
                            <li><label>Camera:</label> <span>Chính: 13.0 MP, Phụ: 13.0 MP</span></li>
                            <li><label>Pin:</label> <span> 3600 mAh</span></li>
                            <li><label>Ram:</label> <span> 3 GB</span></li>
                            <li><label>CPU :</label><span> Exynos 7870, 8 Nhân, Octa-core 1.6 GHz</span></li>
                            <li><label>HĐH:</label> <span>Android 7.0 Nougat</span></li>
                        </ul>
                        <p style="font-weight: bolder; color: #6699ff">Khuyến mại đặc biệt (SL có hạn)</p>
                        <div class="fs-dtslbox">
                            <div class="fs-dtslct">
                                <p><strong>CHƯƠNG TRÌNH KHUYẾN MẠI ĐẶC BIỆT ĐẾN 31/10:</strong></p>

                                <ul>
                                    <li>Cơ hội Trúng 108 Tivi Samsung 65" &amp; Tủ Lạnh Samsung&nbsp;</li>
                                    <li>Giảm ngay 2 triệu khi mua máy kèm gói cước FPT288</li>
                                </ul>

                                <p><strong>HOẶC CHỌN CHƯƠNG TRÌNH KHUYẾN MẠI ĐẾN 22/10:</strong></p>

                                <ul>
                                    <li>Cơ hội Trúng 108 Tivi Samsung 65" &amp; Tủ Lạnh Samsung&nbsp;</li>
                                    <li>Trả góp 0% Hoặc 100% trúng PMH Phụ Kiện/ Dịch Vụ từ 150,000đ đến 10,000,000đ&nbsp;</li>
                                    <li>Tặng PMH Phụ Kiện 300,000đ</li>
                                    <li>Tặng PMH Phụ Kiện 100,000đ khi mua Online</li>
                                    <li>Giảm ngay 200,000đ khi mua Thẻ nhớ 32GB cùng máy</li>
                                    <li>Trả góp sinh viên&nbsp;</li>
                                </ul>
                            </div>
                        </div>
                        <a href="#" class="btn btn-info" role="button">Mua hàng online</a>
                        <a href="#" class="btn btn-info" role="button">Thêm vào giỏ hàng</a><br>
                    </div>
                </div>
                <div class="col-sm-4">
                    <h3>Danh sách shop:</h3>
                    <p>116 Tôn Đức Thắng, P.Hòa Minh, Q.Liên Chiểu, TP.Đà Nẵng</p>
                    <hr>
                    <p>144 Nguyễn Lương Bằng, P. Hòa Khánh Bắc, H. Liên Chiểu, TP. Đà Nẵng (đối diện trường cao đẳng Kinh Tế Kế Hoạch)</p>
                    <hr>
                    <p>908A Tôn Đức Thắng, Phường Hòa Khánh Bắc, Quận Liên Chiểu, Thành Phố Đà Nẵng</p>
                </div>
            </div><br>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

