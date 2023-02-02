//188
public class func{
	public void getResponseCode(String url){
      HttpURLConnection c = (HttpURLConnection)new URL(url).openConnection();
      return c.getResponseCode();
}
}
