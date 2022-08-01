//366
public class func{
	public void call(){
                Map<String, String> map = new HashMap<String, String>();
                map.put(RestConstants.SHARE_LIB_REQUEST_KEY, "pig");
                URL url = createURL(RestConstants.ADMIN_LIST_SHARELIB, map);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals(null, json.get(JsonTags.SHARELIB_LIB));
}
}
