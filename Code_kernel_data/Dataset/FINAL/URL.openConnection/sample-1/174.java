public class func{
public void isInternetAccessible(int timeout){
      URLConnection c = new URL("http:
      c.setConnectTimeout(timeout);
      ((HttpURLConnection)c).getResponseCode();
}
}
