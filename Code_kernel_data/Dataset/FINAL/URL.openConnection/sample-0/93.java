public class func{
public void shouldAccessInitialPage(){
        URL url = new URL("http:
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int code = connection.getResponseCode();
        assertEquals(200, code);
}
}
