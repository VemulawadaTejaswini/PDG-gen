//90
public class func{
	public void testJetty(){
    URL url = new URL(getJettyURL(), "/bar");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    Assert.assertEquals(reader.readLine(), "foo");
    reader.close();
}
}
