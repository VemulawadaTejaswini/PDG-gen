public class func{
public void getURLConnection(URL url){
    URLConnection urlConnection = url.openConnection();
    urlConnection.setConnectTimeout(TIMEOUT_CONNECT);
    urlConnection.setReadTimeout(TIMEOUT_READ);
}
}
