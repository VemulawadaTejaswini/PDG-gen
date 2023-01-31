//240
public class func{
	public void execUrl(String uri){
      URL url = new URL(uri);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestProperty("User-Agent", AGENT);
      res = readStream(conn.getInputStream());
}
}
