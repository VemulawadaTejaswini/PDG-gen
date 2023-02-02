//14
public class func{
	public void checkPortIsFree(int port){
      socket.bind(new InetSocketAddress("localhost", port));
      int localPort = socket.getLocalPort();
      socket.close();
}
}
