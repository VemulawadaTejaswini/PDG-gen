public class func{
public void assertClientSuppliedCondition(MockResponse seed,String conditionName,String conditionValue){
        server.enqueue(new MockResponse().setResponseCode(HttpURLConnection.HTTP_NOT_MODIFIED));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.addRequestProperty(conditionName, conditionValue);
        assertEquals(HttpURLConnection.HTTP_NOT_MODIFIED, connection.getResponseCode());
        assertEquals("", readAscii(connection));
        return server.takeRequest();
}
}
