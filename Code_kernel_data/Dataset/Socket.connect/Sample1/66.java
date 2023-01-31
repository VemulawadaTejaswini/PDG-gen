//65
public class func{
	public void create(final SocketAddress pSocketAddress,final int pTimeoutMilliseconds){
    final Socket socket = new Socket();
    socket.connect(pSocketAddress, pTimeoutMilliseconds);
    return new SocketConnection(socket);
}
}
