//78
public class func{
	public void getServerSockets(InetAddress localEp){
            InetSocketAddress address = new InetSocketAddress(localEp, DatabaseDescriptor.getStoragePort());
                socket.bind(address,500);
}
}
