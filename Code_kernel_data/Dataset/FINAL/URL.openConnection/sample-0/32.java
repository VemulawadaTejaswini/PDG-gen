public class func{
public void testWrongContentType(){
        URL url = new URL(endpointAddress);
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setReadTimeout(30000);
        urlConnection.setConnectTimeout(30000);
        urlConnection.addRequestProperty("Content-Type", "MissingSeparator");
        urlConnection.setRequestMethod("POST");
        assertEquals(415, urlConnection.getResponseCode());
}
}
