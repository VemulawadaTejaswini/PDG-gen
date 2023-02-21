public class A{
	private void registerNewChannels() throws IOException {
		synchronized(channels) {
			int size = channels.size();
			for (int i = 0; i < size; i++) {
				RegisterChannelRecord record = channels.get(i);
				SelectorHandler selectorHandler =getSelectorHandler(record.protocol);
				Selector auxSelector = selectorHandler.getSelector();
				SelectableChannel channel = record.channel;
				SelectionKey readKey =channel.register(auxSelector, SelectionKey.OP_READ);
				readKey.attach(System.currentTimeMillis());
			}
			
			channels.clear();
		}
	}
}