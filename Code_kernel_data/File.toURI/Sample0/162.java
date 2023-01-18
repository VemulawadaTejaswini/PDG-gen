//161
public class func{
	public void _prepareServletContext(ServletContext servletContext){
    File webINFFile = new File(_testDir, ServletContextUtil.PATH_WEB_INF);
    servletContext.setAttribute(
      ServletContextUtil.URI_ATTRIBUTE, webINFFile.toURI());
}
}
