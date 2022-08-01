//313
public class func{
	public void Request(String url,int connectTimeout,int readTimeout){
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(connectTimeout);
            connection.setReadTimeout(readTimeout);
}
}
