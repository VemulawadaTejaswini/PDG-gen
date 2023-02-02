//9
public class func{
public void createSocket(String host,int port,InetAddress localHost,int localPort){
        socket.bind(new InetSocketAddress(host, localPort));
        socket.connect(new InetSocketAddress(host, port), socketTimeout);
}
}
