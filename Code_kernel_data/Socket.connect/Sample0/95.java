//94
public class func{
	public void stopProxyServer(){
        outputSocket.connect(new InetSocketAddress(APJP.APJP_LOCAL_PROXY_SERVER_ADDRESS, APJP.APJP_LOCAL_PROXY_SERVER_PORT));
        outputSocket.close();
}
}
