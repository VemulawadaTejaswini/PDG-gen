public class A{
	public void run() {
		while (true) {
			try {
				_selector.select();
				
				synchronized(_socketsToAdd) {
					if (_socketsToAdd.size() > 0) {
						
						_selector.selectNow();
						
						Iterator myNewChannels = _socketsToAdd.iterator();
						while(myNewChannels.hasNext()) {
							SelectableChannel myChannel =(SelectableChannel) myNewChannels.next();
							SelectionKey myKey =myChannel.register(_selector,SelectionKey.OP_READ);
							myKey.attach(new ControlBlock(myKey,_dispatcherFactory.newDispatcher()));
						}
						
						_socketsToAdd.clear();
					}
				}
				
				Iterator myKeys = _selector.selectedKeys().iterator();
				
				while (myKeys.hasNext()) {
					SelectionKey myKey = (SelectionKey) myKeys.next();
					
					if (myKey.isValid()) {
						ControlBlock myBlock =(ControlBlock) myKey.attachment();

						try {
							myBlock.process();
						} catch (IOException anIOE) {
							myKey.cancel();
							((SocketChannel) myKey.channel()).close();
						}
						
					} else {
						myKey.cancel();
						((SocketChannel) myKey.channel()).close();
					}
					
					myKeys.remove();
				}
			} catch (IOException anIOE) {
				System.err.println("EventProcessor error'd");
				anIOE.printStackTrace(System.err);
			}
		}
	}
}