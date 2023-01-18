//52
public class func{
	public void main(String[] args){
      socket.connect(new InetSocketAddress(Server.port));
      log("is connected:" + socket.isConnected());
      OutputStream os = socket.getOutputStream();
}
}
