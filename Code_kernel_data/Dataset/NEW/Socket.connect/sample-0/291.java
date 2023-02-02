//291
public class func{
public void createSocket(String host,int port,InetAddress localAddress,int localPort,HttpConnectionParams params){
            socket.bind(new InetSocketAddress(localAddress, localPort));
            socket.connect(endpoint, timeout);
}
}
