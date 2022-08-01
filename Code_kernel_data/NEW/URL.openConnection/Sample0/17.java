//16
public class func{
	public void connect(String urlStr){
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Connection", "Keep-Alive");
        conn.connect();
        System.out.println(conn.getResponseCode() + ":" + conn.getResponseMessage());
}
}
