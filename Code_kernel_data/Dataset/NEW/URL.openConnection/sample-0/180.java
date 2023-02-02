//180
public class func{
public void testPathParam(){
    WebElement link = driver.findElement(By.id("link"));
    URL url = new URL(link.getAttribute("href"));
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(500, conn.getResponseCode());
}
}
