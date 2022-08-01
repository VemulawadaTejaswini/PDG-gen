//260
public class func{
	public void sendRequestToServiceUsingEureka(){
        int serverPort = nextServerInfo.getPort();
            s.connect(new InetSocketAddress(nextServerInfo.getHostName(), serverPort));
                    + nextServerInfo.getHostName() + " at port " + serverPort);
                    + nextServerInfo.getHostName() + " at port " + serverPort + "due to Exception " + e);
}
}
