//183
public class func{
	public void createSocket(String host,int port){
        InetSocketAddress endpoint = new InetSocketAddress(host, port);
        socket.connect(endpoint);
}
}
