public class func{
public void checkSSLServer(){
        URL testSSLURL = new URL(getProxyCallbackURLPrefix().getProtocol(),
                getProxyCallbackURLPrefix().getHost(),getProxyCallbackURLPrefix().getPort(),"/test");
        HttpURLConnection con = (HttpURLConnection) testSSLURL.openConnection();
        con.getInputStream().close();
}
}
