//11
public class func{
	public void main(String[] args){
        InetSocketAddress s = new InetSocketAddress(InetAddress.getLocalHost(), 0);
        sock.bind(s);
        int port = sock.getLocalPort();
        sock.close();
        Endpoint.publish(address, new GreeterImpl(port));
}
}
