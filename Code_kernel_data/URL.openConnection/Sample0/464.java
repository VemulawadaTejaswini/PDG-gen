//463
public class func{
	public void getHttpURLConnection(URL url){
    if (proxy != null) {
      return (HttpURLConnection) url.openConnection(proxy);
    } else {
      return (HttpURLConnection) url.openConnection();
    }
}
}
