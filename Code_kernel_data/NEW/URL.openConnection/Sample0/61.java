//60
public class func{
	public void testGetMissingBackurl(){
        URL url = new URL(container.getServletURL("/"));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
        assertEquals("missing or invalid 'backurl' parameter", conn.getResponseMessage());
}
}
