//458
public class func{
	public void performHeadHTTPMethod(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setUseCaches(false);
        conn.setAllowUserInteraction(true);
        conn.setRequestProperty("Connection", "Keep-Alive");
}
}
