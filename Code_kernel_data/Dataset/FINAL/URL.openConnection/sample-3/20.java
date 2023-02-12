public class func{
public void openStreamFromURL(URL url){
    if (url == null) {
      throw new IllegalArgumentException("url must not be null!");
    }
    URLConnection connection = url.openConnection();
        setURLConnectionDefaults(connection);
        return connection.getInputStream();
}
}
