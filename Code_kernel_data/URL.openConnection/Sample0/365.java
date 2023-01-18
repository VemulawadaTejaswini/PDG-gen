//364
public class func{
	public void call(){
                final String id = bundleJobBean.getId();
                URL url = createURL(id, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject obj = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals(id, obj.get("bundleJobId"));
}
}
