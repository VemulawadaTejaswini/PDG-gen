public class A{
	public Socket createSocket(String host,int port, InetAddress localAddress, int localPort,HttpConnectionParams params) throws IOException, UnknownHostException,ConnectTimeoutException {
		Socket rval;
		if (params == null) {
			throw new IllegalArgumentException("Parameters may not be null");
		}
		int timeout = params.getConnectionTimeout();
		if (timeout == 0) {
			rval = socketFactory.createSocket(host, port, localAddress, localPort);
		} else {
			rval = socketFactory.createSocket();
			SocketAddress localaddr = new InetSocketAddress(localAddress, localPort);
			SocketAddress remoteaddr = new InetSocketAddress(host, port);
			rval.bind(localaddr);
			rval.connect(remoteaddr, timeout);
		}
		return rval;
	}
}