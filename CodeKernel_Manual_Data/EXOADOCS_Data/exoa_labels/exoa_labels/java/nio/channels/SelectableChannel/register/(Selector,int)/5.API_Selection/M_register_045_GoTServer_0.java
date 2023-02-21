public class A{
	public void acceptConnections()throws IOException, InterruptedException {

		SelectionKey acceptKey =this.selectableChannel.register( this.selector,SelectionKey.OP_ACCEPT );

		System.out.println( "Waiting for connections" );
		while (true) {
			this.keysAdded = acceptKey.selector().select();
			if(DEBUG)System.out.println( "Selector returned "+ this.keysAdded + " ready for IO operations" );

			Set readyKeys = this.selector.selectedKeys();
			Iterator i = readyKeys.iterator();
			
			while (i.hasNext()) {
				SelectionKey key = (SelectionKey)i.next();
				i.remove();
				
				if ( key.isAcceptable() ) {
					ServerSocketChannel nextReady =(ServerSocketChannel)key.channel();

					if(DEBUG)System.out.println( "isAcceptable: read="+ key.isReadable() + " write="+ key.isWritable()+ " accept=" + key.isAcceptable() );

					SocketChannel channel = nextReady.accept();
					channel.configureBlocking( false );
					SelectionKey readKey =channel.register( this.selector,SelectionKey.OP_READ|SelectionKey.OP_WRITE  );
					readKey.attach(new ChannelController( channel , this ) );

				}
				
				else if ( key.isReadable() ) {
					SelectableChannel nextReady =(SelectableChannel) key.channel();
					if(DEBUG)System.out.println( "isReadable: read="+ key.isReadable() + " write="+ key.isWritable()+ " accept=" + key.isAcceptable() );
					IOUtility.readMessage((ChannelController)  key.attachment() );
				}
				
				else if ( key.isWritable() ) {
					if(DEBUG)System.out.println( "isWriteable(): read="+ key.isReadable() + " write="+key.isWritable()+" accept=" + key.isAcceptable() );
					ChannelController channelController =(ChannelController) key.attachment();
					String serverHello ="<?xml version='1.0' encoding='utf-8'?>\n"+"<service>\n"+"<type>\n"+"id\n"+"</type>\n"+"<id>"+channelController.getId()+"</id>\n"+"</service>\n";
					if(DEBUG)System.out.println("accept: "+serverHello);

					ByteBuffer buf =ByteBuffer.wrap( serverHello.getBytes() );
					int nbytes =channelController.getChannel().write( buf );

				}
			}
		}
	}
}