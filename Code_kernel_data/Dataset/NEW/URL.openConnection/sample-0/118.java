//118
public class func{
public void perform(){
                    final HttpURLConnection conn = (HttpURLConnection)new URL(baseURL, "auth").openConnection();
                    conn.setRequestProperty("Referer", "http:/geekseek.com");
                    conn.setInstanceFollowRedirects(false);
                    Assert.assertEquals(302, conn.getResponseCode());
                    Assert.assertEquals(conn.getHeaderField("Location"), "http:/geekseek.com");
}
}
