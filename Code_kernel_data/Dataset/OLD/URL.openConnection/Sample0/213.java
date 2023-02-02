//212
public class func{
	public void getHttpURLConnection(String urlAsString){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
        hConn.setInstanceFollowRedirects(false);
        hConn.setRequestMethod("HEAD");
}
}
