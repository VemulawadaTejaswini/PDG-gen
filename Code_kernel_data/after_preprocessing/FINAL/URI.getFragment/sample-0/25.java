public class func{
public void processURI(String u,String overrideType,boolean forBaseHref,boolean inline){
    String host = uri.getHost();
    if(host != null && (host.equals("localhost") || host.equals("127.0.0.1")) && uri.getPort() == 8888) {
      try {
        uri = new URI(null, null, null, -1, uri.getPath(), uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        Logger.error(this, "URI "+uri+" looked like localhost but could not parse", e);
        throw new CommentException("URI looked like localhost but could not parse: "+e);
      }
      host = null;
    }
    String rpath = uri.getPath();
}
}
