//225
public class func{
	public void _getImageAsStream(String urlStr){
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        return conn.getInputStream();
}
}
