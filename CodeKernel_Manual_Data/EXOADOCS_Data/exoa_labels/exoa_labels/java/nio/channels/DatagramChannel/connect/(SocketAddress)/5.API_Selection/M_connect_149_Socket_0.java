public class A{
	private Socket(SocketAddress address, SocketAddress localAddr,boolean stream) throws IOException {
		setImpl();
		
		if (address == null)throw new NullPointerException();

		try {
			createImpl(stream);
			if (localAddr == null)localAddr = new InetSocketAddress(0);
			bind(localAddr);
			if (address != null)connect(address);
		} catch (SocketException e) {
			close();
			throw e;
		}
	}
}