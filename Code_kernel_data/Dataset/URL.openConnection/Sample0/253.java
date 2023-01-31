//252
public class func{
	public void performRequest(String urlString){
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        conn.disconnect();
}
}
