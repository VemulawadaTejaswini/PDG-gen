public class func{
public void createSocket(String host,int port,InetAddress localHostAddr,int localPort){
    socket.connect(new InetSocketAddress(host, port));
}
}
