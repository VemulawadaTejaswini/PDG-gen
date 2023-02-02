//447
public class func{
	public void buildHttpConnection(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent", USER_AGENT);
        connection.setConnectTimeout(20000);
        connection.setReadTimeout(20000);
}
}
