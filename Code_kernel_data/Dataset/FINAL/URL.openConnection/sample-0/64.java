public class func{
public void testGetSuccess(){
        assertEquals(MessageFormat.format(loginPageTemplate, "", "", "http:
        url = new URL(container.getServletURL("/") + "?backurl=http:
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        html = getHTML(conn);
}
}
