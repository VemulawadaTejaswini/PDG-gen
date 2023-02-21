public class A{
	//...
	voidconnect(SocketAddress addr) throws IOException {
		DatagramChannel channel = (DatagramChannel) key.channel();
		channel.connect(addr);
	}
}