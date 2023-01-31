//184
public class func{
	public void isAccessibleSocket(String host,int port,int timeOutInMSec){
      InetSocketAddress inetSocketAddress = new InetSocketAddress( host , port );
      socket.connect( inetSocketAddress , timeOutInMSec );
}
}
