public class func{
public void testPathParam(){
    String pass = driver.findElement(By.tagName("body")).getText();
    assertEquals("juu", pass);
    url = applicationURL("/foo/bar");
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
}
}
