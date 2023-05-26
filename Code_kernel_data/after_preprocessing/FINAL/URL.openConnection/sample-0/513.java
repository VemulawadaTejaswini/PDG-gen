public class func{
public void httpOpen(String method,URL u){
    final Proxy proxy = HttpSupport.proxyFor(proxySelector, u);
    HttpURLConnection conn = (HttpURLConnection) u.openConnection(proxy);
}
}
