public class func{
public void checkUrl(String url){
      URLConnection connection = new URL(url).openConnection();
        return connection.getURL().toString();
}
}
