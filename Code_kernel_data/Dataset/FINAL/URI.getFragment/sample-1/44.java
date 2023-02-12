public class func{
public void rewriteURI(final URI uri){
        if (uri == null) {
            throw new IllegalArgumentException("URI may not be null");
        }
        if (uri.getFragment() != null || uri.getUserInfo() != null) {
            return new URIBuilder(uri).setFragment(null).setUserInfo(null).build();
        } else {
            return uri;
        }
}
}
