//265
public class func{
	public void openConnection(String url){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS);
    connection.setReadTimeout(DEFAULT_READ_TIMEOUT_MILLIS);
    connection.setDoInput(true);
}
}
