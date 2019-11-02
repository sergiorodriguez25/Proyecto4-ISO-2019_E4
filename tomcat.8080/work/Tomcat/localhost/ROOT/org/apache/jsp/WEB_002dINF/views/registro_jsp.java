
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Registro</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("  \t \r\n");
      out.write("  \t <link rel=\"stylesheet\" href=\"datePicker/css/bootstrap-datepicker.css\">\r\n");
      out.write("    <script src=\"datePicker/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"datePicker/locales/bootstrap-datepicker.es.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.min.css\">\r\n");
      out.write("  \t \r\n");
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
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        $( document ).ready(function() {\r\n");
      out.write("            $('#fecha').datepicker();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
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
      out.write("  <a class=\"navbar-brand\" href=\"/\">THE GOOD HEALTH</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
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
      out.write("            \t\t<h4>Registro</h4>\r\n");
      out.write("            \t\t<p>Bienvenido/a a la página de registro. Por favor rellene todos los campos que encontrará a continuación, después pulse en el botón de Enviar.</p>\r\n");
      out.write("         \t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("     <br></br>\r\n");
      out.write("  </div>\r\n");
      out.write("\t \r\n");
      out.write("\t  <div class=\"col-md-8 order-md-1\">\r\n");
      out.write("      <form class=\"needs-validation\" novalidate>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"nombre\">Nombre</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"nombre\" placeholder=\"\" value=\"\" required>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("            <label id=\"labelNombreMal\"></label>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"apellidos\">Apellidos</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"apellidos\" placeholder=\"\" value=\"\" required>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("            <label id=\"labelApellidosMal\"></label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"dni\">DNI</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"dni\" placeholder=\"00000000X\" required>\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("          <label id=\"labelDNIMal\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"fecha_ini\">Fecha de nacimiento</label>\r\n");
      out.write("          <input type=\"text\" id=\"fecha_ini\" class=\"form-control\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("          <label id=\"labelFechaMal\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"domicilio\">Domicilio</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"domicilio\" placeholder=\"Calle de residencia N0 0X\" required>\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <label id=\"labelDomicilioMal\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"poblacion\">Población</label>\r\n");
      out.write("            <select class=\"custom-select d-block w-100\" id=\"poblacion\" required>\r\n");
      out.write("              <option value=\"\">Elige...</option>\r\n");
      out.write("              <option>Álava</option>\r\n");
      out.write("              <option>Albacete</option>\r\n");
      out.write("              <option>Alicante</option>\r\n");
      out.write("              <option>Almería</option>\r\n");
      out.write("              <option>Asturias</option>\r\n");
      out.write("              <option>Ávila</option>\r\n");
      out.write("              <option>Badajoz</option>\r\n");
      out.write("              <option>Barcelona</option>\r\n");
      out.write("              <option>Burgos</option>\r\n");
      out.write("              <option>Cáceres</option>\r\n");
      out.write("              <option>Cádiz</option>\r\n");
      out.write("              <option>Cantabria</option>\r\n");
      out.write("              <option>Castellón</option>\r\n");
      out.write("              <option>Ceuta</option>\r\n");
      out.write("              <option>Ciudad Real</option>\r\n");
      out.write("              <option>Córdoba</option>\r\n");
      out.write("              <option>Cuenca</option>\r\n");
      out.write("              <option>Gerona</option>\r\n");
      out.write("              <option>Granada</option>\r\n");
      out.write("              <option>Guadalajara</option>\r\n");
      out.write("              <option>Guipúzcoa</option>\r\n");
      out.write("              <option>Huelva</option>\r\n");
      out.write("              <option>Huesca</option>\r\n");
      out.write("              <option>Islas Baleares</option>\r\n");
      out.write("              <option>Jaén</option>\r\n");
      out.write("              <option>La Coruña</option>\r\n");
      out.write("              <option>La Rioja</option>\r\n");
      out.write("              <option>Las Palmas</option>\r\n");
      out.write("              <option>León</option>\r\n");
      out.write("              <option>Lérida</option>\r\n");
      out.write("              <option>Lugo</option>\r\n");
      out.write("              <option>Madrid</option>\r\n");
      out.write("              <option>Málaga</option>\r\n");
      out.write("              <option>Melilla</option>\r\n");
      out.write("              <option>Murcia</option>\r\n");
      out.write("              <option>Navarra</option>\r\n");
      out.write("              <option>Orense</option>\r\n");
      out.write("              <option>Palencia</option>\r\n");
      out.write("              <option>Pontevedra</option>\r\n");
      out.write("              <option>Salamanca</option>\r\n");
      out.write("              <option>Segovia</option>\r\n");
      out.write("              <option>Sevilla</option>\r\n");
      out.write("              <option>Soria</option>\r\n");
      out.write("              <option>Tarragona</option>\r\n");
      out.write("              <option>Tenerife</option>\r\n");
      out.write("              <option>Teruel</option>\r\n");
      out.write("              <option>Toledo</option>\r\n");
      out.write("              <option>Valencia</option>\r\n");
      out.write("              <option>Valladolid</option>\r\n");
      out.write("              <option>Vizcaya</option>\r\n");
      out.write("              <option>Zamora</option>\r\n");
      out.write("              <option>Zaragoza</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("            <label id=\"labelPoblacionMal\"></label>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("            <label for=\"cp\">Código postal</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"cp\" placeholder=\"\" value=\"\" required>\r\n");
      out.write("            <div class=\"invalid-feedback\">\r\n");
      out.write("              Información necesaria.\r\n");
      out.write("            </div>\r\n");
      out.write("            <label id=\"labelCpMal\"></label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"telefono\">Teléfono<span class=\"text-muted\"></span></label>\r\n");
      out.write("          <input type=\"telefono\" class=\"form-control\" id=\"telefono\" placeholder=\"\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("          <label id=\"labelTelefonoMal\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"email\">Correo electrónico<span class=\"text-muted\">(Optional)</span></label>\r\n");
      out.write("          <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"tu@ejemplo.com\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("          <label id=\"labelEmailMal\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"contraseña1\">Contraseña<span class=\"text-muted\"></span></label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"contraseña\" placeholder=\"\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("          <label id=\"labelContraseñaMal\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"contraseña2\">Repita la contraseña<span class=\"text-muted\"></span></label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"RepetirContraseña\" placeholder=\"\">\r\n");
      out.write("          <div class=\"invalid-feedback\">\r\n");
      out.write("            Información necesaria.\r\n");
      out.write("          </div>\r\n");
      out.write("          <label id=\"labelRepetirContraseñaMal\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <hr class=\"mb-4\">\r\n");
      out.write("        <a id = \"registrarUsuario\" class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Enviar</a>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\t \r\n");
      out.write("  <br>\r\n");
      out.write("  </div>\r\n");
      out.write("  </br>\r\n");
      out.write("\r\n");
      out.write("</main><!-- /.container -->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    jQuery(document).ready(function($) {\r\n");
      out.write("//     \tvar referrer = document.referrer;\r\n");
      out.write("//     \tif(referrer != 'http://localhost:8080/'){\r\n");
      out.write("//     \t\tvar forma = document.forms[0];\r\n");
      out.write("//             forma.action=\"/error\";\r\n");
      out.write("//             forma.submit(); \r\n");
      out.write("//     \t}\r\n");
      out.write("    \t$('#registrarUsuario').click(function(event) {\r\n");
      out.write("    \t\tif(!(comprobarNombre(document.getElementById(\"nombre\").value) + comprobarApellidos(document.getElementById(\"apellidos\").value) + comprobarDNI(document.getElementById(\"dni\").value) + comprobarFecha(document.getElementById(\"fecha_ini\").value) + comprobarDomicilio(document.getElementById(\"domicilio\").value) + comprobarPoblacion(document.getElementById(\"poblacion\").value) + comprobarCp(document.getElementById(\"cp\").value) + comprobarTelefono(document.getElementById(\"telefono\").value) + comprobarEmail(document.getElementById(\"email\").value) + comprobarContraseña(document.getElementById(\"contraseña\").value) + comprobarRepetirContraseña(document.getElementById(\"RepetirContraseña\").value) + coincidenContraseñas(document.getElementById(\"contraseña\").value, document.getElementById(\"RepetirContraseña\").value)) != 0){\r\n");
      out.write("    \t\t\tevent.preventDefault();\r\n");
      out.write("        \t\tenviarDatos();\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t});\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    var caracterInvalido=\"0123456789ºª\\!|@·#$%&¬/()=?¿¡/<>*-+,;:^'.`[]{}_\";\r\n");
      out.write("  \tvar numeros=\"0123456789\";\r\n");
      out.write("  \tvar mayusculas=\"ABCDEFGHIJKLMNÑOPQRSTUVWXYZ\";\r\n");
      out.write("  \tvar simbolo=\"<>ºª\\!|@·#$%&¬/()=?¿¡/*-+,;:^.`[]{}_\";\r\n");
      out.write("    \r\n");
      out.write("\tfunction enviarDatos(){\r\n");
      out.write("\t\tvar data = {\r\n");
      out.write("\t\t\tnombre : $('#nombre').val(),\r\n");
      out.write("\t\t\tapellidos : $('#apellidos').val(),\r\n");
      out.write("\t\t\tDNI : $('#dni').val(),\r\n");
      out.write("\t\t\tnacimiento : $('#fecha_ini').val(),\r\n");
      out.write("\t\t\tdomicilio : $('#domicilio').val(),\r\n");
      out.write("\t\t\tpoblacion : $('#poblacion').val(),\r\n");
      out.write("\t\t\tcp : $('#cp').val(),\r\n");
      out.write("\t\t\ttelefono : $('#telefono').val(),\r\n");
      out.write("\t\t\temail : $('#email').val(),\r\n");
      out.write("\t\t\tpassword : $('#contraseña').val(),\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tvar url = \"/registro\";\r\n");
      out.write("\t\tvar type = \"POST\";\r\n");
      out.write("\t\tvar success;\r\n");
      out.write("\t\tvar xhrFields;\r\n");
      out.write("\t\tvar headers = {\r\n");
      out.write("\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdata = JSON.stringify(data);\r\n");
      out.write("\t\tconsole.log(data);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: type,\r\n");
      out.write("\t\t\turl: url,\r\n");
      out.write("\t\t\tdata: data,\r\n");
      out.write("\t        headers : headers,\r\n");
      out.write("\t        xhrFields: {\r\n");
      out.write("\t            withCredentials: true\r\n");
      out.write("\t        },\r\n");
      out.write("\t        success : RegisterOK,\r\n");
      out.write("\t        error : RegisterError\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tfunction RegisterOK(respuesta) {\r\n");
      out.write("\t\tconsole.log(respuesta);\r\n");
      out.write("\t\tvar jso = JSON.parse(respuesta);\r\n");
      out.write("        console.log(\"Registro completado\");\r\n");
      out.write("        var apellidosCodificado = encode_utf8(jso.resultado.usuario.apellidos);\r\n");
      out.write("\t\tvar nombreCodificado = encode_utf8(jso.resultado.usuario.nombre);\r\n");
      out.write("        location.href=\"/citas?nombre=\"+nombreCodificado+\"&apellidos=\"+apellidosCodificado;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\tfunction RegisterError() {\r\n");
      out.write("        console.log(\"Ya existe el dni\");\r\n");
      out.write("        window.alert(\"El DNI que ha introducido ya está en uso.\");\r\n");
      out.write("        $('#nombre').val(\"\");\r\n");
      out.write("        $('#apellidos').val(\"\");\r\n");
      out.write("        $('#dni').val(\"\");\r\n");
      out.write("        $('#fecha_ini').val(\"\");\r\n");
      out.write("        $('#domicilio').val(\"\");\r\n");
      out.write("        $('#poblacion').val(\"\");\r\n");
      out.write("        $('#cp').val(\"\");\r\n");
      out.write("        $('#telefono').val(\"\");\r\n");
      out.write("        $('#email').val(\"\");\r\n");
      out.write("        $('#contraseña').val(\"\");\r\n");
      out.write("        $('#RepetirContraseña').val(\"\");\r\n");
      out.write("    }\r\n");
      out.write("\tfunction encode_utf8(s) {\r\n");
      out.write("\t\t  return unescape(encodeURIComponent(s));\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("    function comprobarNombre(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelNombreMal\").style.display = 'none';\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelNombreMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelNombreMal').html(\"El nombre es obligatorio.\");\r\n");
      out.write("       \t        $('#labelNombreMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("\r\n");
      out.write("       \t   for(i=0; i<texto.length; i++){\r\n");
      out.write("       \t      if (caracterInvalido.indexOf(texto.charAt(i),0)!=-1){\r\n");
      out.write("       \t    \tdocument.getElementById(\"labelNombreMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelNombreMal').html(\"El nombre no es válido.\");\r\n");
      out.write("       \t        $('#labelNombreMal').css(\"color\", \"red\");\r\n");
      out.write("       \t         return 1;  //si devuelve 1 es un caracter invalido,  ver si es necesario que tenga return\r\n");
      out.write("       \t      }\r\n");
      out.write("       \t   }\r\n");
      out.write("       \t   return 0;  //si devuelve 0 es porque vale\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarApellidos(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelApellidosMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelApellidosMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelApellidosMal').html(\"Los apellidos son obligatorios.\");\r\n");
      out.write("       \t        $('#labelApellidosMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("       \t\tfor(i=0; i<texto.length; i++){\r\n");
      out.write("       \t      if (caracterInvalido.indexOf(texto.charAt(i),0)!=-1){\r\n");
      out.write("       \t    \tdocument.getElementById(\"labelApellidosMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelApellidosMal').html(\"Los apellidos no son válidos.\");\r\n");
      out.write("       \t        $('#labelApellidosMal').css(\"color\", \"red\");\r\n");
      out.write("       \t        return 1;  //si devuelve 1 es un caracter invalido,  ver si es necesario que tenga return\r\n");
      out.write("       \t      }\r\n");
      out.write("       \t   }\r\n");
      out.write("       \t   return 0;  //si devuelve 0 es porque vale\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarDNI(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelDNIMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelDNIMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelDNIMal').html(\"El DNI es obligatorio.\");\r\n");
      out.write("       \t        $('#labelDNIMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\tif (texto.length != 9) {\r\n");
      out.write("       \t    \tdocument.getElementById(\"labelDNIMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelDNIMal').html(\"El DNI no es válido.\");\r\n");
      out.write("       \t        $('#labelDNIMal').css(\"color\", \"red\");\r\n");
      out.write("       \t        return 1;  //si devuelve 1 es un caracter invalido,  ver si es necesario que tenga return\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t\tfor(i=0; i<texto.length; i++){\r\n");
      out.write("      \t\t\tif (i==8){\r\n");
      out.write("      \t\t\t\tif (/[A-Z]/.test(texto.charAt(i)) == false) {\r\n");
      out.write("      \t       \t    \tdocument.getElementById(\"labelDNIMal\").style.display = 'inline';\r\n");
      out.write("      \t       \t        $('#labelDNIMal').html(\"El DNI no es válido.\");\r\n");
      out.write("      \t       \t        $('#labelDNIMal').css(\"color\", \"red\");\r\n");
      out.write("      \t       \t        return 1;\r\n");
      out.write("      \t\t\t\t}\r\n");
      out.write("      \t\t\t}\r\n");
      out.write("      \t\t\telse{\r\n");
      out.write("      \t\t\t\tif (isNaN(texto.charAt(i)) == true) {\r\n");
      out.write("      \t       \t    \tdocument.getElementById(\"labelDNIMal\").style.display = 'inline';\r\n");
      out.write("      \t       \t        $('#labelDNIMal').html(\"El DNI no es válido.\");\r\n");
      out.write("      \t       \t        $('#labelDNIMal').css(\"color\", \"red\");\r\n");
      out.write("      \t       \t        return 1;\r\n");
      out.write("      \t\t\t\t}\r\n");
      out.write("      \t\t\t}\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarFecha(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelFechaMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelFechaMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelFechaMal').html(\"La fecha de nacimiento es obligatoria.\");\r\n");
      out.write("       \t        $('#labelFechaMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarDomicilio(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelDomicilioMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelDomicilioMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelDomicilioMal').html(\"El domicilio es obligatorio.\");\r\n");
      out.write("       \t        $('#labelDomicilioMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarPoblacion(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelPoblacionMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelPoblacionMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelPoblacionMal').html(\"La población es obligatoria.\");\r\n");
      out.write("       \t        $('#labelPoblacionMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarCp(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelCpMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelCpMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelCpMal').html(\"El código postal es obligatorio.\");\r\n");
      out.write("       \t        $('#labelCpMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\tif (isNaN(texto) == true) {\r\n");
      out.write("       \t    \tdocument.getElementById(\"labelCpMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelCpMal').html(\"El código postal no es válido.\");\r\n");
      out.write("       \t        $('#labelCpMal').css(\"color\", \"red\");\r\n");
      out.write("       \t        return 1;  //si devuelve 1 es un caracter invalido,  ver si es necesario que tenga return\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarTelefono(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelTelefonoMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelTelefonoMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelTelefonoMal').html(\"El telefono es obligatorio.\");\r\n");
      out.write("       \t        $('#labelTelefonoMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\tif (isNaN(texto) == true) {\r\n");
      out.write("       \t    \tdocument.getElementById(\"labelTelefonoMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelTelefonoMal').html(\"El telefono no es válido.\");\r\n");
      out.write("       \t        $('#labelTelefonoMal').css(\"color\", \"red\");\r\n");
      out.write("       \t        return 1;  //si devuelve 1 es un caracter invalido,  ver si es necesario que tenga return\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarEmail(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelEmailMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelEmailMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelEmailMal').html(\"El correo electrónico es obligatorio.\");\r\n");
      out.write("       \t        $('#labelEmailMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarContraseña(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelContraseñaMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelContraseñaMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelContraseñaMal').html(\"La contraseña es obligatoria.\");\r\n");
      out.write("       \t        $('#labelContraseñaMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t\tif (comprobarSeguridadContraseña(texto) == false) {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelContraseñaMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelContraseñaMal').html(\"La contraseña debe tener 8 caracteres, una mayúscula, un número y un caracter especial\");\r\n");
      out.write("       \t        $('#labelContraseñaMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("\r\n");
      out.write("      \tfunction comprobarSeguridadContraseña(texto){\r\n");
      out.write("\t\t\tif (texto.length < 8) {\r\n");
      out.write("      \t\t\tconsole.log(\"mal\");\r\n");
      out.write("      \t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\thayNumero = false\r\n");
      out.write("\t       \tfor(i=0; i<texto.length; i++){\r\n");
      out.write("\t        \tif (numeros.indexOf(texto.charAt(i))>=0){\r\n");
      out.write("\t        \t\thayNumero = true;\r\n");
      out.write("\t            }\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t\tif (hayNumero == false){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\thayMayuscula = false\r\n");
      out.write("\t       \tfor(i=0; i<texto.length; i++){\r\n");
      out.write("\t        \tif (mayusculas.indexOf(texto.charAt(i))>=0){\r\n");
      out.write("\t        \t\thayMayuscula = true;\r\n");
      out.write("\t            }\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t\tif (hayMayuscula == false){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\thaySimbolo = false\r\n");
      out.write("\t       \tfor(i=0; i<texto.length; i++){\r\n");
      out.write("\t        \tif (simbolo.indexOf(texto.charAt(i))>=0){\r\n");
      out.write("\t        \t\thaySimbolo = true;\r\n");
      out.write("\t            }\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t\tif (haySimbolo == false){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("      \t\treturn true;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction comprobarRepetirContraseña(texto){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelRepetirContraseñaMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (texto == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelRepetirContraseñaMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelRepetirContraseñaMal').html(\"La repetición de contraseña es obligatoria.\");\r\n");
      out.write("       \t        $('#labelRepetirContraseóaMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\t\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      \tfunction coincidenContraseñas(c1, c2){\r\n");
      out.write("      \t\tdocument.getElementById(\"labelRepetirContraseñaMal\").style.display = 'none';\r\n");
      out.write("      \t\tif (c2 == '') {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelRepetirContraseñaMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelRepetirContraseñMal').html(\"La repetición de contraseña es obligatoria.\");\r\n");
      out.write("       \t        $('#labelRepetirContraseñaMal').css(\"color\", \"red\");\r\n");
      out.write("      \t\t\treturn 1;\r\n");
      out.write("      \t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (c1 != c2) {\r\n");
      out.write("      \t\t\tdocument.getElementById(\"labelRepetirContraseñaMal\").style.display = 'inline';\r\n");
      out.write("       \t        $('#labelRepetirContraseñaMal').html(\"Las contraseñas no coinciden, inténtalo de nuevo.\");\r\n");
      out.write("       \t        $('#labelRepetirContraseñaMal').css(\"color\", \"red\");\r\n");
      out.write("       \t     \treturn 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("      \t\treturn 0;\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("    </script>\r\n");
      out.write("  \t<script>\r\n");
      out.write("\r\n");
      out.write("  \t\t$('#fecha_ini').datepicker({\r\n");
      out.write("        \tformat: \"dd/mm/yyyy\",\r\n");
      out.write("        \tstartDate: \"1/1/1900\",\r\n");
      out.write("        \tendDate: \"13/10/2019\",\r\n");
      out.write("        \ttodayBtn: \"linked\",\r\n");
      out.write("        \tlanguage: \"es\",\r\n");
      out.write("        \ttodayHighlight: true\r\n");
      out.write("    \t});\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
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
