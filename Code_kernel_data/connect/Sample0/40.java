//39
public class func{
	public void isServiceSsl(String host,int port,boolean trustAllCerts){
            socket.connect(new InetSocketAddress(host, port), 1 * 1000);
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();
                out.write(1);
}
}
