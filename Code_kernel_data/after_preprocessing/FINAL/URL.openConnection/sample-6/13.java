public class func{
public void getCssContent(HttpServletRequest request,HttpServletResponse response,URL resourceURL,String resourcePath){
    URLConnection urlConnection = resourceURL.openConnection();
    String content = StringUtil.read(urlConnection.getInputStream());
    content = aggregateCss(
      new ServletPaths(
        _servletContext, ServletPaths.getParentPath(resourcePath)),
      content);
    return getCssContent(request, response, resourcePath, content);
}
}
