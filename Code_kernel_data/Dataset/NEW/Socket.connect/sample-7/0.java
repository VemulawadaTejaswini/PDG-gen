//0
public class func{
public void connectSocket(final Socket socket,final InetSocketAddress remoteAddress,final InetSocketAddress localAddress,final HttpParams params){
        int connTimeout = HttpConnectionParams.getConnectionTimeout(params);
        int soTimeout = HttpConnectionParams.getSoTimeout(params);
            sock.setSoTimeout(soTimeout);
            sock.connect(remoteAddress, connTimeout);
            throw new ConnectTimeoutException("Connect to " + remoteAddress + " timed out");
        if (remoteAddress instanceof HttpInetSocketAddress) {
            hostname = ((HttpInetSocketAddress) remoteAddress).getHttpHost().getHostName();
        } else {
            hostname = remoteAddress.getHostName();
        }
}
}
