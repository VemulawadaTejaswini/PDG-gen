//3
public class func{
	public void unqualifyURI(URI uri,String scheme,String hostname,int port){
    int uriPort = uri.getPort();
    if (uriPort == -1) {
      uriPort = getDefaultPort(uri.getScheme());
    }
    if (scheme.equals(uri.getScheme()) && hostname.equals(uri.getHost())
        && port == uriPort) {
      try {
        simpleURI = new URI(null, null, null, -1, uri.getPath(),
            uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        simpleURI = uri;
      }
    }
}
}
