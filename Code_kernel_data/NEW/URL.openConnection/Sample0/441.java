//440
public class func{
	public void openConnection(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty(HDR_X_FORWARDED_SSL, "on");
        conn.connect();
}
}
