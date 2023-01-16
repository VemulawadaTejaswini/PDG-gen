//211
public class func{
	public void doInBackground(String... strings){
                URL url = new URL(targetUrl);
                HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
                conn.connect();
                int code = conn.getResponseCode();
}
}
