public class func{
public void openConnection(final OperatedClientConnection conn,final HttpHost target,final InetAddress local,final HttpContext context,final HttpParams params){
            socket.connect(new InetSocketAddress(mProxyHost, mProxyPort), CONNECT_TIMEOUT_MILLISECONDS);
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
}
}
