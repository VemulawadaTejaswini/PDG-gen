//179
public class func{
public void createSocket(String host,int port){
    socket.connect(new InetSocketAddress(host, port), connectionTimeout);
}
}
