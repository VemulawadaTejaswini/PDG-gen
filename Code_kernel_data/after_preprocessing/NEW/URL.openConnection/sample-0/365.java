//365
public class func{
public void _requestToServer(String bulkRequest){
        Map<String, String> params = new HashMap<String, String>();
        params.put(RestConstants.LEN_PARAM, "5");
        URL url = createURL("", params);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
        JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
        JSONArray array = (JSONArray) json.get(JsonTags.BULK_RESPONSES);
}
}
