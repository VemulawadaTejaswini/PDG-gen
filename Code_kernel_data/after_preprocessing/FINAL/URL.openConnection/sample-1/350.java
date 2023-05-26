public class func{
public void getURLResource(String config){
    URL url = new URL(config);
    if (exists(url)) {
      URLConnection con = url.openConnection();
      try {
        return con.getInputStream();
      }
      catch (IOException ex) {
        if (con instanceof HttpURLConnection) {
          ((HttpURLConnection) con).disconnect();
        }
        throw ex;
      }
    }
}
}
