//59
public class func{
	public void checkPort(String name,InetSocketAddress address,int connectTimeout){
      socket = new Socket();
      socket.connect(address, connectTimeout);
      throw new IOException("Failed to connect to " + name
                            + " at " + address
                            + " after " + connectTimeout + "millisconds"
                            + ": " + e,
          e);
}
}
