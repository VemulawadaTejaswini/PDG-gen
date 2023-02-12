public class func{
public void isInternetAccessible(int timeout){
      URLConnection c = new URL("http://www.google.com").openConnection();
      c.setConnectTimeout(timeout);
      ((HttpURLConnection)c).getResponseCode();
}
}
