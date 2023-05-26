//12
public class func{
public void isLocalHostAddressReachable(String hostAddress,int port){
      serverSocket.bind(new InetSocketAddress(InetAddress.getByName(hostAddress), port));
      port = serverSocket.getLocalPort();
      serverSocket.close();
}
}
