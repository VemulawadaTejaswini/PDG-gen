//1
public class func{
	public void connectSocket(Socket sock,String host,int port,InetAddress localAddress,int localPort,HttpParams params){
        if (this.nameResolver != null) {
            remoteAddress = new InetSocketAddress(this.nameResolver.resolve(host), port); 
        } else {
            remoteAddress = new InetSocketAddress(host, port);            
        }
            sock.connect(remoteAddress, timeout);
            throw new ConnectTimeoutException("Connect to " + remoteAddress + " timed out");
}
}
