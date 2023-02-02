//116
public class func{
	public void testOnlyPartOfBlobServedWhenResponseContainsBlobRangeHeader(@ArquillianResource URL url){
        URL pageUrl = new URL(url, "serveblob?name=testrange.txt&mimeType=text/plain&contents=" + CONTENTS + "&blobRange=bytes=2-5");
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            String response = readFullyAndClose(connection.getInputStream());
            assertEquals(PARTIAL_CONTENT, connection.getResponseCode());
            assertEquals("bytes 2-5/26", connection.getHeaderField("Content-Range"));
            assertEquals(CONTENTS.substring(2, 5 + 1), response);
            assertNull("header should have been removed from response", connection.getHeaderField("X-AppEngine-BlobRange"));
            connection.disconnect();
}
}
