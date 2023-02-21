public class A{
	protected void onConnectOps(Context ctx) throws IOException{
		if (opConnectToRegister== null){
			opConnectToRegister = new ConcurrentHashMap<SocketAddress[],CallbackHandler>();
		}
		
		if (!opConnectToRegister.isEmpty()){
			Iterator<SocketAddress[]> iterator =opConnectToRegister.keySet().iterator();
			SocketAddress[] remoteLocal;
			SelectionKey key;
			while(iterator.hasNext()){
				remoteLocal = iterator.next();
				final DatagramChannel datagramChannel = DatagramChannel.open();
				datagramChannel.socket().setReuseAddress(true);
				if (remoteLocal[1] != null){
					datagramChannel.socket().bind(remoteLocal[1]);
				}
				datagramChannel.configureBlocking(false);
				datagramChannel.connect(remoteLocal[0]);
				key = datagramChannel.register(selector,SelectionKey.OP_READ|SelectionKey.OP_WRITE,opConnectToRegister.remove(remoteLocal));
				onConnectInterest(key, ctx);
			}
		}
	}
}