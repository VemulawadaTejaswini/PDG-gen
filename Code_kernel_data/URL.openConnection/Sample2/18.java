//17
public class func{
	public void testCachePlusCookies(){
        server.enqueue(new MockResponse()
                .addHeader("Set-Cookie: a=SECOND; domain=" + server.getCookieDomain() + ";")
                .setResponseCode(HttpURLConnection.HTTP_NOT_MODIFIED));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertCookies(url, "a=FIRST");
        assertEquals("A", readAscii(url.openConnection()));
        assertCookies(url, "a=SECOND");
}
}
