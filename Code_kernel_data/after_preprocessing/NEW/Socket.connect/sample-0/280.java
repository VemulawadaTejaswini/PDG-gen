//280
public class func{
public void createSocket(InetAddress address,int port,InetAddress localAddress,int localPort){
            sock.connect(new InetSocketAddress(address, port), connectTimeoutMs);
}
}
