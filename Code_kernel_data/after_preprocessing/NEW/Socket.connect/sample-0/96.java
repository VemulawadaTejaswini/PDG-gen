//96
public class func{
public void stopHTTPSProxyServer(){
        outputSocket.connect(new InetSocketAddress(APJP.APJP_LOCAL_HTTPS_PROXY_SERVER_ADDRESS, APJP.APJP_LOCAL_HTTPS_PROXY_SERVER_PORT));
        outputSocket.close();
}
}
