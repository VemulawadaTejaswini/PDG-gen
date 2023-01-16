//354
public class func{
	public void testLongHeader(){
    URL url = new URL(baseUrl, "/longheader");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    testLongHeader(conn);
}
}
