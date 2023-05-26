public class func{
public void isLocalCommunityServerRunning(){
            HttpURLConnection conn = (HttpURLConnection) new URL("http:
                    + "/community").openConnection();
            if (conn.getResponseCode() == HttpServletResponse.SC_BAD_REQUEST) {
                return true;
            }
            conn.disconnect();
}
}
