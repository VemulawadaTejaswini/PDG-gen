//118
public class func{
	public void testNullValueForInjectionPoint(@ArquillianResource(TestServlet.class) URL baseURL){
        final URL url = new URL(baseURL, "ProducerNullIPServlet");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        assertEquals(reader.readLine(), "Test Sucessful!");
}
}
