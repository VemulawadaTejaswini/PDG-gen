//304
public class func{
	public void useWireMock(){
        URL uri = new URL("http://localhost:8080/blah");
        InputStream content = uri.openConnection().getInputStream();
        final String retrievedBody = IOUtils.toString(content);
        assertEquals("body", retrievedBody);
        assertThat(stdOutCapture.toString(), containsString("c.g.t.wiremock.common.Log4jNotifier - Received request to /mappings/new"));
}
}
