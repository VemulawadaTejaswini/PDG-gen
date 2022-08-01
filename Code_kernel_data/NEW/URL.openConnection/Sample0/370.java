//369
public class func{
	public void call(){
                URL url = createURL(RestConstants.ADMIN_TIME_ZONES_RESOURCE, Collections.EMPTY_MAP);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertTrue(json.containsKey(JsonTags.AVAILABLE_TIME_ZONES));
                JSONArray array = (JSONArray) json.get(JsonTags.AVAILABLE_TIME_ZONES);
                assertFalse(array.isEmpty());
}
}
