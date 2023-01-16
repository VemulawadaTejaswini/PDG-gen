//234
public class func{
	public void createSocket(final String host,final int port,final InetAddress localAddress,final int localPort,final HttpConnectionParams params){
    SocketAddress remoteAddr = new InetSocketAddress(host, port);
    socket.connect(remoteAddr, timeout);
}
}
