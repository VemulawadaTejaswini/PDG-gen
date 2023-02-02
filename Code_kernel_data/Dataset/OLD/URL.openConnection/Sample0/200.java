//199
public class func{
	public void getURLReader(final String uri){
      URL url = new URL( uri );
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.connect();
      InputStream in = connection.getInputStream();
      return new InputStreamReader( in );
}
}
