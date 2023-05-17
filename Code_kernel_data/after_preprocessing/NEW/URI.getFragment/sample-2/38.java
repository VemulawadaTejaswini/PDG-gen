//38
public class func{
public void getCanonicalUri(URI uri,int defaultPort){
    String host = uri.getHost();
    if (host == null) {
      return uri;
    }
    String fqHost = canonicalizeHost(host);
    int port = uri.getPort();
    if (host.equals(fqHost) && port != -1) {
      return uri;
    }
      uri = new URI(uri.getScheme(), uri.getUserInfo(),
          fqHost, (port == -1) ? defaultPort : port,
          uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
