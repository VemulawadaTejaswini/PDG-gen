public class func{
public void prepareHttpUrlConnection(URL url){
    Proxy proxy = setupProxy(url);
    Authenticator proxyAuthentication = setupProxyAuthentication(url, proxy);
    if (proxyAuthentication != null) {
      Authenticator.setDefault(proxyAuthentication);
    }
    HttpURLConnection connection = (HttpURLConnection) (proxy != null ?  url.openConnection(proxy) : url.openConnection());
    connection.setConnectTimeout(5000);
    connection.setReadTimeout(5000);
    connection.setUseCaches(false);
}
}
