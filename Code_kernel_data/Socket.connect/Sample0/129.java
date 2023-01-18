//128
public class func{
	public void test_bindLjava_net_SocketAddress(){
        InetSocketAddress clAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), portNumber);
        clientSocket.connect(clAddress);
        Socket servSock = theSocket.accept();
}
}
