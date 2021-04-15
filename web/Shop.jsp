<%-- 
    Document   : Shop
    Created on : 22-Oct-2019, 15:48:36
    Author     : Hoan toan hanh phuc 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/shop.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="css/verticle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="cover">
            <jsp:include page="Head.jsp"></jsp:include>
                <div class="image">
                    <img src="picture/banner.PNG" alt=""/>
                </div>
                <div class="content">
                    <div class="left">
                        <h1 align="center" class="active">Brand</h1>

                        <div class="vertical-menu">
                            <a href="ShopControl?bid=0">All</a>
                            <a href="ShopControl?bid=1">Nike</a>
                            <a href="ShopControl?bid=2">Adidas</a>
                            <a href="ShopControl?bid=3">Converse</a>
                            <a href="ShopControl?bid=4">Vans</a>
                        </div>
                    </div>
                    <div class="right">
                    <c:forEach begin="1" end="${size}" var="i">
                        <div class="product">
                            <c:forEach begin="${3*i-3}" end="${3*i-1}" items="${list}" var="x">
                                <div class="product1">
                                    <div class="product-image">
                                        <img src="product/${x.image}" alt=""/>
                                    </div>
                                    <div class="product-title">
                                        ${x.name}
                                    </div>
                                    <div class="product-price">
                                        ${x.price} VND
                                    </div>
                                    <div class="buy">
                                        <a href="cart?id=${x.id}"><input type="submit" value="Buy"></a> 
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </c:forEach>
                </div>

            </div>
            <div  class="myfooter">
                <jsp:include page="footer.jsp"/>
            </div>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
