//175
public class func{
	public void connect(String connectionID,JID peer){
        final InetSocketAddress address = new InetSocketAddress("localhost",
            4711);
        socket.connect(address, 30000);
        socket.setTcpNoDelay(true);
}
}
