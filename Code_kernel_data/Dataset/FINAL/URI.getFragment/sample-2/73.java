public class func{
public void resolve(URI uri){
    if (uri.isAbsolute())
      return uri;
    if (uri.isOpaque())
      return uri;
    String scheme = uri.getScheme();
    String schemeSpecificPart = uri.getSchemeSpecificPart();
    String authority = uri.getAuthority();
    String path = uri.getPath();
    String query = uri.getQuery();
    String fragment = uri.getFragment();
}
}
