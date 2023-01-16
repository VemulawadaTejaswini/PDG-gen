//1
public class func{
	public void createDynamicTCPSession(){
         ServerSocket s = new ServerSocket();
         s.bind(null);
         port = s.getLocalPort();
         s.close();
}
}
