public class func{
public void getUriWithPort(final URI uri,final int port){
        if (uri == null) {
            return null;
        }
            if (uri.getPort() == -1) {
                return new URI(
                        uri.getScheme(),
                        uri.getUserInfo(),
                        uri.getHost(),
                        port,
                        uri.getPath(),
                        uri.getQuery(),
                        uri.getFragment());
            }
            throw new RuntimeException("Could not parse URI.", e);
}
}
