public class func{
public void checkIfRemoteEndpointAccessible(String host,int port){
      discover.connect(new InetSocketAddress(host, port), 1000);
      discover.close();
}
}
