public class func{
public void connect(final String path,final int timeout_seconds){
        final URI uri = new URI("http", null, host, port, path, null, null);
        final URL url = uri.toURL();
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "text/xml");
}
}
