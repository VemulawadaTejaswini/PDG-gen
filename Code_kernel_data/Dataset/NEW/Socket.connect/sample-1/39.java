//39
public class func{
public void connect(ImapSettings settings,TrustedSocketFactory socketFactory){
                    Log.d(LOG_TAG, "Connecting to " + settings.getHost() + " as " + address);
                SocketAddress socketAddress = new InetSocketAddress(address, settings.getPort());
                if (settings.getConnectionSecurity() == ConnectionSecurity.SSL_TLS_REQUIRED) {
                    socket = socketFactory.createSocket(
                            null,
                            settings.getHost(),
                            settings.getPort(),
                            settings.getClientCertificateAlias());
                } else {
                    socket = new Socket();
                }
                socket.connect(socketAddress, SOCKET_CONNECT_TIMEOUT);
                Log.w(LOG_TAG, "could not connect to "+address, e);
        throw new MessagingException("Cannot connect to host", connectException);
}
}
