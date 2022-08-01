//85
public class func{
	public void testBlobRangeEndGreaterThanContentSize(@ArquillianResource URL url){
        URL pageUrl = new URL(url, "serveblob?name=testrangeend.txt&mimeType=text/plain&contents=" + CONTENTS + "&blobRange=bytes=2-1000");
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            String response = readFullyAndClose(connection.getInputStream());
            assertEquals(PARTIAL_CONTENT, connection.getResponseCode());
            assertEquals("bytes 2-25/26", connection.getHeaderField("Content-Range"));
            assertEquals(CONTENTS.substring(2), response);
            connection.disconnect();
}
}
