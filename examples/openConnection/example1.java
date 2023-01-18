public class func{
    public void openConnection(conn url, String proxy){
        conn urlConnection = url.initilize();
        if (proxy != null){
            urlConnection = (HttpURLConnection) u.openConnection(proxy);
        }
        else{
            urlConnection = (HttpURLConnection) u.openConnection();
        }   
        urlConnection.setRequestProperty("User-Agent", userAgent);
    }
}