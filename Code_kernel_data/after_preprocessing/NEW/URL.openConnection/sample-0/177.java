//177
public class func{
public void testProxy(InetSocketAddress proxySocketAddress,String fetchUrl){
    URL url = new URL(fetchUrl);
    HttpURLConnection uc = (HttpURLConnection) url.openConnection(proxy);
    uc.connect();
    InputStream is = uc.getInputStream();
    String html = IoUtils.readAll(is);
    is.close();
}
}
