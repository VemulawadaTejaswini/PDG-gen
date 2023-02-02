//127
public class func{
public void testHdfsAccess(){
    URL url = new URL(TestJettyHelper.getJettyURL(),
                      MessageFormat.format("/webhdfs/v1/?user.name={0}&op=liststatus", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    reader.readLine();
    reader.close();
}
}
