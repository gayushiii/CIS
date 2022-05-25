package org.apache.jsp.res.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FIR_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Criminal Identification System</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("html {\r\n");
      out.write("   \r\n");
      out.write("  background-size: cover;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* =========================================\r\n");
      out.write("Stark Industries Logo\r\n");
      out.write("========================================= */\r\n");
      out.write("#logo {\r\n");
      out.write("  animation: logo-entry 4s ease-in;\r\n");
      out.write("  width: 500px;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  z-index: 40;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("  animation: text-glow 2s ease-out infinite alternate;\r\n");
      out.write("  font-family: 'Ubuntu', sans-serif;\r\n");
      out.write("  color: #00a4a2;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  font-size: 1.8rem;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  text-shadow: 0 0 10px #000, 0 0 20px #000, 0 0 30px #000, 0 0 40px #000, 0 0 50px #000, 0 0 60px #000, 0 0 70px #000;\r\n");
      out.write("  top: 10px;\r\n");
      out.write("  left: 160px;\r\n");
      out.write("}\r\n");
      out.write("h1:before {\r\n");
      out.write("  animation: before-glow 2s ease-out infinite alternate;\r\n");
      out.write("  border-left: 535px solid transparent;\r\n");
      out.write("  border-bottom: 10px solid #00a4a2;\r\n");
      out.write("  content: ' ';\r\n");
      out.write("  height: 0;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: -74px;\r\n");
      out.write("  top: -10px;\r\n");
      out.write("  width: 0;\r\n");
      out.write("}\r\n");
      out.write("h1:after {\r\n");
      out.write("  animation: after-glow 2s ease-out infinite alternate;\r\n");
      out.write("  border-left: 100px solid transparent;\r\n");
      out.write("  border-top: 16px solid #00a4a2;\r\n");
      out.write("  content: ' ';\r\n");
      out.write("  height: 0;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: -85px;\r\n");
      out.write("  top: 24px;\r\n");
      out.write("  transform: rotate(-47deg);\r\n");
      out.write("  width: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".stark-login button:hover,\r\n");
      out.write(".stark-login button:focus {\r\n");
      out.write("  background: #0C6125;\r\n");
      out.write("  background: linear-gradient(#393939, #292929);\r\n");
      out.write("  color: #00fffc;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  transition: 1s all;\r\n");
      out.write("}\r\n");
      out.write(".stark-login button:active {\r\n");
      out.write("  background: #292929;\r\n");
      out.write("  background: linear-gradient(#393939, #292929);\r\n");
      out.write("  box-shadow: 0 1px 0 #000, inset 1px 0 1px #222;\r\n");
      out.write("  top: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* =========================================\r\n");
      out.write("Animation Keyframes\r\n");
      out.write("========================================= */\r\n");
      out.write("\r\n");
      out.write("@keyframes box-glow {\r\n");
      out.write("  0% {\r\n");
      out.write("    border-color: #00b8b6;\r\n");
      out.write("    box-shadow: 0 0 5px rgba(0, 255, 253, 0.2), inset 0 0 5px rgba(0, 255, 253, 0.1), 0 2px 0 #000;\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    border-color: #00fffc;\r\n");
      out.write("    box-shadow: 0 0 20px rgba(0, 255, 253, 0.6), inset 0 0 10px rgba(0, 255, 253, 0.4), 0 2px 0 #000;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("@keyframes text-glow {\r\n");
      out.write("  0% {\r\n");
      out.write("    color: #00a4a2;\r\n");
      out.write("    text-shadow: 0 0 10px #000, 0 0 20px #000, 0 0 30px #000, 0 0 40px #000, 0 0 50px #000, 0 0 60px #000, 0 0 70px #000;\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    color: #00fffc;\r\n");
      out.write("    text-shadow: 0 0 20px rgba(0, 255, 253, 0.6), 0 0 10px rgba(0, 255, 253, 0.4), 0 2px 0 #000;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("@keyframes before-glow {\r\n");
      out.write("  0% {\r\n");
      out.write("    border-bottom: 10px solid #00a4a2;\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    border-bottom: 10px solid #00fffc;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("@keyframes after-glow {\r\n");
      out.write("  0% {\r\n");
      out.write("    border-top: 16px solid #00a4a2;\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    border-top: 16px solid #00fffc;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("@keyframes circle1 {\r\n");
      out.write("  0% {\r\n");
      out.write("    -moz-transform: rotate(0deg);\r\n");
      out.write("    -ms-transform: rotate(0deg);\r\n");
      out.write("    -webkit-transform: rotate(0deg);\r\n");
      out.write("    transform: rotate(0deg);\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    -moz-transform: rotate(360deg);\r\n");
      out.write("    -ms-transform: rotate(360deg);\r\n");
      out.write("    -webkit-transform: rotate(360deg);\r\n");
      out.write("    transform: rotate(360deg);\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* Reset CSS */\r\n");
      out.write("html, body, div, span, applet, object, iframe,\r\n");
      out.write(" h3, h4, h5, h6, p, blockquote, pre,\r\n");
      out.write("a, abbr, acronym, address, big, cite, code,\r\n");
      out.write("del, dfn, em, font, img, ins, kbd, q, s, samp,\r\n");
      out.write("small, strike, strong, sub, sup, tt, var,\r\n");
      out.write("b, u, i, center,\r\n");
      out.write("dl, dt, dd, ol, ul, li,\r\n");
      out.write("fieldset, form, label, legend,\r\n");
      out.write("table, caption, tbody, tfoot, thead, tr, th, td {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\toutline: 0;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\tvertical-align: baseline;\r\n");
      out.write("\tbackground: transparent;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: #DCDDDF url(http://cssdeck.com/uploads/media/items/7/7AF2Qzt.png);\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tfont: 14px Arial;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("h3{ font-size:18px;}\r\n");
      out.write("h4{ font-size:16px;}\r\n");
      out.write("h5{ font-size:14px;}\r\n");
      out.write("h6{ font-size:12px;}\r\n");
      out.write("h3,h4,h5,h6{ color:#563D64;}\r\n");
      out.write("small{ font-size:20px;}\r\n");
      out.write("b, strong{ font-weight:bold;}\r\n");
      out.write("a{ text-decoration: none; }\r\n");
      out.write("a:hover{ text-decoration: underline; }\r\n");
      out.write(".left { float:left; }\r\n");
      out.write(".right { float:right; }\r\n");
      out.write(".alignleft { float: left; margin-right: 15px; }\r\n");
      out.write(".alignright { float: right; margin-left: 15px; }\r\n");
      out.write(".clearfix:after,\r\n");
      out.write("form:after {\r\n");
      out.write("\tcontent: \".\";\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\theight: 0;\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\tvisibility: hidden;\r\n");
      out.write("}\r\n");
      out.write(".container { margin: 25px auto; position: relative; width: 900px; }\r\n");
      out.write("#content {\r\n");
      out.write("\tbackground: #f9f9f9;\r\n");
      out.write("\tbackground: -moz-linear-gradient(top,  rgba(248,248,248,1) 0%, rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: -webkit-linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: -o-linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: -ms-linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f8f8f8', endColorstr='#f9f9f9',GradientType=0 );\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 0 #fff inset;\r\n");
      out.write("\t-moz-box-shadow: 0 1px 0 #fff inset;\r\n");
      out.write("\t-ms-box-shadow: 0 1px 0 #fff inset;\r\n");
      out.write("\t-o-box-shadow: 0 1px 0 #fff inset;\r\n");
      out.write("\tbox-shadow: 0 1px 0 #fff inset;\r\n");
      out.write("\tborder: 1px solid #c4c6ca;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tpadding: 25px 0 0;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-shadow: 0 1px 0 #fff;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#content:after,\r\n");
      out.write("#content:before {\r\n");
      out.write("\tbackground: #f9f9f9;\r\n");
      out.write("\tbackground: -moz-linear-gradient(top,  rgba(248,248,248,1) 0%, rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: -webkit-linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: -o-linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: -ms-linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tbackground: linear-gradient(top,  rgba(248,248,248,1) 0%,rgba(249,249,249,1) 100%);\r\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f8f8f8', endColorstr='#f9f9f9',GradientType=0 );\r\n");
      out.write("\tborder: 1px solid #c4c6ca;\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tleft: -1px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("#content:after {\r\n");
      out.write("\t-webkit-transform: rotate(2deg);\r\n");
      out.write("\t-moz-transform: rotate(2deg);\r\n");
      out.write("\t-ms-transform: rotate(2deg);\r\n");
      out.write("\t-o-transform: rotate(2deg);\r\n");
      out.write("\ttransform: rotate(2deg);\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tz-index: -1;\r\n");
      out.write("}\r\n");
      out.write("#content:before {\r\n");
      out.write("\t-webkit-transform: rotate(-3deg);\r\n");
      out.write("\t-moz-transform: rotate(-3deg);\r\n");
      out.write("\t-ms-transform: rotate(-3deg);\r\n");
      out.write("\t-o-transform: rotate(-3deg);\r\n");
      out.write("\ttransform: rotate(-3deg);\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tz-index: -2;\r\n");
      out.write("}\r\n");
      out.write("#content form { margin: 0 20px; position: relative }\r\n");
      out.write("#content form input[type=\"text\"],\r\n");
      out.write("#content form input[type=\"password\"] {\r\n");
      out.write("\t-webkit-border-radius: 3px;\r\n");
      out.write("\t-moz-border-radius: 3px;\r\n");
      out.write("\t-ms-border-radius: 3px;\r\n");
      out.write("\t-o-border-radius: 3px;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-moz-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-ms-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-o-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\tbox-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-webkit-transition: all 0.5s ease;\r\n");
      out.write("\t-moz-transition: all 0.5s ease;\r\n");
      out.write("\t-ms-transition: all 0.5s ease;\r\n");
      out.write("\t-o-transition: all 0.5s ease;\r\n");
      out.write("\ttransition: all 0.5s ease;\r\n");
      out.write("\tbackground: #eae7e7 url(http://cssdeck.com/uploads/media/items/8/8bcLQqF.png) no-repeat;\r\n");
      out.write("\tborder: 1px solid #c8c8c8;\r\n");
      out.write("\tcolor: #777;\r\n");
      out.write("\tfont: 13px Helvetica, Arial, sans-serif;\r\n");
      out.write("\tmargin: 0 0 10px;\r\n");
      out.write("\tpadding: 15px 10px 15px 40px;\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("}\r\n");
      out.write("#content form input[type=\"text\"]:focus,\r\n");
      out.write("#content form input[type=\"password\"]:focus {\r\n");
      out.write("\t-webkit-box-shadow: 0 0 2px #ed1c24 inset;\r\n");
      out.write("\t-moz-box-shadow: 0 0 2px #ed1c24 inset;\r\n");
      out.write("\t-ms-box-shadow: 0 0 2px #ed1c24 inset;\r\n");
      out.write("\t-o-box-shadow: 0 0 2px #ed1c24 inset;\r\n");
      out.write("\tbox-shadow: 0 0 2px #ed1c24 inset;\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\tborder: 1px solid #ed1c24;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("}\r\n");
      out.write("#username { background-position: 10px 10px !important }\r\n");
      out.write("#password { background-position: 10px -53px !important }\r\n");
      out.write("#content form input[type=\"submit\"] {\r\n");
      out.write("\tbackground: rgb(254,231,154);\r\n");
      out.write("\tbackground: -moz-linear-gradient(top,  rgba(254,231,154,1) 0%, rgba(254,193,81,1) 100%);\r\n");
      out.write("\tbackground: -webkit-linear-gradient(top,  rgba(254,231,154,1) 0%,rgba(254,193,81,1) 100%);\r\n");
      out.write("\tbackground: -o-linear-gradient(top,  rgba(254,231,154,1) 0%,rgba(254,193,81,1) 100%);\r\n");
      out.write("\tbackground: -ms-linear-gradient(top,  rgba(254,231,154,1) 0%,rgba(254,193,81,1) 100%);\r\n");
      out.write("\tbackground: linear-gradient(top,  rgba(254,231,154,1) 0%,rgba(254,193,81,1) 100%);\r\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fee79a', endColorstr='#fec151',GradientType=0 );\r\n");
      out.write("\t-webkit-border-radius: 30px;\r\n");
      out.write("\t-moz-border-radius: 30px;\r\n");
      out.write("\t-ms-border-radius: 30px;\r\n");
      out.write("\t-o-border-radius: 30px;\r\n");
      out.write("\tborder-radius: 30px;\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 0 rgba(255,255,255,0.8) inset;\r\n");
      out.write("\t-moz-box-shadow: 0 1px 0 rgba(255,255,255,0.8) inset;\r\n");
      out.write("\t-ms-box-shadow: 0 1px 0 rgba(255,255,255,0.8) inset;\r\n");
      out.write("\t-o-box-shadow: 0 1px 0 rgba(255,255,255,0.8) inset;\r\n");
      out.write("\tbox-shadow: 0 1px 0 rgba(255,255,255,0.8) inset;\r\n");
      out.write("\tborder: 1px solid #D69E31;\r\n");
      out.write("\tcolor: #85592e;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tfont: bold 15px Helvetica, Arial, sans-serif;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tmargin: 20px 0 35px 15px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttext-shadow: 0 1px 0 rgba(255,255,255,0.5);\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("}\r\n");
      out.write("#content form input[type=\"submit\"]:hover {\r\n");
      out.write("\tbackground: rgb(254,193,81);\r\n");
      out.write("\tbackground: -moz-linear-gradient(top,  rgba(254,193,81,1) 0%, rgba(254,231,154,1) 100%);\r\n");
      out.write("\tbackground: -webkit-linear-gradient(top,  rgba(254,193,81,1) 0%,rgba(254,231,154,1) 100%);\r\n");
      out.write("\tbackground: -o-linear-gradient(top,  rgba(254,193,81,1) 0%,rgba(254,231,154,1) 100%);\r\n");
      out.write("\tbackground: -ms-linear-gradient(top,  rgba(254,193,81,1) 0%,rgba(254,231,154,1) 100%);\r\n");
      out.write("\tbackground: linear-gradient(top,  rgba(254,193,81,1) 0%,rgba(254,231,154,1) 100%);\r\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fec151', endColorstr='#fee79a',GradientType=0 );\r\n");
      out.write("}\r\n");
      out.write("#content form div a {\r\n");
      out.write("\tcolor: #004a80;\r\n");
      out.write("    float: right;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    margin: 30px 15px 0 0;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write(".button {\r\n");
      out.write("\tbackground: rgb(247,249,250);\r\n");
      out.write("\tbackground: -moz-linear-gradient(top,  rgba(247,249,250,1) 0%, rgba(240,240,240,1) 100%);\r\n");
      out.write("\tbackground: -webkit-linear-gradient(top,  rgba(247,249,250,1) 0%,rgba(240,240,240,1) 100%);\r\n");
      out.write("\tbackground: -o-linear-gradient(top,  rgba(247,249,250,1) 0%,rgba(240,240,240,1) 100%);\r\n");
      out.write("\tbackground: -ms-linear-gradient(top,  rgba(247,249,250,1) 0%,rgba(240,240,240,1) 100%);\r\n");
      out.write("\tbackground: linear-gradient(top,  rgba(247,249,250,1) 0%,rgba(240,240,240,1) 100%);\r\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f7f9fa', endColorstr='#f0f0f0',GradientType=0 );\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 2px rgba(0,0,0,0.1) inset;\r\n");
      out.write("\t-moz-box-shadow: 0 1px 2px rgba(0,0,0,0.1) inset;\r\n");
      out.write("\t-ms-box-shadow: 0 1px 2px rgba(0,0,0,0.1) inset;\r\n");
      out.write("\t-o-box-shadow: 0 1px 2px rgba(0,0,0,0.1) inset;\r\n");
      out.write("\tbox-shadow: 0 1px 2px rgba(0,0,0,0.1) inset;\r\n");
      out.write("\t-webkit-border-radius: 0 0 5px 5px;\r\n");
      out.write("\t-moz-border-radius: 0 0 5px 5px;\r\n");
      out.write("\t-o-border-radius: 0 0 5px 5px;\r\n");
      out.write("\t-ms-border-radius: 0 0 5px 5px;\r\n");
      out.write("\tborder-radius: 0 0 5px 5px;\r\n");
      out.write("\tborder-top: 1px solid #CFD5D9;\r\n");
      out.write("\tpadding: 15px 0;\r\n");
      out.write("}\r\n");
      out.write(".button a {\r\n");
      out.write("\tbackground: url(http://cssdeck.com/uploads/media/items/8/8bcLQqF.png) 0 -112px no-repeat;\r\n");
      out.write("\tcolor: #7E7E7E;\r\n");
      out.write("\tfont-size: 17px;\r\n");
      out.write("\tpadding: 2px 0 2px 40px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\t-webkit-transition: all 0.3s ease;\r\n");
      out.write("\t-moz-transition: all 0.3s ease;\r\n");
      out.write("\t-ms-transition: all 0.3s ease;\r\n");
      out.write("\t-o-transition: all 0.3s ease;\r\n");
      out.write("\ttransition: all 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write(".button a:hover {\r\n");
      out.write("\tbackground-position: 0 -135px;\r\n");
      out.write("\tcolor: #00aeef;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write(" <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/demo.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style1.css\" />\r\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/fontstyle.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- for popup message start -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/js/message.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/style.js\"></script>\t\r\n");
      out.write("<!-- for popup message end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.history.forward();\r\n");
      out.write("function noBack() { window.history.forward(); }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"startTimer();\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("            <!-- <h1><i>Criminal Identification System</i></h1>  -->\r\n");
      out.write("            \r\n");
      out.write("          <!--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"index.jsp\" style=\"font-size: 30px; color:green; background-color: #40E0D0; text-decoration: none\">Home Page</a> -->\r\n");
      out.write("\r\n");


String k=null;
k=request.getParameter("no");
 int no=0;
 if(k!=null)
 {
	 no=Integer.parseInt(k); 
 }




      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");

if(no==1)
{

      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 150px;\">\r\n");
      out.write("<div class=\"error\" id=\"message\" >\t\r\n");
      out.write("\t<p> Password and Re Password Incorrect.....!</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
}else if(no==2)
{

      out.write("\r\n");
      out.write("<div style=\"position: absolute;left:360px;top:350px;\">\r\n");
      out.write("<div class=\"success\" id=\"message\" >\t\r\n");
      out.write("\t<p> FIR Successfully Registered.....!</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
} else if(no==3)
{
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 150px;\">\r\n");
      out.write("<div class=\"error\" id=\"message\" >\t\r\n");
      out.write("\t<p> User ID is Already Exist.....!</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
}else
	{
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

	}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: -10px;\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<section id=\"content\">\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/RegisterFir\" method=\"post\" >\r\n");
      out.write("\t\t\t<h2>Register FIR</h2>\r\n");
      out.write("\t\t\t<!-- <div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"User ID\" required=\"\" name=\"userid\" required=\"yes\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Password\" required=\"\" name=\"password\" required=\"yes\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Re Password\" required=\"\" name=\"rpassword\" required=\"yes\"/>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Name\" required=\"\" name=\"username\" required=\"yes\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Address\" required=\"\" name=\"addr\" required=\"yes\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Phone Number\" required=\"\" name=\"pno\" required=\"yes\"  pattern=\"[7-9]{1}[0-9]{9}\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Enter FIR Content\" required=\"\" name=\"fir_report\" required=\"yes\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- <div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Email ID\" required=\"\" name=\"email\" required=\"yes\" pattern=\"\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\" />\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t<div style=\"position: absolute;top: 250px;left: 120px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Submit\" />\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</section><!-- content -->\r\n");
      out.write("</div><!-- container -->\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
