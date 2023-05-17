public class func{
public void create(String url,@Nullable Proxy proxy){
        URLConnection urlConnection = proxy == null ? _url.openConnection() : _url.openConnection(proxy);
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        if (urlConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            httpURLConnection.setRequestMethod("GET");
        }
}
}
