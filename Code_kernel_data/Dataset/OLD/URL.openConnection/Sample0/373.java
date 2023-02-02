//372
public class func{
	public void getSLAJSONResponse(Map<String,String> queryParams){
        URL url = createURL("", queryParams);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
        JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
        JSONArray array = (JSONArray) json.get(JsonTags.SLA_SUMMARY_LIST);
}
}
