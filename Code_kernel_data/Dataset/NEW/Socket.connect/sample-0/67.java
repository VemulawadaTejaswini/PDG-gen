//67
public class func{
public void stopHTTPProxyServer(){
        outputSocket.connect(new InetSocketAddress(APJP.APJP_LOCAL_HTTP_PROXY_SERVER_ADDRESS, APJP.APJP_LOCAL_HTTP_PROXY_SERVER_PORT));
        outputSocket.close();
}
}
