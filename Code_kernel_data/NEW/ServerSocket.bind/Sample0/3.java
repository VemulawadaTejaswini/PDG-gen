//2
public class func{
	public void listen(String hostname,int port,F2<Void,BufferedReader,DataOutputStream> protocol){
      socket.bind(U.isEmpty(hostname) ? new InetSocketAddress(port) : new InetSocketAddress(hostname, port));
      Log.info("Starting TCP/IP server", "host", hostname, "port", port);
}
}
