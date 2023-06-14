public class func{
public void execute(TestParam values,ExecutionContext context){
            final URI uri = new URI("http://localhost:8080/path?query#fragment");
            final ClientHttpRequest request = values.clientHttpRequestFactory.createRequest(uri, HttpMethod.GET);
            final URI finalUri = request.getURI();
            assertEquals("http", finalUri.getScheme());
            assertEquals("localhost", finalUri.getHost());
            assertEquals("/path", finalUri.getPath());
            assertEquals(8080, finalUri.getPort());
            assertEquals("query", finalUri.getQuery());
            assertEquals("fragment", finalUri.getFragment());
            assertEquals(2, request.getHeaders().size());
            assertArrayEquals(new Object[]{"header1-v1", "header1-v2"}, request.getHeaders().get("header1").toArray());
            assertArrayEquals(new Object[]{"header2-value"}, request.getHeaders().get("header2").toArray());
}
}
