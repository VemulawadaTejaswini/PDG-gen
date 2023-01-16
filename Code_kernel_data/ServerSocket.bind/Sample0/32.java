//31
public class func{
	public void testJaasDualStopWithOpenConnection(){
        InetAddress address = InetAddress.getLocalHost();
        socket.bind(new InetSocketAddress(address, listenPort));
        LOG.info("bound address: " + socket);
        socket.close();
}
}
