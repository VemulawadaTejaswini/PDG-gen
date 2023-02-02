//267
public class func{
public void testPathParam(){
    WebElement trigger = driver.findElement(By.tagName("body"));
    URL url = new URL(trigger.getText());
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.connect();
}
}
