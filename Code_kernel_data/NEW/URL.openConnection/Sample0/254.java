//253
public class func{
	public void testBlobServedWhenResponseContainsBlobKeyHeader(@ArquillianResource URL url){
        URL pageUrl = new URL(url, "serveblob?name=testblob.txt&mimeType=" + MIME_TYPE + "&contents=" + CONTENTS);
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            String response = readFullyAndClose(connection.getInputStream());
            assertEquals(MIME_TYPE, connection.getContentType());
            assertEquals(CONTENTS, response);
            assertNull("header should have been removed from response", connection.getHeaderField("X-AppEngine-BlobKey"));
            connection.disconnect();
}
}
