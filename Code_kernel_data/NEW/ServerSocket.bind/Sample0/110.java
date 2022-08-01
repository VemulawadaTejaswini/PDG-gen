//109
public class func{
	public void bindSocket(ServerSocket socket){
        socket.bind(new InetSocketAddress(getPort()), 2 * getMaxActiveClientCount());
}
}
