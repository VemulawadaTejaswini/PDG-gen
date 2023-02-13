public class func{
public void testGetContentLength(){
            conn = (HttpURLConnection) (new URL(broadURLString)).openConnection();
            String contentLength = conn.getHeaderField("Content-length");
            assertEquals("249250621", contentLength);
            if (conn != null) {
                conn.disconnect();
            }
}
}
