//153
public class func{
	public void initializeDefaultSocketParameters(final InetSocketAddress bindAddress,final InetAddress connectAddress){
            socket.connect(new InetSocketAddress(connectAddress, ss.getLocalPort()), 10000);
            initializeDefaultSocketParameters(socket);
}
}
