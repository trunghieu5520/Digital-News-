package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"slide\">\n");
      out.write("                <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <img src=\"picture/picture1.PNG\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img src=\"picture/picture2.PNG\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img src=\"picture/picture3.PNG\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"content1\">\n");
      out.write("                    <div class=\"content11\">\n");
      out.write("                        <a href=\"ShopControl\">\n");
      out.write("                            <img src=\"picture/product1.jpg\" alt=\"\"/>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content12\">\n");
      out.write("                        <a href=\"ShopControl\">\n");
      out.write("                            <img src=\"intro/intro2.jpg\" alt=\"\"/>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content2\">\n");
      out.write("                    <div class=\"content12\">\n");
      out.write("                        <a href=\"ShopControl\">\n");
      out.write("                            <img src=\"intro/intro7.PNG\" alt=\"\"/>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content11\">\n");
      out.write("                         <a href=\"ShopControl\">\n");
      out.write("                           <img src=\"intro/intro3.jpg\" alt=\"\"/>\n");
      out.write("                        </a>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content1\">\n");
      out.write("                    <div class=\"content11\">\n");
      out.write("                        <a href=\"ShopControl\">\n");
      out.write("                           <img src=\"intro/intro9.PNG\" alt=\"\"/>\n");
      out.write("                        </a>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content12\">\n");
      out.write("                        <a href=\"ShopControl\">\n");
      out.write("                             <img src=\"picture/product2.jpg\" alt=\"\"/>\n");
      out.write("                        </a>\n");
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
      out.write("                                <h5 class=\"text-uppercase\">Footer Content</h5>\n");
      out.write("                                <p>Here you can use rows and columns to organize your footer content.</p>\n");
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
      out.write("                                        <a href=\"#!\">Face Book</a>\n");
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
      out.write("                                <h5 class=\"text-uppercase\">FB</h5>\n");
      out.write("\n");
      out.write("                                <ul class=\"list-unstyled\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Youtube</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Instagram</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Twitter</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#!\">Other</a>\n");
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
      out.write("                    <div class=\"footer-copyright text-center py-3\">© 2018 Copyright:\n");
      out.write("                        <a href=\"https://mdbootstrap.com/education/bootstrap/\"> MDBootstrap.com</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Copyright -->\n");
      out.write("\n");
      out.write("                </footer>\n");
      out.write("                <!-- Footer -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
