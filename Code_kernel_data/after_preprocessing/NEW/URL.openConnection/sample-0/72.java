//72
public class func{
public void testInvalidContentTypeHeader(){
        final URL url = new URL(getBaseUri().toString() + "ContentType");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "^^^");
        connection.setDoOutput(true);
        connection.connect();
        final OutputStream outputStream = connection.getOutputStream();
}
}
