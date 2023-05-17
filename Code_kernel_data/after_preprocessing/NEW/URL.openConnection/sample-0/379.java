//379
public class func{
public void call(){
                params.put("user", getTestUser());
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("content-type", RestConstants.XML_CONTENT_TYPE);
                conn.setDoOutput(true);
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
                String message = conn.getHeaderField(RestConstants.OOZIE_ERROR_MESSAGE);
                assertEquals("E0701", error);
}
}
