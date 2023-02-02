//226
public class func{
	public void getURLInputStream(final String uri){
      URL url = new URL( uri );
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.connect();
      InputStream in = connection.getInputStream();
}
}
