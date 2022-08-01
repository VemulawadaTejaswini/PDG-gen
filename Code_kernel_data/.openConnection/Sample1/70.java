//69
public class func{
	public void getStream(String urlString){
          URL url = new URL(urlString);
          URLConnection urlConnection = url.openConnection();
          urlConnection.setConnectTimeout(250);
          urlConnection.setReadTimeout(5*1000);
          return urlConnection.getInputStream();
}
}
