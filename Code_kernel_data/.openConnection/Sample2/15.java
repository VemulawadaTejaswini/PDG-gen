//14
public class func{
	public void assertNotCached(MockResponse response){
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("B", readAscii(url.openConnection()));
}
}
