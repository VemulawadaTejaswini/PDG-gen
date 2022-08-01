//89
public class func{
	public void maybeCheckForLocalhostPeer(){
                socket.connect(new InetSocketAddress(InetAddresses.forString("127.0.0.1"), params.getPort()), vConnectTimeoutMillis);
                    socket.close();
}
}
