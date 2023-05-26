public class func{
public void forDisplay(){
            URI uri = new URI(sanitizeUrl());
            if (uri.getUserInfo() != null) {
                uri = new URI(uri.getScheme(), clean(uri.getUserInfo()), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            return uriToDisplay(uri);
}
}
