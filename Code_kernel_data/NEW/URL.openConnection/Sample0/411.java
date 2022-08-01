//410
public class func{
	public void getHttpURLConnection(URL requestUrl){
      conn = (HttpURLConnection)requestUrl.openConnection();
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setUseCaches (false);
      conn.setDoOutput(true);
}
}
