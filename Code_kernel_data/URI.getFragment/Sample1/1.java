//0
public class func{
	public void valideUri(URI uri){
    String schemeSpecificPart = uri.getSchemeSpecificPart();
    if (schemeSpecificPart.isEmpty()) {
      throw new IllegalArgumentException("scheme specific part must not be empty");
    }
    String host = uri.getHost();
    if (host != null) {
      throw new IllegalArgumentException("host must not be set");
    }
    String authority = uri.getAuthority();
    if (authority != null) {
      throw new IllegalArgumentException("authority must not be set");
    }
    String userInfo = uri.getUserInfo();
    if (userInfo != null) {
      throw new IllegalArgumentException("userInfo must not be set");
    }
    int port = uri.getPort();
    if (port != -1) {
      throw new IllegalArgumentException("port must not be set");
    }
    String path = uri.getPath();
    if (path != null) {
      throw new IllegalArgumentException("path must not be set");
    }
    String query = uri.getQuery();
    if (query != null) {
      throw new IllegalArgumentException("query must not be set");
    }
    String fragment = uri.getFragment();
    if (fragment != null) {
      throw new IllegalArgumentException("fragment must not be set");
    }
}
}
