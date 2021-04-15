package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cover\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write("                    <!-- Brand/logo -->\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                        <img src=\"picture/logo.PNG\" alt=\"logo\" style=\"width:40px;height:auto\">\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Links -->\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\" style=\"font-size: 20px; color: white\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.jsp\">Home Page</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\" style=\"font-size: 20px; color: white\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Shop.jsp\">Shop</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\" style=\"font-size: 20px; color: white\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Login.jsp\">Log In</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <div class=\"login-wrap\">\n");
      out.write("                    <h2>Login</h2>\n");
      out.write("\n");
      out.write("                    <div class=\"form\">\n");
      out.write("                        <form action=\"LoginControl\" method=\"post\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Username\" name=\"user\" />\n");
      out.write("                            <input type=\"password\" placeholder=\"Password\" name=\"pass\" />\n");
      out.write("                            <button type=\"submit\"> Sign in </button>\n");
      out.write("                        </form>\n");
      out.write("                        <a href=\"#\"> <p> Don't have an account? Register </p></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <footer class=\"page-footer font-small blue pt-4\">\n");
      out.write("\n");
      out.write("                    <!-- Footer Links -->\n");
      out.write("                    <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("\n");
      out.write("                        <!-- Grid row -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <!-- Grid column -->\n");
      out.write("                            <div class=\"col-md-6 mt-md-0 mt-3\">\n");
      out.write("\n");
      out.write("                                <!-- Content -->\n");
      out.write("                                <h5 class=\"text-uppercase\">Shoes shop</h5>\n");
      out.write("                                <p>Here you can buy your interest shoes.</p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Grid column -->\n");
      out.write("\n");
      out.write("                            <hr class=\"clearfix w-100 d-md-none pb-3\">\n");
      out.write("\n");
      out.write("                            <!-- Grid column -->\n");
      out.write("                            <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("\n");
      out.write("                                <!-- Links -->\n");
      out.write("                                <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("                                <ul class=\"list-unstyled\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">FB</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Youtube</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Instagram</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Twitter</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Grid column -->\n");
      out.write("\n");
      out.write("                            <!-- Grid column -->\n");
      out.write("                            <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("\n");
      out.write("                                <!-- Links -->\n");
      out.write("                                <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("                                <ul class=\"list-unstyled\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">FB</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Youtube</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Instagram</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Twitter</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Grid column -->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid row -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Footer Links -->\n");
      out.write("\n");
      out.write("                    <!-- Copyright -->\n");
      out.write("                    <div class=\"footer-copyright text-center py-3\">© 2020 Copyright:\n");
      out.write("                        <a href=\"https://www.facebook.com/hieu.nguyen.5520/\"> Kinshop</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Copyright -->\n");
      out.write("\n");
      out.write("                </footer>\n");
      out.write("                <!-- Footer -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            // Login/Register form\n");
      out.write("// Author: Ian Pirro \n");
      out.write("//------------------------------------\n");
      out.write("// Form will change from login to register and visa-versa based\n");
      out.write("// on if the user is already \"registered\"\n");
      out.write("// \"Usernames\" min-len is 5 chars\n");
      out.write("//\n");
      out.write("// Could be annoying... but fun anyways\n");
      out.write("\n");
      out.write("\n");
      out.write("// These users \"already exist\"\n");
      out.write("            var users = [\n");
      out.write("                {name: 'ianpirro'},\n");
      out.write("                {name: 'joeschmoe'},\n");
      out.write("                {name: 'superdev'}\n");
      out.write("            ]\n");
      out.write("\n");
      out.write("            var loginform = {\n");
      out.write("\n");
      out.write("                init: function () {\n");
      out.write("                    this.bindUserBox();\n");
      out.write("                },\n");
      out.write("\n");
      out.write("                bindUserBox: function () {\n");
      out.write("                    var result = {};\n");
      out.write("\n");
      out.write("                    $(\".form\").delegate(\"input[name='un']\", 'blur', function () {\n");
      out.write("                        var $self = $(this);\n");
      out.write("\n");
      out.write("                        // this grep would be replaced by $.post tp check db for user\n");
      out.write("                        result = $.grep(users, function (elem, i) {\n");
      out.write("                            return (elem.name == $self.val());\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        // This would be callback\n");
      out.write("                        if (result.length === 1) {\n");
      out.write("                            if ($(\"div.login-wrap\").hasClass('register')) {\n");
      out.write("                                loginform.revertForm();\n");
      out.write("                                return;\n");
      out.write("                            } else {\n");
      out.write("                                return;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (!$(\"div.login-wrap\").hasClass('register')) {\n");
      out.write("                            if ($(\"input[name='un']\").val().length > 4)\n");
      out.write("                                loginform.switchForm();\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("                },\n");
      out.write("                switchForm: function () {\n");
      out.write("                    var $html = $(\"div.login-wrap\").addClass('register');\n");
      out.write("                    $html.children('h2').html('Register');\n");
      out.write("                    $html.find(\".form input[name='pw']\").after(\"<input type='password' placeholder='Re-type password' name='rpw' />\");\n");
      out.write("                    $html.find('button').html('Sign up');\n");
      out.write("                    $html.find('a p').html('Have an account? Sign in');\n");
      out.write("                },\n");
      out.write("                revertForm: function () {\n");
      out.write("                    var $html = $(\"div.login-wrap\").removeClass('register');\n");
      out.write("                    $html.children('h2').html('Login');\n");
      out.write("                    $html.find(\".form input[name='rpw']\").remove();\n");
      out.write("                    $html.find('button').html('Sign in');\n");
      out.write("                    $html.find('a p').html(\"Don't have an account? Register\");\n");
      out.write("                },\n");
      out.write("                submitForm: function () {\n");
      out.write("                    // ajax to handle register or login\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            } // loginform {}\n");
      out.write("\n");
      out.write("\n");
      out.write("// Init login form\n");
      out.write("            loginform.init();\n");
      out.write("\n");
      out.write("\n");
      out.write("// vertical align box   \n");
      out.write("            (function (elem) {\n");
      out.write("                elem.css(\"margin-top\", Math.floor(($(window).height() / 2) - (elem.height() / 2)));\n");
      out.write("            }($(\".login-wrap\")));\n");
      out.write("\n");
      out.write("            $(window).resize(function () {\n");
      out.write("                $(\".login-wrap\").css(\"margin-top\", Math.floor(($(window).height() / 2) - ($(\".login-wrap\").height() / 2)));\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\" style=\"font-size: 20px; color: white\">\n");
        out.write("                                <a class=\"nav-link\" href=\"LogOutControl\">Log Out</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\" style=\"font-size: 20px; color: white\">\n");
        out.write("                                <a class=\"nav-link\" href=\"Cart.jsp\">Cart</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
