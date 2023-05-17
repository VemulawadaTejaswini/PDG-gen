//46
public class func{
public void testPutNoOperation(){
    URL url = new URL(TestJettyHelper.getJettyURL(),
                      MessageFormat.format("/webhdfs/v1/foo?user.name={0}", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod("PUT");
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_BAD_REQUEST);
}
}
