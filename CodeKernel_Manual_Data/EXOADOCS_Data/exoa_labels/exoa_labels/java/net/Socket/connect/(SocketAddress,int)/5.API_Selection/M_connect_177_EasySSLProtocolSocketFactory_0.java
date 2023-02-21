public class A{
	public Socket createSocket(final String host,final int port,final InetAddress localAddress,final int localPort,final HttpConnectionParams params)throws IOException,UnknownHostException,ConnectTimeoutException {
		if (params == null) {
			throw new IllegalArgumentException("Parameters may not be null");
		}
		final int timeout = params.getConnectionTimeout();
		final SocketFactory socketfactory = getSSLContext().getSocketFactory();
		if (timeout == 0) {
			return socketfactory.createSocket(host,port,localAddress,localPort);
		}
		final Socket socket = socketfactory.createSocket();
		final SocketAddress localaddr = new InetSocketAddress(localAddress,localPort);
		final SocketAddress remoteaddr = new InetSocketAddress(host, port);
		socket.bind(localaddr);
		socket.connect(remoteaddr, timeout);
		return socket;
	}
}