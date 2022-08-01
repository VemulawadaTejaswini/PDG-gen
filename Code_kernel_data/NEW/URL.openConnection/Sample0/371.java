//370
public class func{
	public void call(){
                URL url = createURL(RestConstants.ADMIN_BUILD_VERSION_RESOURCE, Collections.EMPTY_MAP);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                             json.get(JsonTags.BUILD_VERSION));
}
}
