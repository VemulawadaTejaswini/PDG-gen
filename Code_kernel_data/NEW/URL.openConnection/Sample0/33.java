//32
public class func{
	public void testWrongContentType(){
        URL url = new URL(endpointAddress);
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setReadTimeout(30000); // 30 seconds tops
        urlConnection.setConnectTimeout(30000); // 30 second tops
        urlConnection.addRequestProperty("Content-Type", "MissingSeparator");
        urlConnection.setRequestMethod("POST");
        assertEquals(415, urlConnection.getResponseCode());
}
}
