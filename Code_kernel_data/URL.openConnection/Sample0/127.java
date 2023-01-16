//126
public class func{
	public void testGlobFilter(){
    URL url = new URL(getJettyURL(), MessageFormat.format("/?user.name={0}&op=list&filter=f*", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    reader.readLine();
    reader.close();
}
}
