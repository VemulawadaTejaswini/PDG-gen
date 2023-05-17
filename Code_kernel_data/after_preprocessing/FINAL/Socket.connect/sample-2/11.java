public class func{
public void createSocket(final String host,final int port,final InetAddress localInetAddress,final int localPort,final HttpConnectionParams httpConnectionParams){
      socket.bind(localSocketAddress);
      socket.connect(remoteSocketAddress, connectionTimeout);
}
}
