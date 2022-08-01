//8
public class func{
	public void findNextPort(){
      ServerSocket serverSocket = new ServerSocket();
      serverSocket.setReuseAddress(true); // this allows the server port to be bound to even if it's in TIME_WAIT
      serverSocket.bind(inetSocketAddress);
      port = serverSocket.getLocalPort();
      serverSocket.close();
}
}
