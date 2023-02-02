//38
public class func{
	public void stat(String host,int port){
            s.connect(new InetSocketAddress(host, port));
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            os.write(reqBytes);
}
}
