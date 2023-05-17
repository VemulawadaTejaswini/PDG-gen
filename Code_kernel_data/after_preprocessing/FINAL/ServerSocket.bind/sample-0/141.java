public class func{
public void start(){
        sock.bind(null);
        address = new InetSocketAddress(hostname, sock.getLocalPort());
        port = address.getPort();
}
}
