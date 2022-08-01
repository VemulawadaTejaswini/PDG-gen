//504
public class func{
	public void connect(MockWebServer server,URL url){
                return (HttpURLConnection) url.openConnection(server.toProxyAddress());
}
}
