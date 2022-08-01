//10
public class func{
	public void test_isBound(){
        server.bind(new InetSocketAddress(InetAddress.getLocalHost(), 0));
        InetSocketAddress boundAddress = new InetSocketAddress(server
                .getInetAddress(), server.getLocalPort());
        client.connect(boundAddress);
        worker = server.accept();
}
}
