//149
public class func{
	public void getConnection(String query){
        postURL = new URL(query);
        HttpURLConnection conn = (HttpURLConnection) postURL.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setAllowUserInteraction(false);
}
}
