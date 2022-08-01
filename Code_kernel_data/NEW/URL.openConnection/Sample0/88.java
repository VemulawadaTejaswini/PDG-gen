//87
public class func{
	public void pingURL(String urlLoc){
      final URL url = new URL(urlLoc);
      final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.162 Safari/535.19");
      conn.setConnectTimeout(5000);
      int response = conn.getResponseCode();
}
}
