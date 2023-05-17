public class func{
public void getPort(){
                sock.bind(new InetSocketAddress(0));
                int value = sock.getLocalPort();
                sock.close();
}
}
