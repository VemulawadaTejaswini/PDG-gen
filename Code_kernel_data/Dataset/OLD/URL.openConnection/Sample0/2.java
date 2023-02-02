//1
public class func{
	public void testExtensionAuthFilter(){
    URL url = new URL("http://localhost:" + port + "/default");
    HttpURLConnection get = (HttpURLConnection) url.openConnection();
    get.setRequestProperty(DummyAuthFilter.AUTH_HDR, DummyAuthFilter.SECRET_USER);
    Assert.assertEquals(HttpServletResponse.SC_OK, get.getResponseCode());
    get = (HttpURLConnection) url.openConnection();
    get.setRequestProperty(DummyAuthFilter.AUTH_HDR, "hacker");
    Assert.assertEquals(HttpServletResponse.SC_UNAUTHORIZED, get.getResponseCode());
}
}
