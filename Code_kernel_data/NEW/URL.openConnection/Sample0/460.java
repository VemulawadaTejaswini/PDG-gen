//459
public class func{
	public void open(URL url){
        HttpURLConnection c = (HttpURLConnection)url.openConnection();
        c.setReadTimeout(TIMEOUT);
        c.setConnectTimeout(TIMEOUT);
}
}
