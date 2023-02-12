public class func{
public void test_getLocalSocketAddress(){
        theSocket
                .bind(new InetSocketAddress(InetAddress.getLocalHost(), 0));
        int localPort = theSocket.getLocalPort();
}
}
