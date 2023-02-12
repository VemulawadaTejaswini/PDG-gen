public class func{
public void testPostSuccess(){
        URL url = new URL(container.getServletURL("/") + "?backurl=about:blank&username=foo&password=foo");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_FOUND, conn.getResponseCode());
        String cookies = getCookies(conn);
        String username = getUsernameFromCookies(cookies);
        assertEquals("foo", username);
}
}
