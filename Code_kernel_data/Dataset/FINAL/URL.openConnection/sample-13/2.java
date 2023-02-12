public class func{
public void getContentAsString(URL url){
      URLConnection conn = url.openConnection();
      conn.connect();
      InputStream in = conn.getInputStream();
      Reader r = new InputStreamReader(in, "UTF-8");
}
}
