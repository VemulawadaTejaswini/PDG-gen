//29
public class func{
	public void stripUserInfoFromUriIfDefined(URI uri){
        if (uri.getUserInfo() != null) {
            try {
                uriToUse = new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        } else {
            uriToUse = uri;
        }
}
}
