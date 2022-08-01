//7
public class func{
	public void test_isConnected(){
        server = new ServerSocket();
        server.bind(theAddress);
        InetSocketAddress boundAddress = new InetSocketAddress(server
                .getInetAddress(), server.getLocalPort());
        client.connect(boundAddress);
        worker = server.accept();
}
}
