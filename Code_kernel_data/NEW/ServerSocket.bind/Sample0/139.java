//138
public class func{
	public void createServerSocketTry(String listenAddress,int port,boolean ssl){
            socket.bind(new InetSocketAddress(listenAddress, port));
            throw DbException.convertIOException(e, "port: " + port + " ssl: " + ssl);
}
}
