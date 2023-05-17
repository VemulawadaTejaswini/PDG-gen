public class func{
public void testAuthorizationRequestHeaderPreventsCaching(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-2, TimeUnit.MINUTES))
                .addHeader("Cache-Control: max-age=60")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection = url.openConnection();
        connection.addRequestProperty("Authorization", "password");
        assertEquals("A", readAscii(connection));
        assertEquals("B", readAscii(url.openConnection()));
}
}
