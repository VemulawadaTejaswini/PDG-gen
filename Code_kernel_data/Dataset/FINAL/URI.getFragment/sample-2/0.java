public class func{
public void uriSubpath(URI uri,String subpath){
    String path = uri.getPath();
    if (path != null && path.length() > 0)
    {
      subpath = path + "/" + subpath;
    }
    if (uri.getScheme() != null && subpath.charAt(0) != '/')
    {
      subpath = "/" + subpath;
    }
      return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), subpath, uri.getQuery(),
          uri.getFragment());
}
}
