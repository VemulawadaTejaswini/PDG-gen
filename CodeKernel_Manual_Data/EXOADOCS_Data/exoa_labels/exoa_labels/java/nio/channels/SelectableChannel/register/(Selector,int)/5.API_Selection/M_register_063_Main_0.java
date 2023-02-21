public class A{
	public void acceptConnections()throws IOException, InterruptedException {

		SelectionKey acceptKey =this.selectableChannel.register( this.selector,SelectionKey.OP_ACCEPT );

		log.info( "Accepting connections..." );
		
		while (( this.keysAdded = acceptKey.selector().select()) > 0 ) {
			
			Set readyKeys = this.selector.selectedKeys();
			Iterator i = readyKeys.iterator();
			
			log.info( "Number of selected keys: " +acceptKey.selector().keys().size() );

			while (i.hasNext()) {
				SelectionKey key = (SelectionKey)i.next();
				i.remove();
				CommandParse parser = null;
				
				if ( key.isAcceptable() ) {
					ServerSocketChannel nextReady =(ServerSocketChannel)key.channel();
					Socket s = nextReady.accept();
					s.getChannel().configureBlocking( false );
					SelectionKey readKey =s.getChannel().register( this.selector,SelectionKey.OP_READ|SelectionKey.OP_WRITE  );
					readKey.attach( s );
					this.callback.put( s,new ChannelOutputHandler( s.getChannel() ) );
				}
				else if ( key.isReadable() ) {
					SelectableChannel nextReady =(SelectableChannel) key.channel();
					Socket socket = (Socket) key.attachment();
					
					this.readMessage( socket.getChannel(),(OutputHandler) this.callback.get( socket ) );
				}
				else if ( key.isWritable() ) {
					Socket s = (Socket) key.attachment();
					CommandBegin session = new CommandBegin();
					try {
						session.execute( (OutputHandler) this.callback.get( s ) );
					}
					catch ( IOException e ) {
						log.info( "Handled exception: " + e.toString() );
						key.cancel();
						PlayerSession player = (PlayerSession)PlayerFactory.getInstance().get( s );
						try {
							player.remove();
						}
						catch ( javax.ejb.RemoveException x ) {
							x.printStackTrace();
						}
					}
				}
			}
		}
	}
}