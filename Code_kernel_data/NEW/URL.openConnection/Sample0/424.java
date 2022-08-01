//423
public class func{
	public void assertServletReturnsResponseCode(int responseCode,URL pageUrl){
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            assertEquals(responseCode, connection.getResponseCode());
            connection.disconnect();
}
}
