//135
public class func{
	public void isPortAvailable(int port){
      InetSocketAddress sa = new InetSocketAddress(port);
      serverSocket.bind(sa);
}
}
