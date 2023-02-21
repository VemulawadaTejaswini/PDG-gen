public class A{
	public IoSession connect( SocketAddress address, SocketAddress localAddress,IoHandler handler, SessionInitializer initializer ) throws IOException{
		if( address == null )throw new NullPointerException( "address" );
		if( handler == null )throw new NullPointerException( "handler" );

		if( !( address instanceof InetSocketAddress ) )throw new IllegalArgumentException( "Unexpected address type: "+ address.getClass() );

		if( localAddress != null && !( localAddress instanceof InetSocketAddress ) ){
			throw new IllegalArgumentException( "Unexpected local address type: "+ localAddress.getClass() );
		}
		
		if( initializer == null ){
			initializer = defaultInitializer;
		}
		
		DatagramChannel ch = DatagramChannel.open();
		boolean initialized = false;
		try{
			ch.socket().setReuseAddress( true );
			if( localAddress != null ){
				ch.socket().bind( localAddress );
			}
			ch.connect( address );
			ch.configureBlocking( false );
			initialized = true;
		}
		finally{
			if( !initialized ){
				ch.close();
			}
		}
		
		RegistrationRequest request = new RegistrationRequest( ch, handler, initializer );
		synchronized( this ){
			synchronized( registerQueue ){
				registerQueue.push( request );
			}
			startupWorker();
		}
		
		selector.wakeup();
		
		synchronized( request ){
			while( !request.done ){
				try{
					request.wait();
				}
				catch( InterruptedException e ){
				}
			}
		}
		
		if( request.exception != null ){
			ExceptionUtil.throwException( request.exception );
		}
		
		return request.session;
	}
}