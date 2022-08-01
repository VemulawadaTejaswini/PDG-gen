//40
public class func{
	public void getResponse(String target){
        URL url = new URL(target);
        URLConnection connection = url.openConnection();
        assertTrue(connection instanceof HttpURLConnection);
        connection.connect();
        InputStream in = connection.getInputStream();
}
}
