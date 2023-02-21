public class A{
	public boolean finishConnect ()throws IOException{
		if (!isOpen())throw new ClosedChannelException();

		if (!isConnected() && !connectionPending)throw new NoConnectionPendingException();

		if (isConnected())return true;


		Selector selector = provider().openSelector();
		register(selector, SelectionKey.OP_CONNECT);
		
		if (isBlocking()){
			connectionPending = false;
			return true;
		}
		
		if (ready == 1){
			connectionPending = false;
			return true;
		}
		
		return false;
	}
}