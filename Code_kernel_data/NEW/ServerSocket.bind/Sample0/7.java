//6
public class func{
	public void test_bindLjava_net_SocketAddress(){
            theAddress = new InetSocketAddress(InetAddress.getLocalHost(), 0);
            theSocket.bind(theAddress);
            SocketAddress localAddress = theSocket.getLocalSocketAddress();
            theSocket2.bind(localAddress);
}
}
