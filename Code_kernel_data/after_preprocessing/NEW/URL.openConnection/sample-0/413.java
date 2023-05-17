//413
public class func{
public void testRender(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.connect();
    assertEquals(404, conn.getResponseCode());
    url = applicationURL("/foo");
    driver.get(url.toString());
}
}
