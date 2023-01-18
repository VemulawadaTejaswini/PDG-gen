//11
public class func{
	public void assertAuthorizationRequestFullyCached(MockResponse response){
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection = url.openConnection();
        connection.addRequestProperty("Authorization", "password");
        assertEquals("A", readAscii(connection));
        assertEquals("A", readAscii(url.openConnection()));
}
}
