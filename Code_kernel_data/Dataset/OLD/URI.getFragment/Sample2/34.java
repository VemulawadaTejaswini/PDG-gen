//33
public class func{
	public void BaseResource(URI uri,boolean rewrite){
    if (uri == null) {
      throw new IllegalArgumentException("uri must not be null");
    }
    if (rewrite && "localhost".equals(uri.getHost())) {
      // Rewrite localhost URIs to refer to the special Android emulator loopback passthrough interface.
      Logger.debug(LOG_TAG, "Rewriting " + uri + " to point to " + ANDROID_LOOPBACK_IP + ".");
      try {
        this.uri = new URI(uri.getScheme(), uri.getUserInfo(), ANDROID_LOOPBACK_IP, uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        Logger.error(LOG_TAG, "Got error rewriting URI for Android emulator.", e);
        throw new IllegalArgumentException("Invalid URI", e);
      }
    } else {
      this.uri = uri;
    }
}
}
