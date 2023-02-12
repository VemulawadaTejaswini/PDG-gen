public class func{
public void service(ServletRequest request,ServletResponse response){
        if (!sslEndPoint.contains("/")) {
            path = "/";
        } else {
            path = sslEndPoint.substring(sslEndPoint.indexOf("/"), sslEndPoint.length());
        }
        if (uri != null) {
            try {
                postMethod.setURI(URIUtils.createURI(uri.getScheme(), uri.getHost(), uri.getPort(), path, uri.getQuery(),
                        uri.getFragment()));
            } catch (URISyntaxException e) {
                SoapUI.logError(e);
            }
        }
}
}
