//391
public class func{
	public void call(){
                Map<String, String> params = new HashMap<String, String>();
                params.put(RestConstants.JOB_SHOW_PARAM, RestConstants.JOB_SHOW_GRAPH);
                URL url = createURL(MockDagEngineService.JOB_ID + 1 + MockDagEngineService.JOB_ID_END, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
                assertEquals(ErrorCode.E0306.name(), conn.getHeaderField(RestConstants.OOZIE_ERROR_CODE));
}
}
