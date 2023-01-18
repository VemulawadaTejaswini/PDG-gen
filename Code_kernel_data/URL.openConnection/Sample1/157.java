//156
public class func{
	public void fetchUrl(String url,int expectedResponseCode){
        URLConnection conn = new URL(url).openConnection();
        Assert.assertTrue("URLConenction is not HttpURLConnection: " + conn, conn instanceof HttpURLConnection);
        HttpURLConnection connection = (HttpURLConnection) conn;
        connection.connect();
            int responseCode = connection.getResponseCode();
            assertEquals(url, expectedResponseCode, responseCode);
            return (responseCode == OK) ? getContent(conn) : null;
}
}
