public class func{
public void analyseFileUrl(URL url){
      URLConnection conn = url.openConnection();
      conn.connect();
      conn.getInputStream();
}
}
