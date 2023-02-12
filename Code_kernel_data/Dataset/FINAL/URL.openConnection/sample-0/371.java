public class func{
public void call(){
                final String id = bundleJobBean.getId();
                URL url = createURL(id, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                String ct = conn.getHeaderField("content-type");
                assertTrue(ct.startsWith(RestConstants.XML_CONTENT_TYPE));
                String response = IOUtils.getReaderAsString(new InputStreamReader(conn.getInputStream()), -1);
                assertTrue(response!= null && response.length() > 0);
}
}
