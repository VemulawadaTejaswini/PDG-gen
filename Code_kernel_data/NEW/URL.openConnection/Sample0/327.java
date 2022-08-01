//326
public class func{
	public void syndFeed(){
        URL feedUrl = new URL(_url);
        HttpURLConnection feedConn = (HttpURLConnection) feedUrl.openConnection();
        feedConn.addRequestProperty("User-Agent", "Mozilla/5.001 (windows; U; NT4.0; en-us) Gecko/25250101");
}
}
