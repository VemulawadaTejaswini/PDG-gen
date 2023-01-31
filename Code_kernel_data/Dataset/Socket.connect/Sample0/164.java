//163
public class func{
	public void test_connectLjava_net_SocketAddressI(){
        SocketAddress nonConnectableAddress = new InetSocketAddress(InetAddress
                .getByAddress(new byte[] { 0, 0, 0, 0 }), 0);
            theSocket.connect(nonConnectableAddress, 1000);
}
}
