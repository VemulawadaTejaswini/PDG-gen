//47
public class func{
	public void getFreePort(){
                ss.bind(new InetSocketAddress(port));
                ss.close();
                ss = new ServerSocket();
                ss.setReuseAddress(false);
}
}
