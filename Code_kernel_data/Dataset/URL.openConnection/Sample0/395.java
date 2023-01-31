//394
public class func{
	public void call(){
                final String id = bundleJobBean.getId();
                URL url = createURL(id, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("PUT");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
}
}
