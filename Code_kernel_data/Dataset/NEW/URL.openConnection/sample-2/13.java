//13
public class func{
public void testNoDefaultExpirationForUrlsWithQueryString(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-105, TimeUnit.SECONDS))
                .addHeader("Date: " + formatDate(-5, TimeUnit.SECONDS))
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/?foo=bar");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("B", readAscii(url.openConnection()));
}
}
