//152
public class func{
	public void tryAllAddresses(Socket sock,String host,int port,int connectTimeout){
    InetAddress[] addresses = InetAddress.getAllByName(host);
    for (InetAddress addr : addresses) {
      try {
        sock.connect(new InetSocketAddress(addr, port), connectTimeout);
        return;
      } catch (SocketTimeoutException e) {
      }
    }
}
}
