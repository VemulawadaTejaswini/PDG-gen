public class func{
public void isInternetAvailable(){
      final URL url = new URL("http://www.orientechnologies.com");
      final HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
      urlConn.setConnectTimeout(1000 * 10);
      urlConn.connect();
      if (urlConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        return true;
      }
}
}
