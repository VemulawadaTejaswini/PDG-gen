//382
public class func{
	public void call(){
                Map<String, String> params = new HashMap<String, String>();
                params.put(RestConstants.ACTION_PARAM, RestConstants.JOB_ACTION_START);
                URL url = createURL(MockCoordinatorEngineService.JOB_ID + 1, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("PUT");
                conn.setRequestProperty("content-type", RestConstants.XML_CONTENT_TYPE);
                conn.setDoOutput(true);
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
                assertEquals(null, MockCoordinatorEngineService.did);
}
}
