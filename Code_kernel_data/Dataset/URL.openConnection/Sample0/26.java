//25
public class func{
	public void runClient(String urlStr){
        HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
        conn.setRequestMethod("HEAD");
        int status = conn.getResponseCode();
        if (status != 200) {
            throw new RuntimeException("HEAD request doesn't return 200, but returns " + status);
        }
}
}
