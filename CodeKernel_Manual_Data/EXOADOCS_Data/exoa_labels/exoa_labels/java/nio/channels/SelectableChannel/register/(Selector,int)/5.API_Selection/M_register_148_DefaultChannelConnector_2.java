public class A{
	private boolean register(Selector selector, SelectableChannel channel){
		boolean registered;
		try{
			if (channel.isBlocking()){
				channel.configureBlocking(false);
			}
			SelectableChannel adaptee = channel instanceof AdaptableChannel? (SelectableChannel) ((AdaptableChannel) channel).getAdapteeChannel() : channel;
			SelectionKey key = adaptee.keyFor(selector);
			if (key == null){
				key = adaptee.register(selector, SelectionKey.OP_READ);
			}
			registered = keepConnection(key, channel, ACCEPT_TIMEOUT);
			if (!registered){
				try{
					channel.close();
				}
				catch (Exception x){
				}
				
				getLog().error("Channel timeout failed");
			}
		}
		catch (Exception x){
			registered = false;
			
			try{
				channel.close();
			}
			catch (Exception z){
			}
			
			getLog().error("Channel registration failed", x);
		}
		return registered;
	}
}