/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2019-11-28 18:57:35 UTC
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("<link rel=\"canonical\"\r\n");
      out.write("\thref=\"https://getbootstrap.com/docs/3.4/examples/signin/\">\r\n");
      out.write("\r\n");
      out.write("<title>Citas</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("<link href=\"../../assets/css/ie10-viewport-bug-workaround.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"signin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("<!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("<script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".bd-placeholder-img {\r\n");
      out.write("\tfont-size: 1.125rem;\r\n");
      out.write("\ttext-anchor: middle;\r\n");
      out.write("\t-webkit-user-select: none;\r\n");
      out.write("\t-moz-user-select: none;\r\n");
      out.write("\t-ms-user-select: none;\r\n");
      out.write("\tuser-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( min-width : 768px) {\r\n");
      out.write("\t.bd-placeholder-img-lg {\r\n");
      out.write("\t\tfont-size: 3.5rem;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"starter-template.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\">THE GOOD HEALTH</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarsExampleDefault\"\r\n");
      out.write("\t\t\taria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">Mis\r\n");
      out.write("\t\t\t\t\t\tcitas <span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"/formularioCitas\" tabindex=\"-1\" aria-disabled=\"true\">Pedir\r\n");
      out.write("\t\t\t\t\t\tcita</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown01\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Cuenta</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Mi Perfil</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" data-toggle=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#informacion\">Información</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"/\">Cerrar sesión</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<main role=\"main\" class=\"container\">\r\n");
      out.write("\t\t<div class=\"span\">\r\n");
      out.write("\t\t\t<div></div>\r\n");
      out.write("\t\t\t<div class=\"hero-unit\">\r\n");
      out.write("\t\t\t\t<br></br> </br> </br>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Mis Citas</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tBienvenido/a a la página de \"Mis citas\" en la que aparecen\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttodas las citas que tiene programadas. Si desea modificar(<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/png/512/23/23187.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded\" width=\"25\" height=\"25\">) o\r\n");
      out.write("\t\t\t\t\t\t\t\t\tanular(<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/png/512/39/39220.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded\" width=\"25\" height=\"25\">) una\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcita, pulse el botón de la acción que quiera realizar y que se\r\n");
      out.write("\t\t\t\t\t\t\t\t\tencuentra a la derecha de la cita con la que quiera\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinteractuar.\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal fade\" id=\"informacion\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"dialog\" aria-labelledby=\"exampleModalLongTitle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLongTitle\">Información</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tEn esta vista usted puede:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5>Pedir cita</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tSolicitar una cita, para ello deberá tener un centro médico\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tasignado.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tModificar cita(<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/png/512/23/23187.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded\" width=\"25\" height=\"25\">)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tA través de este botón usted podrá modificar una de sus\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tpróximas citas, el día y su hora.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tEliminar cita(<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/png/512/39/39220.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded\" width=\"25\" height=\"25\">)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tA través de este botón usted podrá eliminar una de sus\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tpróximas citas.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tSi desea pedir una cita pulse el botón <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"/formularioCitas\" class=\"btn btn-primary btn-large\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"submit\">Pedir Cita</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"volverMedico\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPara volver a la interfaz de Médico pulse el botón <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"/medico\" class=\"btn btn-primary btn-large\" type=\"submit\">Médico</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"volverGestor\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPara volver a la página principal de Gestor pulse el botón <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"gestor\" class=\"btn btn-primary btn-large\" type=\"submit\">Gestor</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"getParametersURL\"></form>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label id=\"nombreApellidos\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div align='center'>\r\n");
      out.write("\t\t\t\t\t\t<h2>Lista de Citas</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<table id=\"Table\" class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" scope=\"col\"><b>Hora</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" scope=\"col\"><b>Fecha</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" scope=\"col\"><b>Especialidad</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" scope=\"col\"><b>Médico</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" scope=\"col\"><b>Centro</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<div align='center'>\r\n");
      out.write("\t\t\t\t\t\t<label id=\"noHayCitas\"></label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\t * Control para que no acceda a travis de la url a alguna página que no sea el home\r\n");
      out.write("\t\t * Hay que ponerlo en todos los jsp que se hagan próximamente\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\tvar referrer = document.referrer;\r\n");
      out.write("\t\tif (referrer != 'http://localhost:8080/'\r\n");
      out.write("\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/'\r\n");
      out.write("\t\t\t\t&& referrer != 'http://localhost:8080/registro'\r\n");
      out.write("\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/registro'\r\n");
      out.write("\t\t\t\t\t&& referrer != 'http://the-good-health.herokuapp.com/registro'\r\n");
      out.write("\t\t\t\t\t\t&& referrer != 'the-good-health.herokuapp.com/registro'\r\n");
      out.write("\t\t\t\t&& referrer != 'http://localhost:8080/formularioCitas'\r\n");
      out.write("\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/formularioCitas'\r\n");
      out.write("\t\t\t\t\t&& referrer != 'http://the-good-health.herokuapp.com/formularioCitas'\r\n");
      out.write("\t\t\t\t\t\t&& referrer != 'the-good-health.herokuapp.com/formularioCitas'\r\n");
      out.write("\t\t\t\t&& referrer != 'http://localhost:8080/citas'\r\n");
      out.write("\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/citas'\r\n");
      out.write("\t\t\t\t\t&& referrer != 'http://the-good-health.herokuapp.com/citas'\r\n");
      out.write("\t\t\t\t\t\t&& referrer != 'the-good-health.herokuapp.com/citas'\r\n");
      out.write("\t\t\t\t&& referrer != 'http://localhost:8080/medico'\r\n");
      out.write("\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/medico'\r\n");
      out.write("\t\t\t\t\t&& referrer != 'http://the-good-health.herokuapp.com/medico'\r\n");
      out.write("\t\t\t\t\t\t&& referrer != 'the-good-health.herokuapp.com/medico'\r\n");
      out.write("\t\t\t\t&& referrer != 'http://localhost:8080/gestor'\r\n");
      out.write("\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/gestor'\r\n");
      out.write("\t\t\t\t\t&& referrer != 'http://the-good-health.herokuapp.com/gestor'\r\n");
      out.write("\t\t\t\t\t\t&& referrer != 'the-good-health.herokuapp.com/gestor'\r\n");
      out.write("\t\t\t\t&& referrer != 'http://localhost:8080/formularioModificar'\r\n");
      out.write("\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/formularioModificar'\r\n");
      out.write("\t\t\t\t\t&& referrer != 'http://the-good-health.herokuapp.com/formularioModificar'\r\n");
      out.write("\t\t\t\t\t\t&& referrer != 'the-good-health.herokuapp.com/formularioModificar'){\r\n");
      out.write("\t\t\tvar forma = document.forms[0];\r\n");
      out.write("\t\t\tforma.action = \"/error\";\r\n");
      out.write("\t\t\tforma.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\r\n");
      out.write("\t\t\tvar tipoUsuario = jsoUser.resultado.tipoUsuario;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(tipoUsuario != \"Medico\"){\r\n");
      out.write("\t\t\t\t$('#volverMedico').hide();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\r\n");
      out.write("\t\t\tvar tipoUsuario = jsoUser.resultado.tipoUsuario;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(tipoUsuario != \"Gestor\"){\r\n");
      out.write("\t\t\t\t$('#volverGestor').hide();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\tjQuery(document).ready(function($) {\r\n");
      out.write("    \t\tenviardni();\r\n");
      out.write("\t\t\tponerNombreApellidos();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction enviardni(){\r\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\r\n");
      out.write("\t\t\tvar data = {\r\n");
      out.write("\t\t\t\t\tDNI : jsoUser.resultado.usuario.dni,\r\n");
      out.write("\t\t\t\t\ttipo : \"mostrar\"\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\tvar url = \"/citas\";\r\n");
      out.write("\t\t\t\tvar type = \"POST\";\r\n");
      out.write("\t\t\t\tvar success;\r\n");
      out.write("\t\t\t\tvar xhrFields;\r\n");
      out.write("\t\t\t\tvar headers = {\r\n");
      out.write("\t\t\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdata = JSON.stringify(data);\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype: type,\r\n");
      out.write("\t\t\t\t\turl: url,\r\n");
      out.write("\t\t\t\t\tdata: data,\r\n");
      out.write("\t\t\t        headers : headers,\r\n");
      out.write("\t\t\t        xhrFields: {\r\n");
      out.write("\t\t\t            withCredentials: true\r\n");
      out.write("\t\t\t        },\r\n");
      out.write("\t\t\t        success : CitasOK,\r\n");
      out.write("\t\t\t        error : CitasError\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction CitasOK(respuesta) {\r\n");
      out.write("\t\t\tconsole.log(respuesta);\r\n");
      out.write("\t\t\tvar jsoCitas = JSON.parse(respuesta);\r\n");
      out.write("\t\t\tconsole.log(jsoCitas);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(jsoCitas.length==0) $('#noHayCitas').html(\"No tienes citas pendientes\");\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tfor (i = 0; i < jsoCitas.length; i++){\r\n");
      out.write("\t\t\t\t\tvar boton = document.createElement(\"modificarCita\"+i);\r\n");
      out.write("\t\t\t\t\tboton.type = \"button\";\r\n");
      out.write("\t\t\t\t\t $(\"#Table\").append('<tr>' + \r\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + '<label id=\\'label0'+i+'\\'>'+ jsoCitas[i].hora +'</label>' + '</td>'+\r\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + '<label id=\\'label1'+i+'\\'>'+ jsoCitas[i].dia +'</label>' + '</td>'+\r\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].especialidad + '</td>'+\r\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].nombreApe + '</td>'+\r\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].centro + '</td>'+\r\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + '<button id=\\'botonModificar'+i+'\\' class=\\'btn btn-primary \\' onClick=\"funcionModificar(this)\">'+ '<img src=\"https://image.flaticon.com/icons/png/512/23/23187.png\" class=\"img-fluid rounded\" width=\"25\" height=\"25\">'+'Modificar'+'</button> ' + '</td>'+ \r\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + '<button id=\\'botonEliminar'+i+'\\' class=\\'btn btn-primary \\' onClick=\"funcionEliminar(this)\">'+'<img src=\"https://image.flaticon.com/icons/png/512/39/39220.png\" class=\"img-fluid rounded\" width=\"25\" height=\"25\">'+'Eliminar</button>' + '</td>'+'</tr>');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction CitasError(respuesta) {\r\n");
      out.write("\t\t\tconsole.log(respuesta);\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction funcionModificar(boton){\r\n");
      out.write("\t\t\t//console.log(boton.parentNode.parentNode.children[0].firstElementChild.innerHTML);\r\n");
      out.write("\t\t\tvar hora = boton.parentNode.parentNode.children[0].firstElementChild.innerHTML;\r\n");
      out.write("\t\t\tvar dia = boton.parentNode.parentNode.children[1].firstElementChild.innerHTML;\r\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\r\n");
      out.write("\t\t\tvar dniPaciente = jsoUser.resultado.usuario.dni;\r\n");
      out.write("\t\t\tconsole.log(boton.parentNode.parentNode.children[3].innerHTML);\r\n");
      out.write("\t\t\tfor(var i=0; i<jsoUser.resultado.grupoMedico.listaMedicos.length; i++){\r\n");
      out.write("\t\t\t\tif(boton.parentNode.parentNode.children[3].innerHTML == (jsoUser.resultado.grupoMedico.listaMedicos[i].nombre + \" \" +jsoUser.resultado.grupoMedico.listaMedicos[i].apellidos)){\r\n");
      out.write("\t\t\t\t\t\tvar dniMedico = jsoUser.resultado.grupoMedico.listaMedicos[i].DNI;\r\n");
      out.write("\t\t\t\t\t\tvar especialidad = jsoUser.resultado.grupoMedico.listaMedicos[i].especialidad;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar jsoModif={\r\n");
      out.write("\t\t\t\t\t\"citaModificar\":[\r\n");
      out.write("\t\t\t\t\t\t{\"dniPaciente\":dniPaciente,\"dia\":dia,\"hora\":hora,\"dniMedico\":dniMedico,\"especialidad\":especialidad}\r\n");
      out.write("\t\t\t\t\t]\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\tsessionStorage.modificar=JSON.stringify(jsoModif);\r\n");
      out.write("\t\t\tconsole.log(jsoModif);\r\n");
      out.write("\t\t\tlocation.href=\"/formularioModificar\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction funcionEliminar(boton){\r\n");
      out.write("\t\t\t//console.log(boton.parentNode.parentNode.children[0].firstElementChild.innerHTML);\r\n");
      out.write("\t\t\tvar hora = boton.parentNode.parentNode.children[0].firstElementChild.innerHTML;\r\n");
      out.write("\t\t\tvar dia = boton.parentNode.parentNode.children[1].firstElementChild.innerHTML;\r\n");
      out.write("\t\t\tvar especialidad = boton.parentNode.parentNode.children[2].innerHTML;\r\n");
      out.write("\t\t\tconsole.log(especialidad);\r\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\r\n");
      out.write("\t\t\tvar dni = jsoUser.resultado.usuario.dni;\r\n");
      out.write("\t\t\tvar listaMed = jsoUser.resultado.grupoMedico.listaMedicos;\r\n");
      out.write("\t\t\tfor(var i=0; i<listaMed.length;i++){\r\n");
      out.write("\t\t\t\tif(listaMed[i].especialidad == especialidad){\r\n");
      out.write("\t\t\t\t\tvar dniMedico = listaMed[i].DNI;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tconsole.log(dniMedico);\r\n");
      out.write("\t\t\tvar data = {\r\n");
      out.write("\t\t\t\t\tDNI : dni,\r\n");
      out.write("\t\t\t\t\tDNIMedico : dniMedico,\r\n");
      out.write("\t\t\t\t\thora : hora,\r\n");
      out.write("\t\t\t\t\tdia : dia,\r\n");
      out.write("\t\t\t\t\ttipo : \"eliminar\"\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\tswal({\r\n");
      out.write("\t\t\t\t  title: \"¿Quiere eliminar esta cita?\",\r\n");
      out.write("\t\t\t\t  text: \"Si pulsa el botón OK dejará de tener asignada la cita\",\r\n");
      out.write("\t\t\t\t  icon: \"warning\",\r\n");
      out.write("\t\t\t\t  buttons: true,\r\n");
      out.write("\t\t\t\t  dangerMode: true,\r\n");
      out.write("\t\t\t\t  buttons: [\"Cancelar\", \"OK\"]\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t.then((willDelete) => {\r\n");
      out.write("\t\t\t\t  if (willDelete) {\r\n");
      out.write("\t\t\t\t\tenviarEliminarCita(data);\r\n");
      out.write("\t\t\t\t    swal(\"Cita eliminada correctamente\", {\r\n");
      out.write("\t\t\t\t      icon: \"success\",\r\n");
      out.write("\t\t\t\t    }).then(function() {\r\n");
      out.write("\t\t\t\t\t\twindow.location.href = \"/citas\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t  } else {\r\n");
      out.write("\t\t\t\t    swal(\"La cita NO se ha eliminado\", {\r\n");
      out.write("\t\t\t\t    \ticon: \"info\"});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction enviarEliminarCita(data) {\r\n");
      out.write("\t\t\tvar url = \"/citas\";\r\n");
      out.write("\t\t\tvar type = \"POST\";\r\n");
      out.write("\t\t\tvar success;\r\n");
      out.write("\t\t\tvar error;\r\n");
      out.write("\t\t\tvar xhrFields;\r\n");
      out.write("\t\t\tvar headers = {\r\n");
      out.write("\t\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdata = JSON.stringify(data);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype: type,\r\n");
      out.write("\t\t\t\turl: url,\r\n");
      out.write("\t\t\t\tdata: data,\r\n");
      out.write("\t\t        headers : headers,\r\n");
      out.write("\t\t        xhrFields: {\r\n");
      out.write("\t\t            withCredentials: true\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        success : ModifElimOK,\r\n");
      out.write("\t\t        error : ModifElimError\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction ModifElimOK(){\r\n");
      out.write("\t\t\tconsole.log(\"OK\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction ModifElimError(){\r\n");
      out.write("\t\t\tconsole.log(\"Error\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction ponerNombreApellidos() {\r\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\r\n");
      out.write("\t\t\tconsole.log(jsoUser.resultado.usuario.nombre);\r\n");
      out.write("\t\t\t$('#nombreApellidos').html(\r\n");
      out.write("\t\t\t\t\tjsoUser.resultado.usuario.nombre + \" \"\r\n");
      out.write("\t\t\t\t\t\t\t+ jsoUser.resultado.usuario.apellidos);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
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
