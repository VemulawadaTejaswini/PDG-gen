public class func{
public void testPartialRangeResponsesDoNotCorruptCache(){
        server.enqueue(new MockResponse().setBody("AA")
                .setResponseCode(HttpURLConnection.HTTP_PARTIAL)
                .addHeader("Expires: " + formatDate(1, TimeUnit.HOURS))
                .addHeader("Content-Range: bytes 1000-1001/2000"));
        server.enqueue(new MockResponse().setBody("BB"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection range = url.openConnection();
        range.addRequestProperty("Range", "bytes=1000-1001");
        assertEquals("AA", readAscii(range));
        assertEquals("BB", readAscii(url.openConnection()));
}
}
