//90
public class func{
	public void trySocketConnection(String host,int port){
      InetSocketAddress endpoint = new InetSocketAddress(host, port);
      socket.connect(endpoint, 5000);
      socket.close();
}
}
