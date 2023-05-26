//65
public class func{
public void matches(Object key){
    if(null == key) {
      return false;
    }
    URI uri = objectToURI(key);
    if(uri == null){
      return false;
    }
    boolean schemeMatches = "*".equals(scheme) || scheme.equals(uri.getScheme());
    boolean hostMatches = "*".equals(host) || host.equals(uri.getHost());
    boolean portMatches = -1 == port || port == uri.getPort();
    boolean pathMatches = "/*".equals(path) || path.equals(uri.getPath());
    boolean fragmentMatches = null == fragment || fragment.equals(uri.getFragment());
}
}
