/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-04-20 13:14:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>首页</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/index.css\">\r\n");
      out.write("    <script src=\"static/js/jQueryLib.js\"></script>\r\n");
      out.write("    <script src=\"static/js/index.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"intro\">\r\n");
      out.write("        <div class=\"aboutMe\">\r\n");
      out.write("            <img src=\"static/img/logo.png\" alt=\"\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <span>About Me</span>\r\n");
      out.write("                <p class=\"info\">\r\n");
      out.write("                    北溟鱼from NJU SE\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"info welcome\">\r\n");
      out.write("                    欢迎来到七号公园自习室\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"info\">\r\n");
      out.write("                    一个由于在学习过程中心血来潮诞生的简单的小玩意\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"info\">\r\n");
      out.write("                    个人博客：\r\n");
      out.write("                    <a href=\"https://7th-park.github.io/\">https://7th-park.github.io/</a>\r\n");
      out.write("                </p>\r\n");
      out.write("                <div class=\"share\">\r\n");
      out.write("                    <a href=\"https://github.com/7th-Park\"><svg viewBox=\"0 0 16 16\" class=\"bi bi-github\" fill=\"currentColor\" height=\"16\" width=\"16\"\r\n");
      out.write("                            xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                            <path\r\n");
      out.write("                                d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.012 8.012 0 0 0 16 8c0-4.42-3.58-8-8-8z\">\r\n");
      out.write("                            </path>\r\n");
      out.write("                        </svg></a>\r\n");
      out.write("                    <!-- <a href=\"#\">&nbsp;&nbsp;<svg viewBox=\"0 0 16 16\" class=\"bi bi-twitter\" fill=\"currentColor\"\r\n");
      out.write("                            height=\"16\" width=\"16\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                            <path\r\n");
      out.write("                                d=\"M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z\">\r\n");
      out.write("                            </path>\r\n");
      out.write("                        </svg>&nbsp;&nbsp;</a>\r\n");
      out.write("                    <a href=\"#\">&nbsp;&nbsp;<svg viewBox=\"0 0 16 16\" class=\"bi bi-instagram\" fill=\"currentColor\"\r\n");
      out.write("                            height=\"16\" width=\"16\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                            <path\r\n");
      out.write("                                d=\"M8 0C5.829 0 5.556.01 4.703.048 3.85.088 3.269.222 2.76.42a3.917 3.917 0 0 0-1.417.923A3.927 3.927 0 0 0 .42 2.76C.222 3.268.087 3.85.048 4.7.01 5.555 0 5.827 0 8.001c0 2.172.01 2.444.048 3.297.04.852.174 1.433.372 1.942.205.526.478.972.923 1.417.444.445.89.719 1.416.923.51.198 1.09.333 1.942.372C5.555 15.99 5.827 16 8 16s2.444-.01 3.298-.048c.851-.04 1.434-.174 1.943-.372a3.916 3.916 0 0 0 1.416-.923c.445-.445.718-.891.923-1.417.197-.509.332-1.09.372-1.942C15.99 10.445 16 10.173 16 8s-.01-2.445-.048-3.299c-.04-.851-.175-1.433-.372-1.941a3.926 3.926 0 0 0-.923-1.417A3.911 3.911 0 0 0 13.24.42c-.51-.198-1.092-.333-1.943-.372C10.443.01 10.172 0 7.998 0h.003zm-.717 1.442h.718c2.136 0 2.389.007 3.232.046.78.035 1.204.166 1.486.275.373.145.64.319.92.599.28.28.453.546.598.92.11.281.24.705.275 1.485.039.843.047 1.096.047 3.231s-.008 2.389-.047 3.232c-.035.78-.166 1.203-.275 1.485a2.47 2.47 0 0 1-.599.919c-.28.28-.546.453-.92.598-.28.11-.704.24-1.485.276-.843.038-1.096.047-3.232.047s-2.39-.009-3.233-.047c-.78-.036-1.203-.166-1.485-.276a2.478 2.478 0 0 1-.92-.598 2.48 2.48 0 0 1-.6-.92c-.109-.281-.24-.705-.275-1.485-.038-.843-.046-1.096-.046-3.233 0-2.136.008-2.388.046-3.231.036-.78.166-1.204.276-1.486.145-.373.319-.64.599-.92.28-.28.546-.453.92-.598.282-.11.705-.24 1.485-.276.738-.034 1.024-.044 2.515-.045v.002zm4.988 1.328a.96.96 0 1 0 0 1.92.96.96 0 0 0 0-1.92zm-4.27 1.122a4.109 4.109 0 1 0 0 8.217 4.109 4.109 0 0 0 0-8.217zm0 1.441a2.667 2.667 0 1 1 0 5.334 2.667 2.667 0 0 1 0-5.334z\">\r\n");
      out.write("                            </path>\r\n");
      out.write("                        </svg>&nbsp;&nbsp;</a>\r\n");
      out.write("                    <a href=\"#\">&nbsp;&nbsp;<svg viewBox=\"0 0 16 16\" class=\"bi bi-youtube\" fill=\"currentColor\"\r\n");
      out.write("                            height=\"16\" width=\"16\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                            <path\r\n");
      out.write("                                d=\"M8.051 1.999h.089c.822.003 4.987.033 6.11.335a2.01 2.01 0 0 1 1.415 1.42c.101.38.172.883.22 1.402l.01.104.022.26.008.104c.065.914.073 1.77.074 1.957v.075c-.001.194-.01 1.108-.082 2.06l-.008.105-.009.104c-.05.572-.124 1.14-.235 1.558a2.007 2.007 0 0 1-1.415 1.42c-1.16.312-5.569.334-6.18.335h-.142c-.309 0-1.587-.006-2.927-.052l-.17-.006-.087-.004-.171-.007-.171-.007c-1.11-.049-2.167-.128-2.654-.26a2.007 2.007 0 0 1-1.415-1.419c-.111-.417-.185-.986-.235-1.558L.09 9.82l-.008-.104A31.4 31.4 0 0 1 0 7.68v-.123c.002-.215.01-.958.064-1.778l.007-.103.003-.052.008-.104.022-.26.01-.104c.048-.519.119-1.023.22-1.402a2.007 2.007 0 0 1 1.415-1.42c.487-.13 1.544-.21 2.654-.26l.17-.007.172-.006.086-.003.171-.007A99.788 99.788 0 0 1 7.858 2h.193zM6.4 5.209v4.818l4.157-2.408L6.4 5.209z\">\r\n");
      out.write("                            </path>\r\n");
      out.write("                        </svg></a> -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"functions\">\r\n");
      out.write("            <p class=\"login\" id=\"login\">\r\n");
      out.write("                <span>\r\n");
      out.write("                    <a href=\"/loginOrInformation\" >\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.get(\"user\") ? sessionScope.get(\"user\").userAccount : \"登录\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                </span>\r\n");
      out.write("            </p>\r\n");
      out.write("            <p id=\"record\"><span>自习记录</span></p>\r\n");
      out.write("            <p id=\"rank\"><span>排行榜</span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"rooms\">\r\n");
      out.write("        <div class=\"room common kyroom\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <p class=\"title\">考研自习室</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cover\">\r\n");
      out.write("                <img src=\"static/img/考研自习室.jpg\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"room common gkroom\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <p class=\"title\">高考自习室</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cover\">\r\n");
      out.write("                <img src=\"static/img/高考自习室.jpg\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"room common rcroom\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <p class=\"title\">普通自习室</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cover\">\r\n");
      out.write("                <img src=\"static/img/普通自习室.jpg\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"announceDiv\">\r\n");
      out.write("            <div id=\"update\">\r\n");
      out.write("                <span class=\"head1\"> 网站更新</span>\r\n");
      out.write("                <p>前端部分：自习室首页，用户登录、注册、信息页面，每间自习室内部页面</p>\r\n");
      out.write("                <p>后端部分：用户注册、登录、修改信息、退出登录完成，自习时间记录</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
