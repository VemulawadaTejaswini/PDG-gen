//136
public class func{
public void readURLAsBytes(URL url){
      URLConnection conn = url.openConnection();
      conn.setUseCaches(false);
      return readURLConnectionAsBytes(conn);
}
}
