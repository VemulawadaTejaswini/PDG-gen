public class func{
public void openConnection(String path,String query){
      if (LOG.isTraceEnabled()) {
        LOG.trace("url=" + url);
      }
      return (HttpURLConnection)url.openConnection();
}
}
