//480
public class func{
public void sendRequestViaProxy(URL url){
        Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort"))));
        return (HttpURLConnection) url.openConnection(proxy);
}
}
