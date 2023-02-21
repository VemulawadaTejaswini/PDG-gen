public class A{
	protectedClient(SelectableChannel channel, long endTime) throws IOException {
		//...
		Selector selector = null;
		//...
		key = channel.register(selector, 0);
	}
}