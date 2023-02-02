//251
public class func{
	public void httpCall(){
      URL url1 = new URL(url);
      connection = (HttpURLConnection)url1.openConnection();
      System.out.println("using proxy: " + connection.usingProxy());
      if (connection != null) {
        connection.disconnect();
      }
}
}
