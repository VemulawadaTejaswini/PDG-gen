//539
public class func{
	public void getLocation(final URL url){
    URLConnection connection = url.openConnection();
    if(connection instanceof HttpURLConnection){
      int responseCode = ((HttpURLConnection)connection).getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_MOVED_TEMP
        || responseCode == HttpURLConnection.HTTP_MOVED_PERM
          || responseCode == HttpURLConnection.HTTP_SEE_OTHER){
        String redirectUrl = connection.getHeaderField("Location");
        return getLocation(new URL(redirectUrl));
      }
    }
}
}
