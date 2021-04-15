<%-- 
    Document   : Home
    Created on : 22-Oct-2019, 14:50:17
    Author     : Hoan toan hanh phuc 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="cover">
            <div class="menu">
                <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                    <!-- Brand/logo -->
                    <a class="navbar-brand" href="#">
                        <img src="picture/logo.PNG" alt="logo" style="width:40px;height:auto">
                    </a>
                    <!-- Links -->
                    <ul class="navbar-nav">
                        <li class="nav-item" style="font-size: 20px; color: white">
                            <a class="nav-link" href="Home.jsp">Home Page</a>
                        </li>
                        <li class="nav-item" style="font-size: 20px; color: white">
                            <a class="nav-link" href="Shop.jsp">Shop</a>
                        </li>
                        <li class="nav-item" style="font-size: 20px; color: white">
                            <a class="nav-link" href="Login.jsp">Log In</a>
                        </li>
                        <c:if test="${not empty user}">
                            <li class="nav-item" style="font-size: 20px; color: white">
                                <a class="nav-link" href="LogOutControl">Log Out</a>
                            </li>
                        </c:if>
                        <c:if test="${not empty user}">
                            <li class="nav-item" style="font-size: 20px; color: white">
                                <a class="nav-link" href="Cart.jsp">Cart</a>
                            </li>
                        </c:if>
                    </ul>
                </nav>
            </div>
            <div class="login">
                <div class="login-wrap">
                    <h2>Login</h2>

                    <div class="form">
                        <form action="LoginControl" method="post">
                            <input type="text" placeholder="Username" name="user" />
                            <input type="password" placeholder="Password" name="pass" />
                            <button type="submit"> Sign in </button>
                        </form>
                        <a href="#"> <p> Don't have an account? Register </p></a>
                    </div>
                </div>
            </div>
            <div class="footer">
                <footer class="page-footer font-small blue pt-4">

                    <!-- Footer Links -->
                    <div class="container-fluid text-center text-md-left">

                        <!-- Grid row -->
                        <div class="row">

                            <!-- Grid column -->
                            <div class="col-md-6 mt-md-0 mt-3">

                                <!-- Content -->
                                <h5 class="text-uppercase">Shoes shop</h5>
                                <p>Here you can buy your interest shoes.</p>

                            </div>
                            <!-- Grid column -->

                            <hr class="clearfix w-100 d-md-none pb-3">

                            <!-- Grid column -->
                            <div class="col-md-3 mb-md-0 mb-3">

                                <!-- Links -->
                                <h5 class="text-uppercase">Links</h5>

                                <ul class="list-unstyled">
                                    <li>
                                        <a href="#!">FB</a>
                                    </li>
                                    <li>
                                        <a href="#!">Youtube</a>
                                    </li>
                                    <li>
                                        <a href="#!">Instagram</a>
                                    </li>
                                    <li>
                                        <a href="#!">Twitter</a>
                                    </li>
                                </ul>

                            </div>
                            <!-- Grid column -->

                            <!-- Grid column -->
                            <div class="col-md-3 mb-md-0 mb-3">

                                <!-- Links -->
                                <h5 class="text-uppercase">Links</h5>

                                <ul class="list-unstyled">
                                    <li>
                                        <a href="#!">FB</a>
                                    </li>
                                    <li>
                                        <a href="#!">Youtube</a>
                                    </li>
                                    <li>
                                        <a href="#!">Instagram</a>
                                    </li>
                                    <li>
                                        <a href="#!">Twitter</a>
                                    </li>
                                </ul>

                            </div>
                            <!-- Grid column -->

                        </div>
                        <!-- Grid row -->

                    </div>
                    <!-- Footer Links -->

                    <!-- Copyright -->
                    <div class="footer-copyright text-center py-3">© 2020 Copyright:
                        <a href="https://www.facebook.com/hieu.nguyen.5520/"> Kinshop</a>
                    </div>
                    <!-- Copyright -->

                </footer>
                <!-- Footer -->

            </div>
        </div>
        <script>
            // Login/Register form
// Author: Ian Pirro 
//------------------------------------
// Form will change from login to register and visa-versa based
// on if the user is already "registered"
// "Usernames" min-len is 5 chars
//
// Could be annoying... but fun anyways


// These users "already exist"
            var users = [
                {name: 'ianpirro'},
                {name: 'joeschmoe'},
                {name: 'superdev'}
            ]

            var loginform = {

                init: function () {
                    this.bindUserBox();
                },

                bindUserBox: function () {
                    var result = {};

                    $(".form").delegate("input[name='un']", 'blur', function () {
                        var $self = $(this);

                        // this grep would be replaced by $.post tp check db for user
                        result = $.grep(users, function (elem, i) {
                            return (elem.name == $self.val());
                        });

                        // This would be callback
                        if (result.length === 1) {
                            if ($("div.login-wrap").hasClass('register')) {
                                loginform.revertForm();
                                return;
                            } else {
                                return;
                            }
                        }

                        if (!$("div.login-wrap").hasClass('register')) {
                            if ($("input[name='un']").val().length > 4)
                                loginform.switchForm();
                        }

                    });
                },
                switchForm: function () {
                    var $html = $("div.login-wrap").addClass('register');
                    $html.children('h2').html('Register');
                    $html.find(".form input[name='pw']").after("<input type='password' placeholder='Re-type password' name='rpw' />");
                    $html.find('button').html('Sign up');
                    $html.find('a p').html('Have an account? Sign in');
                },
                revertForm: function () {
                    var $html = $("div.login-wrap").removeClass('register');
                    $html.children('h2').html('Login');
                    $html.find(".form input[name='rpw']").remove();
                    $html.find('button').html('Sign in');
                    $html.find('a p').html("Don't have an account? Register");
                },
                submitForm: function () {
                    // ajax to handle register or login
                }

            } // loginform {}


// Init login form
            loginform.init();


// vertical align box   
            (function (elem) {
                elem.css("margin-top", Math.floor(($(window).height() / 2) - (elem.height() / 2)));
            }($(".login-wrap")));

            $(window).resize(function () {
                $(".login-wrap").css("margin-top", Math.floor(($(window).height() / 2) - ($(".login-wrap").height() / 2)));

            });
        </script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
