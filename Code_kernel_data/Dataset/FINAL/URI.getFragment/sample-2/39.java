public class func{
public void canonicalizeUri(URI uri){
    if (uri.getPort() == -1 && getDefaultPort() > 0) {
      try {
        uri = new URI(uri.getScheme(), uri.getUserInfo(),
            uri.getHost(), getDefaultPort(),
            uri.getPath(), uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        throw new AssertionError("Valid URI became unparseable: " +
            uri);
      }
    }
}
}
