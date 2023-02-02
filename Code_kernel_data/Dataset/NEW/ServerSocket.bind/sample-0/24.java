//24
public class func{
public void test_bindLjava_net_SocketAddressI(){
        InetSocketAddress theAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), 0);
        theSocket.bind(theAddress, 5);
        int portNumber = theSocket.getLocalPort();
}
}
