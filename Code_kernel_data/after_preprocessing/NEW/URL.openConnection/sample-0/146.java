//146
public class func{
public void perform(){
                    final HttpURLConnection conn = (HttpURLConnection)new URL(baseURL, "auth").openConnection();
                    conn.setInstanceFollowRedirects(false);
                    Assert.assertEquals(400, conn.getResponseCode());
}
}
