//4
public class func{
public void connectSocket(final int connectTimeout,final Socket socket,final HttpHost host,final InetSocketAddress remoteAddress,final InetSocketAddress localAddress,final HttpContext context){
                        if (localAddress != null) {
                            sock.bind(localAddress);
                        }
                            sock.connect(remoteAddress, connectTimeout);
                            throw new ConnectTimeoutException(ex, host, remoteAddress.getAddress());
}
}
