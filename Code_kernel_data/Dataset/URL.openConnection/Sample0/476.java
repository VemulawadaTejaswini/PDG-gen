//475
public class func{
	public void getConnection(URL url){
        HttpURLConnection c = (HttpURLConnection) url.openConnection();
        c.setInstanceFollowRedirects(followRedirects);
}
}
