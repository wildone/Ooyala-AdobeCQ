package org.apache.jsp.libs.foundation.components.form.tags;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.jcr.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import com.day.cq.wcm.commons.WCMUtils;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.NameConstants;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Style;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;
import com.day.cq.tagging.Tag;
import com.day.cq.tagging.TagManager;
import com.day.cq.wcm.foundation.forms.FormsConstants;
import com.day.cq.wcm.foundation.forms.FormsHelper;
import com.day.cq.wcm.foundation.forms.LayoutHelper;
import com.day.cq.widget.HtmlLibraryManager;
import org.apache.sling.api.resource.ResourceResolver;
import com.day.cq.i18n.I18n;
import java.util.ResourceBundle;

public final class tags_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;











      //  cq:defineObjects
      com.day.cq.wcm.tags.DefineObjectsTag _jspx_th_cq_005fdefineObjects_005f0 = (com.day.cq.wcm.tags.DefineObjectsTag) _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.get(com.day.cq.wcm.tags.DefineObjectsTag.class);
      _jspx_th_cq_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_cq_005fdefineObjects_005f0 = _jspx_th_cq_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_cq_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      com.day.cq.wcm.api.components.ComponentContext componentContext = null;
      com.day.cq.wcm.api.components.EditContext editContext = null;
      org.apache.sling.api.resource.ValueMap properties = null;
      com.day.cq.wcm.api.PageManager pageManager = null;
      com.day.cq.wcm.api.Page currentPage = null;
      com.day.cq.wcm.api.Page resourcePage = null;
      com.day.cq.commons.inherit.InheritanceValueMap pageProperties = null;
      com.day.cq.wcm.api.components.Component component = null;
      com.day.cq.wcm.api.designer.Designer designer = null;
      com.day.cq.wcm.api.designer.Design currentDesign = null;
      com.day.cq.wcm.api.designer.Design resourceDesign = null;
      com.day.cq.wcm.api.designer.Style currentStyle = null;
      com.adobe.granite.xss.XSSAPI xssAPI = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      componentContext = (com.day.cq.wcm.api.components.ComponentContext) _jspx_page_context.findAttribute("componentContext");
      editContext = (com.day.cq.wcm.api.components.EditContext) _jspx_page_context.findAttribute("editContext");
      properties = (org.apache.sling.api.resource.ValueMap) _jspx_page_context.findAttribute("properties");
      pageManager = (com.day.cq.wcm.api.PageManager) _jspx_page_context.findAttribute("pageManager");
      currentPage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("currentPage");
      resourcePage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("resourcePage");
      pageProperties = (com.day.cq.commons.inherit.InheritanceValueMap) _jspx_page_context.findAttribute("pageProperties");
      component = (com.day.cq.wcm.api.components.Component) _jspx_page_context.findAttribute("component");
      designer = (com.day.cq.wcm.api.designer.Designer) _jspx_page_context.findAttribute("designer");
      currentDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("currentDesign");
      resourceDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("resourceDesign");
      currentStyle = (com.day.cq.wcm.api.designer.Style) _jspx_page_context.findAttribute("currentStyle");
      xssAPI = (com.adobe.granite.xss.XSSAPI) _jspx_page_context.findAttribute("xssAPI");


    // add more initialization code here






    HtmlLibraryManager htmlMgr = sling.getService(HtmlLibraryManager.class);
    if (htmlMgr != null) {
        // only include cq widgets here for tagging drop-down window that
        // will be rendered in standard #CQ div and thus requires the
        // normal widgets css
        htmlMgr.writeCssInclude(slingRequest, out, "cq.widgets");
        // the tagging widget CSS is included below in a style tag in
        // its non-#CQ div variant (/libs/foundation/components/form/tags/tags.css)
        
        htmlMgr.writeJsInclude(slingRequest, out, "cq.tagging");
    }

	final ResourceBundle resourceBundle = slingRequest.getResourceBundle(null);
	I18n i18n = new I18n(resourceBundle);  
	
    final long time = System.currentTimeMillis();
    final String name = properties.get(FormsConstants.ELEMENT_PROPERTY_NAME, "./cq:tags");
    final String id = FormsHelper.getFieldId(slingRequest, resource);
    final String title = FormsHelper.getTitle(resource, i18n.get("Tags"));
    
    final String width = properties.get("width", String.class);
    final String popupWidth = properties.get("popupWidth", String.class);
    final String popupHeight = properties.get("popupHeight", String.class);
    final String[] namespaces = properties.get("namespaces", String[].class);
    final boolean required = FormsHelper.isRequired(resource);
    final boolean readOnly = FormsHelper.isReadOnly(slingRequest, resource);
    final boolean hideTitle = properties.get("hideTitle", false);
    
    ResourceResolver rr = slingRequest.getResourceResolver();

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<link type=\"text/css\" href=\"/libs/foundation/components/form/tags/tags.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("<div class=\"form_row\">\n");
      out.write("    ");
 LayoutHelper.printTitle(id, title, required, hideTitle, out); 
      out.write("\n");
      out.write("    <div class=\"form_rightcol\">\n");

    if (readOnly) {
        Resource loadResource = FormsHelper.getFormLoadResource(slingRequest);
        TagManager tm = rr.adaptTo(TagManager.class);
        Tag[] tags = tm.getTags(loadResource);

      out.write("        <div class=\"form-readonly\">");

        for (int i=0; i < tags.length; i++) {
            if (i > 0) 
      out.write(',');
      out.write(' ');
; 
            
      out.print( xssAPI.filterHTML(tags[i].getTitle()) );

        }

      out.write("</div>\n");

    } else {
        String[] values = FormsHelper.getValues(slingRequest, name, null);
        if (values == null) {
            values = new String[]{};
        }

      out.write("\n");
      out.write("        <div id=\"tags_");
      out.print( time );
      out.write("_wrapper\"> </div>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            CQ.Ext.onLoad(function() {\n");
      out.write("    \n");
      out.write("                var tagField = new CQ.tagging.TagInputField({\n");
      out.write("                    \"name\": \"");
      out.print( xssAPI.encodeForJSString(name) );
      out.write("\",\n");
      out.write("                    \"id\": \"");
      out.print( xssAPI.encodeForJSString(id) );
      out.write("\",\n");
      out.write("                    \"renderTo\": \"tags_");
      out.print( time );
      out.write("_wrapper\",\n");
      out.write("                    \"hideLabel\": true,\n");
      out.write("                    \"width\": ");
      out.print( xssAPI.getValidDimension(width, "\"auto\"") );
      out.write(",\n");
      out.write("                    \"popupWidth\": ");
      out.print( xssAPI.getValidDimension(popupWidth, "500") );
      out.write(",\n");
      out.write("                    \"popupHeight\": ");
      out.print( xssAPI.getValidDimension(popupHeight, "300") );
      out.write(",\n");
      out.write("                    \"namespaces\": [");

                        for (int i = 0; namespaces != null && i < namespaces.length; i++) {
                            if (i > 0) 
      out.write(',');
      out.write(' ');
;
                            
      out.write('"');
      out.print( xssAPI.encodeForJSString(namespaces[i]) );
      out.write('"');

                        }
                     
      out.write("]\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // in this special environment, we must manually trigger the prepareSubmit() method\n");
      out.write("                if (window.formpage_form && typeof window.formpage_form.on === \"function\") {\n");
      out.write("                    window.formpage_form.on(\"beforesubmit\", function() {\n");
      out.write("                        tagField.prepareSubmit();\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("    \n");
      out.write("                tagField.setValue([");

                    for (int i = 0; i < values.length; i++) {
                        if (i > 0) 
      out.write(',');
      out.write(' ');
;
                        
      out.write('"');
      out.print( xssAPI.encodeForJSString(values[i]) );
      out.write('"');

                    }
                
      out.write("]);\n");
      out.write("            });\n");
      out.write("        </script>\n");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");

LayoutHelper.printDescription(FormsHelper.getDescription(resource, ""), out);
LayoutHelper.printErrors(slingRequest, name, hideTitle, out);

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
