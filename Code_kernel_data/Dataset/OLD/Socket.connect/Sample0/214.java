//213
public class func{
	public void createSocket(TcpSocketKey key){
        socket.connect(new InetSocketAddress(key.getInetAddress(), key.getPort()), timeout);
}
}
