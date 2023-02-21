public class A{
	protected boolean connect(DatagramChannel handle,SocketAddress remoteAddress) throws Exception {
		handle.connect(remoteAddress);
		return true;
	}
}