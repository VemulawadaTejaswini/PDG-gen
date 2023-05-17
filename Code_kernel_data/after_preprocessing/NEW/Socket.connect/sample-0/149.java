//149
public class func{
public void createSocket(String host,int port,InetAddress localAddr,int localPort){
            s.connect(new InetSocketAddress(host, port));
        return new Socket(host, port, localAddr, localPort);
}
}
