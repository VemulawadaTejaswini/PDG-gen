public class func{
public void test_bindLjava_net_SocketAddressI(){
        theAddress = new InetSocketAddress(InetAddress.getLocalHost(), 0);
        theSocket.bind(theAddress, 4);
        localAddress = theSocket.getLocalSocketAddress();
}
}
