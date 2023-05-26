public class func{
public void openStreamFromURL(URL url,int timeout){
    if (url == null) {
      throw new IllegalArgumentException("url must not be null!");
    }
    URLConnection connection = url.openConnection();
    connection.setConnectTimeout(timeout);
    connection.setReadTimeout(timeout);
        return connection.getInputStream();
}
}
