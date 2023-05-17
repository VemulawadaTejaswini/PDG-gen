public class func{
public void testPostInvalidUsernamePassword(){
        URL url = new URL(container.getServletURL("/") + "?backurl=http:
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        String html = getHTML(conn);
}
}
