//93
public class func{
	public void shouldAccessInitialPage(){
        URL url = new URL("http://localhost:8090/modeshape-explorer");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int code = connection.getResponseCode();
        assertEquals(200, code);
}
}
