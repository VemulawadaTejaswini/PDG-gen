//15
public class func{
public void getURL(URL url){
      URLConnection conn = url.openConnection();
      return toByteArray(conn.getInputStream());
}
}
