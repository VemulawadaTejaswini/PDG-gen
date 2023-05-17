public class func{
public void newHttpConnection(URL url){
      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestProperty("User-Agent", userAgent);
}
}
