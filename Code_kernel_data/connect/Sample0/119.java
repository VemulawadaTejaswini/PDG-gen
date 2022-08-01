//118
public class func{
	public void createSocket(String host,int port){
      socket.connect(new InetSocketAddress(host, port), CONNECT_MS);
      socket.setSoTimeout(RESPONSE_TIMEOUT_MS);
}
}
