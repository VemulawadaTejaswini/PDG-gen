public class A{
	private Socket(SocketAddress address, SocketAddress localAddr,boolean stream) throws IOException {
		//...
		if (address != null)connect(address);
	}
}