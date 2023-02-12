public class func{
public void getLocationURI(final HttpResponse response,final HttpContext context){
            if (uri.getFragment() != null) {
                try {
                    final HttpHost target = new HttpHost(
                            uri.getHost(),
                            uri.getPort(),
                            uri.getScheme());
                    redirectURI = URIUtils.rewriteURI(uri, target, true);
                } catch (final URISyntaxException ex) {
                    throw new ProtocolException(ex.getMessage(), ex);
                }
            } else {
                redirectURI = uri;
            }
}
}
