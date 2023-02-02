//24
public class func{
	public void invalidRequestUri(final String path){
        final URL url = new URL(getBaseUri().toString() + path + "/resource{");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "text/plain");
        connection.connect();
        assertEquals(400, connection.getResponseCode());
}
}
