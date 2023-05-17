public class func{
public void sendString(final URL url,final String dataString,final String userAgent){
      connection = (HttpURLConnection) url.openConnection();
      setUserAgent(connection, userAgent);
      return sendString(connection, dataString);
}
}
