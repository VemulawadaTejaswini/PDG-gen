//65
public class func{
	public void testGetSuccess(){
        URL url = new URL(container.getServletURL("/") + "?backurl=http://foo:11000/oozie");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        String html = getHTML(conn);
}
}
