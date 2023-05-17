public class func{
public void createUri(URI uri,String queryString){
    String fragmentPart = uri.getFragment() == null ? "" : "#" + uri.getRawFragment();
    URI pathonly = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), null, null);
}
}
