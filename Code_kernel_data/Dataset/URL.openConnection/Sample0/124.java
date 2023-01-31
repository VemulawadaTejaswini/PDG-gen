//123
public class func{
	public void testHdfsAccess(){
    URL url = new URL(getJettyURL(), MessageFormat.format("/?user.name={0}&op=list", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    reader.readLine();
    reader.close();
}
}
