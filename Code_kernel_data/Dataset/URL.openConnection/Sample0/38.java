//37
public class func{
	public void testUrlReachable(String strUtl){
        URL url = new URL(strUtl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int rc = conn.getResponseCode();
        assertEquals(HttpStatus.SC_OK, rc);
        conn.disconnect();
}
}
