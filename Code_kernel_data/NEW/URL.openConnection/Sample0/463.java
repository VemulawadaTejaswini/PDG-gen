//462
public class func{
	public void openHttpConnection(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(false);
}
}
