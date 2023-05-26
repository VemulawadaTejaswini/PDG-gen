public class func{
public void createConnection(final String uri,final String authValue){
        final URL url = new URL(uri);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(0);
        connection.setReadTimeout(0);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", authValue);
        connection.setDoOutput(true);
}
}
