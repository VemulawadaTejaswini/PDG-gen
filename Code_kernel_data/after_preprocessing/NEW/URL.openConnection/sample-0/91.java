//91
public class func{
public void testPostInvalidUsernamePassword(){
        URL url = new URL(container.getServletURL("/") + "?backurl=http://foo:11000/oozie&username=foo&password=bar");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        String html = getHTML(conn);
}
}
