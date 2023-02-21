public class A{
	publicUDPClient(long endTime) throws IOException {
		super(DatagramChannel.open(), endTime);
	}
	
	voidbind(SocketAddress addr) throws IOException {
		DatagramChannel channel = (DatagramChannel) key.channel();
		channel.socket().bind(addr);
	}
	
	voidconnect(SocketAddress addr) throws IOException {
		DatagramChannel channel = (DatagramChannel) key.channel();
		channel.connect(addr);
	}
}