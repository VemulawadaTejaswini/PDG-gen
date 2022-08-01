//44
public class func{
	public void proxyRequest(String uri){
      connection = (HttpURLConnection) new URL(uri).openConnection();
      connection.setRequestMethod("GET");
      connection.setDoOutput(true);
      connection.setReadTimeout(10000);
      is = connection.getInputStream();
}
}
