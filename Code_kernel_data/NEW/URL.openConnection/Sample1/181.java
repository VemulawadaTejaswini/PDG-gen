//180
public class func{
	public void httpsGet(WebServer webServer,String path){
        URL wsUrl = webServer.getUri().toURL();
        URL url = new URL("https", "localhost", wsUrl.getPort(), path);
        return (HttpsURLConnection) url.openConnection();
}
}
