public class A{
	public IoSession connect( SocketAddress address, SocketAddress localAddress,IoHandler handler, SessionInitializer initializer ) throws IOException{
		//...
		DatagramChannel ch = DatagramChannel.open();
		//...
		ch.connect( address );
	}
}