public class func{
public void resovleOrionURI(HttpServletRequest request,URI uri){
    if (!uri.getScheme().equals("orion"))
      return uri;
      return new URI(null, null, request.getContextPath() + uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
