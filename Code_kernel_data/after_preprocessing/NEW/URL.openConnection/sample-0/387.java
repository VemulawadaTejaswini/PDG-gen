//387
public class func{
public void verifyURLAvailable(URL url){
    if (null == url)
      return false;
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("HEAD");
      return (200 == connection.getResponseCode());
}
}
