//3
public class func{
public void testPostMissingBackurl(){
        URL url = new URL(container.getServletURL("/"));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
        assertEquals("missing or invalid 'backurl' parameter", conn.getResponseMessage());
        url = new URL(container.getServletURL("/") + "?username=foo&password=bar");
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
        assertEquals("missing or invalid 'backurl' parameter", conn.getResponseMessage());
}
}
