//208
public class func{
	public void testFoo(){
    WebElement trigger = driver.findElement(By.id("trigger"));
    url = new URL(trigger.getAttribute("href"));
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    assertEquals(302, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    assertTrue(headers.containsKey("Location"));
    assertEquals("http://www.foobar.com", headers.get("Location"));
}
}
