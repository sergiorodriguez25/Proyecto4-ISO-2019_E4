/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2019-10-31 19:29:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class citas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/3.4/examples/signin/\">\r\n");
      out.write("\r\n");
      out.write("    <title>Citas</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"signin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <style>\r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        -ms-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"starter-template.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">THE GOOD HEALTH</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Mis citas <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Pedir cita</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Cuenta</a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Mi Perfil</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Información</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"/\">Cerrar sesión</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Buscar\" aria-label=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Buscar</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<main role=\"main\" class=\"container\">\r\n");
      out.write("\t<div class=\"span\">\r\n");
      out.write("\t<div></div>\r\n");
      out.write("          <div class=\"hero-unit\">\r\n");
      out.write("    \t\t<br></br></br></br>\r\n");
      out.write("    \t<div class=\"row\">\r\n");
      out.write("  \t\t\t<div class=\"col-md-8\">\r\n");
      out.write("  \t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("  \t\t\t\t<div class=\"card-body\">\r\n");
      out.write("            \t\t<h4>Mis Citas</h4>\r\n");
      out.write("            \t\t<p>Bienvenido/a a la página de \"Mis citas\" en la que aparecen todas las citas que tiene programadas. Si desea modificar o anular una cita, por favor pulse en el botón de abajo.</p>\r\n");
      out.write("         \t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t<div class=\"card\">\r\n");
      out.write("  \t\t\t\t<div class=\"card-body\">\r\n");
      out.write("  \t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("            \t\t \t<img src=\"https://cdn.pixabay.com/photo/2015/12/22/04/00/photo-1103596_1280.png\" class=\"img-fluid rounded\" width=\"50\" height=\"50\">   \r\n");
      out.write("         \t\t\t</div>\r\n");
      out.write("         \t\t\t\t<div><h5 class=\"text-center\">Jorge Mena Muñoz</h5></div>\r\n");
      out.write("         \t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("          \t</div>\r\n");
      out.write("          </div>\r\n");
      out.write("     <br></br>\r\n");
      out.write("  </div>\r\n");
      out.write("\t <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("    \t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t  <table id=\"dtDynamicVerticalScrollExample\" class=\"table table-striped table-bordered table-sm\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t  <thead>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <th class=\"th-sm\">Hora\r\n");
      out.write("\t\t\t      </th>\r\n");
      out.write("\t\t\t      <th class=\"th-sm\">Fecha\r\n");
      out.write("\t\t\t      </th>\r\n");
      out.write("\t\t\t      <th class=\"th-sm\">Especialidad\r\n");
      out.write("\t\t\t      </th>\r\n");
      out.write("\t\t\t      <th class=\"th-sm\">Nombre Médico\r\n");
      out.write("\t\t\t      </th>\r\n");
      out.write("\t\t\t      <th class=\"th-sm\">Centro Sanitario\r\n");
      out.write("\t\t\t      </th>\r\n");
      out.write("\t\t\t      <th class=\"th-sm\">Opciones\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t  </thead>\r\n");
      out.write("\t\t\t  <tbody>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>17:15</td>\r\n");
      out.write("\t\t\t      <td>24/05/2019</td>\r\n");
      out.write("\t\t\t      <td>Alergología</td>\r\n");
      out.write("\t\t\t      <td>Rosa Zamora</td>\r\n");
      out.write("\t\t\t      <td>Hospital Universitario</td>\r\n");
      out.write("\t\t\t      <td>\r\n");
      out.write("\t\t\t      \t<a href = \"/\" class=\"btn btn-primary btn-large\" type=\"submit\"><img src=\"https://image.flaticon.com/icons/png/512/39/39220.png\" class=\"img-fluid rounded\" width=\"30\" height=\"30\"></a>\r\n");
      out.write("\t\t\t      </td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>18:30</td>\r\n");
      out.write("\t\t\t      <td>28/06/2019</td>\r\n");
      out.write("\t\t\t      <td>Pediatría</td>\r\n");
      out.write("\t\t\t      <td>Jose Antonio Pérez</td>\r\n");
      out.write("\t\t\t      <td>Hospital Universitario</td>\r\n");
      out.write("\t\t\t      <td>\r\n");
      out.write("\t\t\t      \t<a href = \"/\" class=\"btn btn-primary btn-large\" type=\"submit\"><img src=\"https://image.flaticon.com/icons/png/512/39/39220.png\" class=\"img-fluid rounded\" width=\"30\" height=\"30\"></a>\r\n");
      out.write("\t\t\t      </td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t  </tbody>\r\n");
      out.write("\t\t</table>  \r\n");
      out.write("  </div>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div><p><a class=\"btn btn-primary btn-large\">Modificar Cita &raquo;</a></p></div>  \r\n");
      out.write("  </div>\r\n");
      out.write("  </br>\r\n");
      out.write("\r\n");
      out.write("</main><!-- /.container -->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
