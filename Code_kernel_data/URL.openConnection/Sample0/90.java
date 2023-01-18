//89
public class func{
	public void doTestForbiddenMethods(int port,String method){
    URL url = new URL("http://0.0.0.0:" + String.valueOf(port) + "/metrics");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod(method);
    Assert.assertEquals(HttpServletResponse.SC_FORBIDDEN,
      conn.getResponseCode());
}
}
