//176
public class func{
	public void getHTTPConnection(String urlString,String httpMethod){
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setAllowUserInteraction(true);
        conn.addRequestProperty("Cookie", cookie);
        conn.setRequestMethod(httpMethod);
        connectWithRetry(conn);
}
}
