//13
public class func{
	public void forDisplay(){
            URI uri = new URI(sanitizeUrl());
            if (uri.getUserInfo() != null) {
                //(String scheme, String userInfo, String host, int port, String path, String query, String fragment)
                uri = new URI(uri.getScheme(), clean(uri.getUserInfo()), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            return uriToDisplay(uri);
}
}
