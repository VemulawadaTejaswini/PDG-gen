public class func{
public void WebConnection(URI uri,boolean useHTTPS){
      newURI = new URI("http" + (useHTTPS?"s":"") + ":
        + (uri.getQuery()==null?"":"?" + uri.getQuery())
        + (uri.getFragment()==null?"":"#" + uri.getFragment()));
}
}
