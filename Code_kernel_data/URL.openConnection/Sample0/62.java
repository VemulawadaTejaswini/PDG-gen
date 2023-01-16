//61
public class func{
	public void testHeaderListMultipleHeaders(){
        final URL url = new URL(getBaseUri().toString() + "resource");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("hello", "world");
        connection.addRequestProperty("hello", "universe");
        connection.setDoOutput(false);
        connection.connect();
}
}
