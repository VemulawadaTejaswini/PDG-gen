public class A{
	public OutboundRequest newRequest() throws IOException {
		synchronized (lock) {
			if (conn != null) {
				try {
					conn.muxClient.isIdle();
				} catch (IOException e) {
					conn = null;
				}
			}
			if (conn == null) {
				RMIClientSocketFactory csf = this.c;
				Socket socket;
				if (csf != null) {
					socket = csf.createSocket(h, p);
					if (logger.isLoggable(Level.FINEST)) {
						logger.log(Level.FINEST,"created socket {0} using factory {1}",new Object[]{ socket, csf });
					}
				} else {
					if (useNIO) {
						SocketAddress addr = new InetSocketAddress(h, p);
						SocketChannel channel = SocketChannel.open();
						socket = channel.socket();
						socket.connect(addr);
					} else {
						socket = new Socket(h, p);
					}
					
					if (logger.isLoggable(Level.FINEST)) {
						logger.log(Level.FINEST, "created socket {0}",new Object[]{ socket });
					}
				}
				
				try {
					socket.setTcpNoDelay(true);
				} catch (SocketException e) {
				}
				try {
					socket.setKeepAlive(true);
				} catch (SocketException e) {
				}
				
				MuxClient muxClient;
				SocketChannel channel = socket.getChannel();
				if (useNIO && socket.getChannel() != null) {
					channel.configureBlocking(false);
					muxClient = new MuxClient(channel);
				} else {
					muxClient = new MuxClient(socket.getOutputStream(),socket.getInputStream());
				}
				muxClient.start();
				
				conn = new Connection(socket, muxClient);
			} else {
				SecurityManager sm = System.getSecurityManager();
				if (sm != null) {
					sm.checkConnect(conn.socket.getInetAddress().getHostAddress(),conn.socket.getPort());
				}
			}
			return conn.muxClient.newRequest();
		}
		
	}
}