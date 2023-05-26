//4
public class func{
public void testRequestCacheControlNoCache(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-120, TimeUnit.SECONDS))
                .addHeader("Date: " + formatDate(0, TimeUnit.SECONDS))
                .addHeader("Cache-Control: max-age=60")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("Cache-Control", "no-cache");
        assertEquals("B", readAscii(connection));
}
}
