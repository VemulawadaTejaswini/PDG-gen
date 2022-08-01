//232
public class func{
	public void download(String uri,String filePath){
      URL url = new URL(uri);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestProperty("User-Agent", AGENT);
      readStreamToFile(conn.getInputStream(), filePath);
}
}
