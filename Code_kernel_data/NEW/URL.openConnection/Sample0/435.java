//434
public class func{
	public void call(){
                Map<String, String> params = new HashMap<String, String>();
                params.put(RestConstants.LEN_PARAM, "5");
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
}
}
