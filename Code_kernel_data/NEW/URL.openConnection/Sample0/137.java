//136
public class func{
	public void simpleGetRequest(String url){
      connection = (HttpURLConnection) new URL(url).openConnection();
      prepareConnection(connection, null);
            return parseResponseWrapper(connection);
      if (connection != null) {
        try {
          return new DfeResponse<T>(connection.getResponseCode(), connection.getResponseMessage(), e);
        } catch (IOException ignored) {
        }
      }
}
}
