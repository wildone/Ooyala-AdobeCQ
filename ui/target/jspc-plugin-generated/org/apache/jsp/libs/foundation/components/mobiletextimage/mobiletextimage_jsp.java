package org.apache.jsp.libs.foundation.components.mobiletextimage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.wcm.foundation.Image;
import com.day.cq.wcm.foundation.TextFormat;
import com.day.cq.wcm.foundation.DiffInfo;
import com.day.cq.wcm.foundation.DiffService;
import com.day.cq.wcm.api.components.DropTarget;
import com.day.cq.wcm.api.WCMMode;
import org.apache.sling.api.resource.ResourceUtil;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.commons.Doctype;
import com.day.cq.wcm.mobile.api.device.capability.DeviceCapability;
import com.day.cq.wcm.mobile.core.MobileUtil;
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

public final class mobiletextimage_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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



    //drop target css class = dd prefix + name of the drop target in the edit config
    String ddClassName = DropTarget.CSS_CLASS_PREFIX + "image";

    Image img = new Image(resource, "image");
    final DiffInfo diffInfo = resource.adaptTo(DiffInfo.class);
    final Image diffImg = (diffInfo == null || diffInfo.getContent() == null ? null : new Image(diffInfo.getContent(), "image"));
    final DiffService diffService = (diffInfo == null ? null : sling.getService(DiffService.class));
    if ((img.hasContent() || WCMMode.fromRequest(request) == WCMMode.EDIT) && MobileUtil.hasCapability(slingRequest, DeviceCapability.CAPABILITY_IMAGES)) {
        String cssClass = "image ";
        if ( diffInfo != null ) {
            if ( diffInfo.getType() == DiffInfo.TYPE.ADDED ) {
                cssClass += "imageAdded ";
            } else if ( diffInfo.getType() == DiffInfo.TYPE.REMOVED ) {
                cssClass += "imageRemoved ";
            } else {
                final String path1 = (img.getHref() != null ? img.getHref() : "");
                final String path2 = (diffImg != null && diffImg.getHref() != null ? diffImg.getHref() : "");
                if ( !path1.equals(path2) ) {
                    if ( path1.length() == 0 ) {
                        img.addCssClass("imageRemoved");
                    } else if ( path2.length() == 0 ) {
                        img.addCssClass("imageAdded");
                    } else {
                        int pos = path2.indexOf("jcr:frozenNode/");
                        if ( pos == -1
                             || !path1.endsWith(path2.substring(pos+14))
                             || img.getLastModified().compareTo(diffImg.getLastModified()) != 0 ) {    
                            img.addCssClass("imageChanged");
                        }
                    }
                } else if ( img.getLastModified().compareTo(diffImg.getLastModified()) !=  0 ) {
                    img.addCssClass("imageChanged");                
                }
            }
        }
        
      out.write("<div class=\"");
      out.print( cssClass );
      out.print( properties.get("cq:cssClass", "") );
      out.write('"');
      out.write('>');

        img.loadStyleData(currentStyle);
        // add design information if not default (i.e. for reference paras)
        if (!currentDesign.equals(resourceDesign)) {
            img.setSuffix(currentDesign.getId());
        }
        img.addCssClass(ddClassName);
        img.setSelector(".img");
        img.setDoctype(Doctype.fromRequest(request));
        String title = img.getTitle();
        if ( title.length() > 0 ) {
            title = img.getTitle(true);
        }
        if ( diffInfo != null ) {
            final String other = (diffImg == null ? "" : diffImg.getTitle(true));
            final String diffOutput = DiffInfo.getDiffOutput(diffService, diffInfo, title, false, other);
            if ( diffOutput != null ) {
                title = diffOutput;
            }
        }
        
 img.draw(out); 
      out.write("<br>");

        String desc = img.getDescription();
        if ( desc.length() > 0 ) {
            desc = img.getDescription(true);
        }
        if ( diffInfo != null ) {
            final String other = (diffImg == null ? "" : diffImg.getDescription(true));
            final String diffOutput = DiffInfo.getDiffOutput(diffService, diffInfo, desc, false, other);
            if ( diffOutput != null ) {
                desc = diffOutput;
            }
        }
        if (desc.length() > 0) {            
            
      out.write("<small>");
      out.print( desc );
      out.write("</small>");

        }
        
      out.write("</div>");

    }
    if (properties.get("text", "").length() > 0) {
        String text = properties.get("text", String.class);
        boolean isRichText = properties.get("textIsRich", "false").equals("true");
        if ( diffInfo != null ) {
            final ValueMap map = ResourceUtil.getValueMap(diffInfo.getContent());
            final String diffOutput = DiffInfo.getDiffOutput(diffService, diffInfo, text, isRichText, map.get("text", ""));
            if ( diffOutput != null ) {
                text = diffOutput;
                isRichText = true;
            }
        }
        
      out.write("<div class=\"text\">");

        if (isRichText) {
            
      out.print( text );

        } else {
            TextFormat fmt = new TextFormat();
            fmt.setTagUlOpen("<ul>");
            fmt.setTagOlOpen("<ol start=\"%s\">");
            
      out.print( fmt.format(text) );

        }
        
      out.write("</div>");

    } else if (WCMMode.fromRequest(request) == WCMMode.EDIT) {
        
      out.write("<img src=\"/libs/cq/ui/resources/0.gif\" class=\"cq-text-placeholder ");
      out.print( ddClassName );
      out.write("\" alt=\"\">");

    }
    
      out.write("<div class=\"clear\"></div>");
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
