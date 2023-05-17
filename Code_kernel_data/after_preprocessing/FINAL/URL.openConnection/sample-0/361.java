public class func{
public void call(){
                params.put("user", getTestUser());
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("content-type", RestConstants.XML_CONTENT_TYPE);
                conn.setDoOutput(true);
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                JSONObject obj = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals("Valid workflow-app", obj.get(JsonTags.VALIDATE));
}
}
