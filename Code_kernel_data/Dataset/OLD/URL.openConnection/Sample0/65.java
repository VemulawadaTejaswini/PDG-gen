//64
public class func{
	public void testGetSuccess(){
        assertEquals(MessageFormat.format(loginPageTemplate, "", "", "http://foo:11000/oozie"), html);
        url = new URL(container.getServletURL("/") + "?backurl=http://foo:11000/oozie&username=foo");
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        html = getHTML(conn);
}
}
