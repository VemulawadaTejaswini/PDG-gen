//282
public class func{
	public void connect(String url,String sessionId){
        HttpURLConnection huc = (HttpURLConnection)new URL(url).openConnection();
        huc.setInstanceFollowRedirects(false);
        huc.setDoOutput(false);
}
}
