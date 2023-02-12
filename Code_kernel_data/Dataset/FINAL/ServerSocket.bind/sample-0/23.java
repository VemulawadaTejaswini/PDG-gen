public class func{
public void test_bindLjava_net_SocketAddress(){
        InetSocketAddress theAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), 0);
        theSocket.bind(theAddress);
        int portNumber = theSocket.getLocalPort();
}
}
