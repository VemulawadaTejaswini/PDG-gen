//144
public class func{
	public void doRequest(OAuthClientRequest req){
        URL url = new URL(req.getLocationUri());
        HttpURLConnection c = (HttpURLConnection)url.openConnection();
        c.setInstanceFollowRedirects(true);
        c.connect();
        c.getResponseCode();
}
}
