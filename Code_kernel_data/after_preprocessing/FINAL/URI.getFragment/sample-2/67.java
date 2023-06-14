public class func{
public void execute(TestParam values,ExecutionContext context){
            final URI uri = new URI("https://localhost:8443/path?query#fragment");
            final ClientHttpRequest request = values.clientHttpRequestFactory.createRequest(uri, HttpMethod.GET);
            final URI finalUri = request.getURI();
            assertEquals("http", finalUri.getScheme());
            assertEquals("127.0.0.1", finalUri.getHost());
            assertEquals("/path", finalUri.getPath());
            assertEquals(9999, finalUri.getPort());
            assertEquals("query", finalUri.getQuery());
            assertEquals("fragment", finalUri.getFragment());
            assertEquals(1, request.getHeaders().size());
            assertArrayEquals(new Object[]{"value"}, request.getHeaders().get("header1").toArray());
}
}
