public class func{
public void createSocket(InetAddress address,int port,InetAddress localAddress,int localPort){
        socket.connect(new InetSocketAddress(localAddress, port), socketTimeout);
}
}
