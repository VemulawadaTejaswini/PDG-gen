public class func{
public void openConnection(URL url){
    if (proxy != null) {
      return (HttpURLConnection) url.openConnection(proxy);
    } else {
      return (HttpURLConnection) url.openConnection();
    }
}
}
