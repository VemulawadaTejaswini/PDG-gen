public class func{
public void createConnection(final String uri,final String contentType,final String accept){
        final URL url = new URL(safeUri(uri));
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
}
}
