public class func{
public void init(){
      URL url = new URL(urlstr);
      HttpURLConnection connection = (HttpURLConnection) url
          .openConnection();
      connection.setConnectTimeout(30000);
      connection.setRequestMethod("GET");
      fileSize = connection.getContentLength();
}
}
