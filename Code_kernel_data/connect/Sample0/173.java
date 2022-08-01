//172
public class func{
	public void createTorSocket(InetAddress host,int port,String proxyHost,int proxyPort){
        socket.connect(new InetSocketAddress(host, port));
        return (SSLSocket) mContext.getSocketFactory().createSocket(socket, host.getHostName(), port, true);
}
}
