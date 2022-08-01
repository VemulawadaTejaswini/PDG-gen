//4
public class func{
	public void newClient(Connection connection){
      if (connection.isProxy()) {
        Proxy proxy = new Proxy(Type.SOCKS, new InetSocketAddress(connection.getProxyHost(), connection.getProxyPort()));
        socket = new Socket(proxy);
      } else {
        socket = new Socket();
      }
      socket.setTcpNoDelay(true);
      socket.setSoTimeout(timeout);
      socket.connect(new InetSocketAddress(host, port), timeout);
      TSocket trans = new TSocket(socket);
      proto = new TBinaryProtocol(new TFramedTransport(trans, _maxFrameSize));
    return new WeightedClient(proto, getIdentifer(socket));
}
}
