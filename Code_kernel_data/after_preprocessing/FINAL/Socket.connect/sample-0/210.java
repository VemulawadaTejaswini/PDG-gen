public class func{
public void createSocket(String host,int port,InetAddress local,int localPort){
    s.connect(new InetSocketAddress(host, port), SO_CONNECT_TIMEOUT);
}
}
