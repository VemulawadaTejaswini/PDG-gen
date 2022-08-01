//150
public class func{
	public void getConnection(String urlString,String username,String password){
      URL url = new URL(urlString);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("DELETE");
      connection.setReadTimeout(1000 * 60 * 60);
      connection.setConnectTimeout(1000 * 10);
}
}
