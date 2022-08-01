//31
public class func{
	public void run(){
                s.connect(new InetSocketAddress(host, port));
                InputStream in = s.getInputStream();
                OutputStream out = s.getOutputStream();
                out.write(INITIAL_PACKET);
}
}
