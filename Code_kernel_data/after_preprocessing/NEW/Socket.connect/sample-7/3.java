//3
public class func{
public void connectSocket(final Socket socket,final InetSocketAddress remoteAddress,final InetSocketAddress localAddress,final HttpParams params){
        final int connTimeout = HttpConnectionParams.getConnectionTimeout(params);
        final int soTimeout = HttpConnectionParams.getSoTimeout(params);
            sock.setSoTimeout(soTimeout);
            sock.connect(remoteAddress, connTimeout);
            throw new ConnectTimeoutException("Connect to " + remoteAddress + " timed out");
}
}
