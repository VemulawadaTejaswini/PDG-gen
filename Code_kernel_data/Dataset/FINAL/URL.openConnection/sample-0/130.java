public class func{
public void get(final String path){
        final InetSocketAddress address = new InetSocketAddress(getPort());
        final URL url = new URL("http:
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
}
}
