//8
public class func{
	public void testDefaultExpirationDateFullyCachedForLessThan24Hours(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-105, TimeUnit.SECONDS))
                .addHeader("Date: " + formatDate(-5, TimeUnit.SECONDS))
                .setBody("A"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        URLConnection connection = url.openConnection();
        assertEquals("A", readAscii(connection));
        assertNull(connection.getHeaderField("Warning"));
}
}
