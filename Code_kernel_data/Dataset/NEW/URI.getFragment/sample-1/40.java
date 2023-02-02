//40
public class func{
public void UriSelector(URI uri){
    if(authority.contains("*:")) {
      int i = authority.lastIndexOf(":") + 1;
      if(i > 1) {
        port = Integer.parseInt(authority.substring(i));
      } else {
        port = -1;
      }
    } else {
      port = uri.getPort();
    }
    path = (null != uri.getPath() ? uri.getPath() : "/*");
    fragment = uri.getFragment();
}
}
