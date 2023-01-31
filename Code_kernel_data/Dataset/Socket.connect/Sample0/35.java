//34
public class func{
	public void connect(){
    socket.connect(new InetSocketAddress(port));
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    handle(in ,out);
}
}
