public class func{
public void call(){
                Map<String, String> params = new HashMap<String, String>();
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONArray array = (JSONArray) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals(2, array.size());
                assertEquals(OozieClient.WS_PROTOCOL_VERSION, array.get(1));
}
}
