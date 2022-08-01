//165
public class func{
	public void getURLConnection(String filenameOrURI){
  if (conn == null)
  {
      URL url = new URL(filenameOrURI);
      return url.openConnection();
  }
  else
      return conn;
}
}
