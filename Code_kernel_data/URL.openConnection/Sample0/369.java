//368
public class func{
	public void call(){
                URL url = createURL(RestConstants.ADMIN_JAVA_SYS_PROPS_RESOURCE, Collections.EMPTY_MAP);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertTrue(json.containsKey("java.version"));
}
}
