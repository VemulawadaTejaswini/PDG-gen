//446
public class func{
	public void openConnection(URL url){
        if (conn == null) {
            conn = (HttpURLConnection) url.openConnection();
        }
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(25000);
}
}
