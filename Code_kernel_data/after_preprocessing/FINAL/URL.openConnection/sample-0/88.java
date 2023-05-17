public class func{
public void testMbw(String param){
        final TestWebServer testWebServer = createTestWebServer(new MyResource());
        int port = testWebServer.getPort();
        URL serverURL = new URL("http:
        HttpURLConnection connection = (HttpURLConnection) serverURL.openConnection();
        connection.setRequestMethod("GET");
        connection.addRequestProperty("Accept", "application/json, */*; q=.2");
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String line = br.readLine();
        Assert.assertEquals("{\"name\":\""+param+"\"}", line);
        testWebServer.stop();
}
}
