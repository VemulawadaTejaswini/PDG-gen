//121
public class func{
public void createSocketConnection(InetAddress host,int port,int timeout){
        socket.connect(new InetSocketAddress(host, port), timeout);
        socket.setSoTimeout(timeout);
}
}
