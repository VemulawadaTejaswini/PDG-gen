//191
public class func{
	public void getUrlAsDocument(String urlAsString,int timeout){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection();
        hConn.setReadTimeout(timeout);
        hConn.setConnectTimeout(timeout);
        InputStream is = hConn.getInputStream();
}
}
