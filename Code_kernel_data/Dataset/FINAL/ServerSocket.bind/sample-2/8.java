public class func{
public void findNextPort(){
      ServerSocket serverSocket = new ServerSocket();
      serverSocket.setReuseAddress(true);
      serverSocket.bind(inetSocketAddress);
      port = serverSocket.getLocalPort();
      serverSocket.close();
}
}
