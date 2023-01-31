//5
public class func{
	public void main(String[] args){
            ss.bind(new InetSocketAddress(0));
            int localPort = ss.getLocalPort();
            SocketChannel channel = SocketChannel.open(new InetSocketAddress("localhost", localPort));
}
}
