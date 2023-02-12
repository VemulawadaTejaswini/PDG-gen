public class func{
public void createSocket(InetAddress address,int port){
            s.connect(new InetSocketAddress(address, port));
        return new Socket(address, port);
}
}
