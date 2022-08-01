//53
public class func{
	public void openConnection(URL url){
    return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
}
}
