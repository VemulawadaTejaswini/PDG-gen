public class func{
public void testWeather7(){
    WebElement link = driver.findElement(By.tagName("link"));
    String href = link.getAttribute("href");
    url = new URL(href);
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
}
}
