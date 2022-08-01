//0
public class func{
	public void uriSubpath(URI uri,String subpath){
    String path = uri.getPath();
    if (path != null && path.length() > 0)
    {
      subpath = path + "/" + subpath; //$NON-NLS-1$
    }
    if (uri.getScheme() != null && subpath.charAt(0) != '/')
    {
      subpath = "/" + subpath; //$NON-NLS-1$
    }
      return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), subpath, uri.getQuery(),
          uri.getFragment());
}
}
