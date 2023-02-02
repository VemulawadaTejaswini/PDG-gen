//4
public class func{
public void verifyRedirection(URL url){
    LOG.info("Verifying redirection of " + url);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(HttpURLConnection.HTTP_MOVED_TEMP, conn.getResponseCode());
    conn.disconnect();
    URL redirectedUrl = new URL(conn.getHeaderField("Location"));
    conn = (HttpURLConnection) redirectedUrl.openConnection();
    conn.connect();
    assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
    conn.disconnect();
}
}
