//24
public class func{
public void createConnection(){
      connection = (HttpURLConnection) (proxy == null ?
          url.openConnection() : url.openConnection(proxy));
      connection.setConnectTimeout(connectTimeout);
      connection.setReadTimeout(readTimeout);
}
}
