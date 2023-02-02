//119
public class func{
	public void getWrappedSocket(final InetAddress address,final int port,final int timeout){
        socket.connect(new InetSocketAddress(address, port), timeout);
        socket.setSoTimeout(timeout);
            return SocketUtils.wrapSocketInSslContext(socket);
}
}
