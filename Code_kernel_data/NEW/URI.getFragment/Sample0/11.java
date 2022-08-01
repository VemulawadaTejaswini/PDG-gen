//10
public class func{
	public void createServiceInfo(Map<String,Object> serviceData){
      URI uri = new URI((String)credentials.get("url"));
      String scheme = uri.getScheme();
      int port = uri.getPort();
      String host = uri.getHost();
      String path = uri.getPath();
      String query = uri.getQuery();
      String fragment = uri.getFragment();
      String url = new URI(scheme, "", host, port, path, query, fragment).toString();
}
}
