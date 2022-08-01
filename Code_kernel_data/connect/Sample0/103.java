//102
public class func{
	public void openConnection(){
      socket.connect(new InetSocketAddress(_host, _port), CONNECT_TIMEOUT);
      InputStream is = socket.getInputStream();
}
}
