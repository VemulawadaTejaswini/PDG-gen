//66
public class func{
	public void getOrCreateSocket(boolean resend){
            Utilities.close(socket);
        if (socket == null || socket.isClosed()) {
            try {
                if (proxy == null) {
                    socket = factory.createSocket(host, port);
                    logger.debug("Connected new socket {}", socket);
                } else if (proxy.type() == Proxy.Type.HTTP) {
                    TlsTunnelBuilder tunnelBuilder = new TlsTunnelBuilder();
                    socket = tunnelBuilder.build((SSLSocketFactory) factory, proxy, proxyUsername, proxyPassword, host, port);
                    logger.debug("Connected new socket through http tunnel {}", socket);
                } else {
                    boolean success = false;
                    Socket proxySocket = null;
                    try {
                        proxySocket = new Socket(proxy);
                        proxySocket.connect(new InetSocketAddress(host, port), connectTimeout);
                        socket = ((SSLSocketFactory) factory).createSocket(proxySocket, host, port, false);
                        success = true;
                    } finally {
                        if (!success) {
                            Utilities.close(proxySocket);
                        }
                    }
                    logger.debug("Connected new socket through socks tunnel {}", socket);
                }

                socket.setSoTimeout(readTimeout);
                socket.setKeepAlive(true);

                if (errorDetection) {
                    monitorSocket(socket);
                }

                reconnectPolicy.reconnected();
                logger.debug("Made a new connection to APNS");
            } catch (IOException e) {
                logger.error("Couldn't connect to APNS server", e);
                // indicate to clients whether this is a resend or initial send
                throw new NetworkIOException(e, resend);
            }
        }
}
}
