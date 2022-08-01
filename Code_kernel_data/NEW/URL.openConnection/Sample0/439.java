//438
public class func{
	public void urlGetBytes(URL url){
    URLConnection conn = url.openConnection();
    HttpURLConnection hc = (HttpURLConnection)conn;
    assertEquals(HttpURLConnection.HTTP_OK, hc.getResponseCode());
}
}
