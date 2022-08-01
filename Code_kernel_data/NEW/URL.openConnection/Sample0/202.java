//201
public class func{
	public void openConnection(String url){
        HttpURLConnection hConn = (HttpURLConnection) new URL(url).openConnection();
        hConn.setRequestProperty("content-charset", "UTF-8");
        hConn.setConnectTimeout(timeoutInMillis);
        hConn.setReadTimeout(timeoutInMillis);
        hConn.connect();
}
}
