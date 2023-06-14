public class func{
public void testEnforceSlash(){
        final TestWebServer testWebServer = createTestWebServer(new MyResource());
        int port = testWebServer.getPort();
        URL serverURL = new URL("http://localhost:" + port + "/foo/bar");
        HttpURLConnection connection = (HttpURLConnection) serverURL.openConnection();
        connection = (HttpURLConnection) serverURL.openConnection();
        connection.setRequestMethod("GET");
        connection.addRequestProperty("Accept", "text/html, */*; q=.2");    
        Assert.assertEquals(204, connection.getResponseCode());
}
}
