//174
public class func{
	public void isConnectedToInternet(){
        String pingServerURL = pingBackUrl.substring(0, pingBackUrl.indexOf("/", "http://url".length()));
            URL url = new URL(pingServerURL);
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            urlConn.connect();
            return (HttpURLConnection.HTTP_NOT_FOUND != urlConn.getResponseCode());
}
}
