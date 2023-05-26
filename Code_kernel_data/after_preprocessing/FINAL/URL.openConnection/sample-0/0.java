public class func{
public void openConnection(String url){
    if (proxy != null)
      urlConnection = (HttpURLConnection) u.openConnection(proxy);
    else
      urlConnection = (HttpURLConnection) u.openConnection();
    urlConnection.setRequestProperty("User-Agent", userAgent);
}
}
