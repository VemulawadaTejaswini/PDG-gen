//5
public class func{
public void testVaryMatchesChangedRequestHeaderField(){
        server.enqueue(new MockResponse()
                .addHeader("Cache-Control: max-age=60")
                .addHeader("Vary: Accept-Language")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        HttpURLConnection frConnection = (HttpURLConnection) url.openConnection();
        frConnection.addRequestProperty("Accept-Language", "fr-CA");
        assertEquals("A", readAscii(frConnection));
        HttpURLConnection enConnection = (HttpURLConnection) url.openConnection();
        enConnection.addRequestProperty("Accept-Language", "en-US");
        assertEquals("B", readAscii(enConnection));
}
}
