public class func{
public void createSocket(InetAddress host,int port){
    s.connect(new InetSocketAddress(host, port), SO_CONNECT_TIMEOUT);
}
}
