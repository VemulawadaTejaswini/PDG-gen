//233
public class func{
public void openHttpURLConnection(String url){
        URL submitURL = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) submitURL.openConnection();
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.setReadTimeout(3000);
        httpURLConnection.setRequestProperty("Content-Language", "utf-8");
}
}
