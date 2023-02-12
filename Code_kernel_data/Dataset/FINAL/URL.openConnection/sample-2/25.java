public class func{
public void openConnection(URL url,Proxy proxy){
    URLConnection urlConnection = (proxy != null ? url.openConnection(proxy) : url.openConnection());
    Assert.isInstanceOf(HttpURLConnection.class, urlConnection);
    return (HttpURLConnection) urlConnection;
}
}
