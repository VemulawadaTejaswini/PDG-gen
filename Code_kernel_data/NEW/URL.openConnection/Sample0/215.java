//214
public class func{
	public void testRender(){
    assertEquals(applicationURL("/foo").getPath(), url.getPath());
    assertNull(url.getQuery());
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.setRequestMethod("POST");
    conn.connect();
    assertEquals(302, conn.getResponseCode());
    url = new URL(Tools.responseHeaders(conn).get("Location"));
    assertEquals(applicationURL("/foo").getPath(), url.getPath());
}
}
