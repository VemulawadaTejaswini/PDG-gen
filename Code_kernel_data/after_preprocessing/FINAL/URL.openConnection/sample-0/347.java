public class func{
public void AndroidHttpConnection(final String name,final int mode,final boolean timeouts){
      final URL url = new URL(name);
      connection = (HttpURLConnection) url.openConnection();
}
}
