//237
public class func{
	public void getConnection(String alias,int timeout){
        HttpURLConnection urlConn = (HttpURLConnection) new URL("http", "localhost", PORT, alias).openConnection();
        urlConn.setConnectTimeout(5 * 1000);
        urlConn.setReadTimeout(timeout);
        urlConn.connect();
}
}
