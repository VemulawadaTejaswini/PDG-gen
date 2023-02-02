//140
public class func{
public void test_connectLjava_net_SocketAddressI(){
        SocketAddress nonListeningAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), 42);
            theSocket.connect(nonListeningAddress, 1000);
}
}
