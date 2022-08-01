//103
public class func{
	public void isLocalCommunityServerRunning(){
            HttpURLConnection conn = (HttpURLConnection) new URL("http://" + TEST_COMMUNITY_SERVER
                    + "/community").openConnection();
            if (conn.getResponseCode() == HttpServletResponse.SC_BAD_REQUEST) {
                return true;
            }
            conn.disconnect();
}
}
