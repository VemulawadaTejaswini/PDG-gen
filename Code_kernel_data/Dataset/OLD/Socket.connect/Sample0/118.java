//117
public class func{
	public void open(final String hostname,final int port,final ProxyData proxyData,final int connectTimeout){
            InetAddress addr = TransportManager.createInetAddress(hostname);
            sock.connect(new InetSocketAddress(addr, port), connectTimeout);
            sock.setSoTimeout(0);
}
}
