//350
public class func{
public void getURLResource(String config){
    URL url = new URL(config);
    if (exists(url)) {
      URLConnection con = url.openConnection();
      try {
        return con.getInputStream();
      }
      catch (IOException ex) {
        // Close the HTTP connection (if applicable).
        if (con instanceof HttpURLConnection) {
          ((HttpURLConnection) con).disconnect();
        }
        throw ex;
      }
    }
}
}
