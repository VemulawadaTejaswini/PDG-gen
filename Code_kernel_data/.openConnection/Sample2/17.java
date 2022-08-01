//16
public class func{
	public void testServerReturnsDocumentOlderThanCache(){
        server.enqueue(new MockResponse().setBody("B")
                .addHeader("Last-Modified: " + formatDate(-4, TimeUnit.HOURS)));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("A", readAscii(url.openConnection()));
}
}
