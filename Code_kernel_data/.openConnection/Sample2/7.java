//6
public class func{
	public void testVaryMatchesUnchangedRequestHeaderField(){
        server.enqueue(new MockResponse()
                .addHeader("Cache-Control: max-age=60")
                .addHeader("Vary: Accept-Language")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection1 = url.openConnection();
        connection1.addRequestProperty("Accept-Language", "fr-CA");
        assertEquals("A", readAscii(connection1));
        URLConnection connection2 = url.openConnection();
        connection2.addRequestProperty("Accept-Language", "fr-CA");
        assertEquals("A", readAscii(connection2));
}
}
