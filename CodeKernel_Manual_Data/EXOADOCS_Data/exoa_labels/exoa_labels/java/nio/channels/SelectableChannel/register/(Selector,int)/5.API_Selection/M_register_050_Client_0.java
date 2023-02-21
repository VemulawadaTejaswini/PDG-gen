public class A{
	protectedClient(SelectableChannel channel, long endTime) throws IOException {
		boolean done = false;
		Selector selector = null;
		this.endTime = endTime;
		try {
			selector = Selector.open();
			channel.configureBlocking(false);
			key = channel.register(selector, 0);
			done = true;
		}
		finally {
			if (!done && selector != null)selector.close();
			if (!done)channel.close();
		}
	}
}