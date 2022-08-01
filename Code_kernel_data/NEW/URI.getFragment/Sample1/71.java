//70
public class func{
	public void createUri(URI uri,String queryString){
    String fragmentPart = uri.getFragment() == null ? "" : "#" + uri.getRawFragment();//$NON-NLS-1$ //$NON-NLS-2$
    URI pathonly = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), null, null);
}
}
