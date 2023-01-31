//224
public class func{
	public void testInvalidadHttpFSAccess(){
    URL url = new URL(TestJettyHelper.getJettyURL(),
                      "/webhdfs/v1/?op=GETHOMEDIRECTORY");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(),
                        HttpURLConnection.HTTP_UNAUTHORIZED);
}
}
