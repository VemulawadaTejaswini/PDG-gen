//2
public class func{
	public void defaultRemoteUrl(){
        final String sanitizedUrl = sanitizeUrl();
            URI uri = new URI(sanitizedUrl);
            if (uri.getUserInfo() != null) {
                uri = new URI(uri.getScheme(), removePassword(uri.getUserInfo()), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                return uri.toString();
            }
}
}
