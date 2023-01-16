//148
public class func{
	public void validateProxy(HttpHost p){
      InetSocketAddress endpointSocketAddr = new InetSocketAddress(p.getAddress().getHostAddress(), p.getPort());
      socket.connect(endpointSocketAddr, 3000);
}
}
